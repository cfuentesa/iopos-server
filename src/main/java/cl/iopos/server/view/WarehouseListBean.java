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

import cl.iopos.server.core.dto.WarehouseDTO;
import cl.iopos.server.core.service.ProductService;

@ManagedBean
@ViewScoped
public class WarehouseListBean implements Serializable {

	private static final long serialVersionUID = -5945112652957612995L;

	final Logger logger = LoggerFactory.getLogger(getClass());

	@ManagedProperty(value="#{productService}")
	private ProductService productService;

	private List<WarehouseDTO> warehouses;
	
	private WarehouseDTO warehouseSelected;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public List<WarehouseDTO> getWarehouses() {
		return warehouses;
	}

	public void setWarehouses(List<WarehouseDTO> warehouses) {
		this.warehouses = warehouses;
	}

	public WarehouseDTO getWarehouseSelected() {
		return warehouseSelected;
	}

	public void setWarehouseSelected(WarehouseDTO warehouseSelected) {
		this.warehouseSelected = warehouseSelected;
	}
	
	@PostConstruct
	public void init(){
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("warehouseId");
		try {
			this.warehouses = this.productService.warehouseFindByCompany(1);
			for(WarehouseDTO dto : this.warehouses) {
				System.out.println("Desc" + dto.getDescription());;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String actionEdit(){
		logger.debug("execute {}",Thread.currentThread().getStackTrace()[1].getMethodName());
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("warehouseId", this.warehouseSelected.getId().toString());
		return "actionWarehouseEdit";
	}


}
