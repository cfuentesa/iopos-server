package cl.iopos.server.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.iopos.server.core.dto.CategoryDTO;
import cl.iopos.server.core.dto.ProductDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class ProductEditBean implements Serializable {

	private static final long serialVersionUID = -1254509017907284780L;
	
	final Logger logger = LoggerFactory.getLogger(getClass());
	@ManagedProperty(value="#{productService}")
	private ProductService productService;
    private ProductDTO product;
	private List<SelectItem> siCategories = new ArrayList<SelectItem>();
	private Boolean isAddProduct;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public List<SelectItem> getSiCategories() {
		return siCategories;
	}

	public void setSiCategories(List<SelectItem> siCategories) {
		this.siCategories = siCategories;
	}

	public Boolean getIsAddProduct() {
		return isAddProduct;
	}

	public void setIsAddProduct(Boolean isAddProduct) {
		this.isAddProduct = isAddProduct;
	}

	@PostConstruct
	public void init(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		
		String param = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("productId");
		
		if (param != null){
			Integer productId = Integer.valueOf(param);
			try {
				this.product = this.productService.productFindById(productId);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(this.product.getPriceA());
			this.isAddProduct = false;
		} else {
			this.product = new ProductDTO();
			this.product.setEnable(true);
			this.isAddProduct = true;
		}
		
		try {
			List<CategoryDTO> categories = this.productService.categoryFindAll();
			for (CategoryDTO dto : categories) {
				SelectItem si = new SelectItem();
				si.setLabel(dto.getDescription());
				si.setValue(dto.getId());
				this.siCategories.add(si);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void actionAdd(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		
		try {
			this.productService.createProduct(this.product);
			
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Successful",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Successful",  "Your message: " + "hola") );
		}

	}
	
	public void actionUpdate(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		
		try {
			this.productService.updateProduct(this.product);

	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Error!",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",  "Your message: " + "hola") );
		}
	}

}
