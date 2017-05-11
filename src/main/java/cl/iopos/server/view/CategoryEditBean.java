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

import cl.iopos.server.core.dto.CategoryDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class CategoryEditBean implements Serializable {

	private static final long serialVersionUID = 5267212144134107094L;
	
	final Logger logger = LoggerFactory.getLogger(getClass());
	
	@ManagedProperty(value="#{productService}")
	private ProductService productService;
    
	private CategoryDTO category;
    
	private Boolean isAddCategory;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategorySelected(CategoryDTO category) {
		this.category = category;
	}

	public Boolean getIsAddCategory() {
		return isAddCategory;
	}

	public void setIsAddCategory(Boolean isAddCategory) {
		this.isAddCategory = isAddCategory;
	}

	@PostConstruct
	public void init(){
		String param = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("categoryId");
		if (param != null){
			try {
				Integer categoryId = Integer.valueOf(param);
				this.category = this.productService.categoryFindById(categoryId);
				System.out.println(this.category.getDescription());
				this.isAddCategory = false;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			this.category = new CategoryDTO();
			this.isAddCategory = true;
		}
	}

	public void actionAddCategory(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.productService.createCategory(this.category);
			
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error",  e.getMessage()) );
		}

	}
	
	public void actionUpdateCategory() {
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.productService.updateCategory(this.category);
			
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error",  e.getMessage()) );
		}
	}

}
