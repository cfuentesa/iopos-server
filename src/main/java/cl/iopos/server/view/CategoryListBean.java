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

import cl.iopos.server.core.dto.CategoryDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class CategoryListBean implements Serializable {

	private static final long serialVersionUID = -2596763555733694040L;
	
	final Logger logger = LoggerFactory.getLogger(getClass());
	
	@ManagedProperty(value="#{productService}")
	private ProductService productService;
    
	private List<CategoryDTO> categories;
    
	private CategoryDTO categorySelected;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}

	public CategoryDTO getCategorySelected() {
		return categorySelected;
	}

	public void setCategorySelected(CategoryDTO categorySelected) {
		this.categorySelected = categorySelected;
	}

	@PostConstruct
	public void init(){
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("categoryId");
			this.categories = this.productService.categoryFindByCompany(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String actionEditCategory(){
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("categoryId", this.categorySelected.getId().toString());
		return "actionCategoryEdit";
	}

}
