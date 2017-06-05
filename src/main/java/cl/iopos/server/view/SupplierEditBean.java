package cl.iopos.server.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.iopos.server.core.dto.SupplierDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class SupplierEditBean implements Serializable {

	private static final long serialVersionUID = -3953417587759779413L;

	final Logger logger = LoggerFactory.getLogger(getClass());

	@ManagedProperty(value="#{productService}")
	private ProductService productService;

	private SupplierDTO supplier;
	
	private Boolean isAdd;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public SupplierDTO getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierDTO supplier) {
		this.supplier = supplier;
	}

	public Boolean getIsAdd() {
		return isAdd;
	}

	public void setIsAdd(Boolean isAdd) {
		this.isAdd = isAdd;
	}
	
	@PostConstruct
	public void init(){
		String param = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("supplierId");
		if (param != null){
			try {
				Integer id = Integer.valueOf(param);
				this.supplier = this.productService.supplierFindbyId(id);
				this.isAdd = false;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			this.supplier = new SupplierDTO();
			this.supplier.setActive(true);
			this.isAdd = true;
		}
	}

	public void actionAdd() {
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.supplier.setCompanyId(1);
			this.supplier = this.productService.createSupplier(this.supplier);
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "hola") );
	        this.isAdd = false;
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",  e.getMessage()) );
		}
	}
	
	public void actionUpdate() {
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.productService.updateSupplier(this.supplier);
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error",  e.getMessage()) );
		}
	}
	
	public String actionCancel() {
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		return "actionSupplierList";
	}

}
