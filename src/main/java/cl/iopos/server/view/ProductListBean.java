package cl.iopos.server.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import cl.iopos.server.core.dto.ProductDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class ProductListBean {
	
	@ManagedProperty(value="#{productService}")
	private ProductService productService;
    private List<ProductDTO> products;
    private ProductDTO productSelected;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

	public ProductDTO getProductSelected() {
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		return productSelected;
	}

	public void setProductSelected(ProductDTO productSelected) {
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		if (productSelected != null) System.out.println("id: " + productSelected.getId().toString());
		this.productSelected = productSelected;
	}

	@PostConstruct
	public void init(){
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("productId");
		try {
			this.products = this.productService.productFindByCompany(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String actionProduct(){
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("productId", this.productSelected.getId().toString());
		return "actionProductEdit";
	}
	
	public List<ProductDTO> getProductListAll() {
		try {
			return this.productService.productFindAll();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
