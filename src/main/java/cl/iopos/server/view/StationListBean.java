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

import cl.iopos.server.core.dto.StationDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class StationListBean implements Serializable {

	private static final long serialVersionUID = -8055754974218139009L;
	
	final Logger logger = LoggerFactory.getLogger(getClass());

	@ManagedProperty(value="#{productService}")
	private ProductService productService;
    
	private List<StationDTO> stations;
    
	private StationDTO stationSelected;
    
	public ProductService getProductService() {
		return productService;
	}
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public List<StationDTO> getStations() {
		return stations;
	}
	
	public void setStations(List<StationDTO> stations) {
		this.stations = stations;
	}
	
	public StationDTO getStationSelected() {
		return stationSelected;
	}
	
	public void setStationSelected(StationDTO stationSelected) {
		this.stationSelected = stationSelected;
	}

	@PostConstruct
	public void init(){
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("stationId");
		try {
			this.stations = this.productService.stationFindByCompany(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String actionEdit(){
		System.out.println("execute " + Thread.currentThread().getStackTrace()[1].getMethodName());
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("stationId", this.stationSelected.getId().toString());
		return "actionStationEdit";
	}

}
