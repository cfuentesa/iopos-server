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

import cl.iopos.server.core.dto.StationDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class StationEditBean implements Serializable {

	private static final long serialVersionUID = 8928833057706160962L;

	final Logger logger = LoggerFactory.getLogger(getClass());

	@ManagedProperty(value="#{productService}")
	private ProductService productService;
	
    private StationDTO station;
    
	private Boolean isAdd;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public StationDTO getStation() {
		return station;
	}

	public void setStation(StationDTO station) {
		this.station = station;
	}

	public Boolean getIsAdd() {
		return isAdd;
	}

	public void setIsAdd(Boolean isAdd) {
		this.isAdd = isAdd;
	}

	@PostConstruct
	public void init(){
		String param = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("stationId");
		
		if (param != null){
			Integer id = Integer.valueOf(param);
			try {
				this.station = this.productService.stationFindById(id);
			} catch (Exception e) {
				// TODO: handle exception
			}
			this.isAdd = false;
		} else {
			this.station = new StationDTO();
			this.station.setAutoLogout(0);
			this.station.setActive(true);
			this.isAdd = true;
		}
	}

	public void actionAdd(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.station.setCompanyId(1);
			this.productService.createStation(this.station);
			
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + "hola") );
		}

	}
	
	public void actionUpdate(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try {
			this.productService.updateStation(this.station);

	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Update!",  "Your message: " + "hola") );
		} catch (Exception e) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",  "Your message: " + "hola") );
		}
	}
	
}
