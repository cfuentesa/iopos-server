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

import cl.iopos.server.core.dto.EmployeeDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class EmployeeEditBean implements Serializable {

	private static final long serialVersionUID = 5276137410702379908L;
	final Logger logger = LoggerFactory.getLogger(getClass());
	@ManagedProperty(value="#{productService}")
	private ProductService productService;
	private EmployeeDTO employee;
	private Boolean isAdd;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public EmployeeDTO getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}

	public Boolean getIsAdd() {
		return isAdd;
	}

	public void setIsAdd(Boolean isAdd) {
		this.isAdd = isAdd;
	}

	@PostConstruct
	public void init(){
		String param = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("employeeId");
		if (param != null){
			try {
				Integer employeeId = Integer.valueOf(param);
				this.employee = this.productService.employeeFindById(employeeId);
				this.isAdd = false;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			this.employee = new EmployeeDTO();
			this.employee.setGender("M");
			this.isAdd = true;
		}
	}
		
	public void actionAdd(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.employee.setCompanyId(1);
			this.productService.createEmployee(this.employee);
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",  e.getMessage()) );
		}
	}
	
	public void actionUpdate(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.productService.updateEmployee(this.employee);
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Error",  e.getMessage()) );
		}
	}

}
