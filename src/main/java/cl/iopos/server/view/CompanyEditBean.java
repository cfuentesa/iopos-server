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

import cl.iopos.server.core.dto.CompanyDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class CompanyEditBean implements Serializable {

	private static final long serialVersionUID = 2825611354619971427L;
	final Logger logger = LoggerFactory.getLogger(getClass());
	@ManagedProperty(value="#{productService}")
	private ProductService productService;
	private CompanyDTO company;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	@PostConstruct
	public void init(){
		try {
			this.company = this.productService.companyFindById(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void actionUpdateCompany(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.productService.updateCompany(this.company);
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",  "Your message: " + "hola") );
		}
	}
	
	public void actionUpdateCompanyTaxs(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.productService.updateCompanyTax(this.company);
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",  "Your message: " + "hola") );
		}
	}

	public void actionUpdateCompanyPresetPaments(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.productService.updateCompanyPresetPayments(this.company);
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",  "Your message: " + "hola") );
		}
	}
}
