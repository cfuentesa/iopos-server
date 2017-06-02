package cl.iopos.server.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.iopos.server.core.dto.SupplierDTO;
import cl.iopos.server.core.dto.WarehouseDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class SupplierListBean implements Serializable {

	private static final long serialVersionUID = -4606929712359433222L;

	final Logger logger = LoggerFactory.getLogger(getClass());

	@ManagedProperty(value="#{productService}")
	private ProductService productService;

	private List<SupplierDTO> suppliers;
	
	private SupplierDTO supplierSelected;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public List<SupplierDTO> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<SupplierDTO> suppliers) {
		this.suppliers = suppliers;
	}

	public SupplierDTO getSupplierSelected() {
		return supplierSelected;
	}

	public void setSupplierSelected(SupplierDTO supplierSelected) {
		this.supplierSelected = supplierSelected;
	}
	
	@PostConstruct
	public void init(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("supplierId");
		try {
			this.suppliers = this.productService.supplierFindByCompany(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String actionEdit(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("supplierId", this.supplierSelected.getId().toString());
		return "actionSupplierEdit";
	}

}
