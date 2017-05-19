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

import cl.iopos.server.core.dto.EmployeeDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class EmployeeListBean implements Serializable {

	private static final long serialVersionUID = 3656644696346907148L;

	final Logger logger = LoggerFactory.getLogger(getClass());
	
	@ManagedProperty(value="#{productService}")
	private ProductService productService;
    
	private List<EmployeeDTO> employees;
    
	private EmployeeDTO employeeSelected;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public List<EmployeeDTO> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeDTO> empolyees) {
		this.employees = empolyees;
	}

	public EmployeeDTO getEmployeeSelected() {
		return employeeSelected;
	}

	public void setEmployeeSelected(EmployeeDTO employeeSelected) {
		this.employeeSelected = employeeSelected;
	}

	@PostConstruct
	public void init(){
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("employeeId");
			this.employees = this.productService.employeeFindByCompany(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String actionEditCategory(){
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("employeeId", this.employeeSelected.getId().toString());
		return "actionEmployeeEdit";
	}

}
