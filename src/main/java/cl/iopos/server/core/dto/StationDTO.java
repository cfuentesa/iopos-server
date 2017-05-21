package cl.iopos.server.core.dto;

import java.io.Serializable;

public class StationDTO implements Serializable {

	private static final long serialVersionUID = 503812099475737713L;

	private Integer id;
	
	private Integer companyId;

	private Integer stationNumber;
	
	private String description;

	private Integer autoLogout;
	
	private Boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getStationNumber() {
		return stationNumber;
	}

	public void setStationNumber(Integer stationNumber) {
		this.stationNumber = stationNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAutoLogout() {
		return autoLogout;
	}

	public void setAutoLogout(Integer autoLogout) {
		this.autoLogout = autoLogout;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
