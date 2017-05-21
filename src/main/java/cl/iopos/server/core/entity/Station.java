package cl.iopos.server.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "station")
public class Station implements Serializable{

	private static final long serialVersionUID = 827860602798818036L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "company_id", nullable = false)
	private Integer companyId;

	@Column(name = "station_number", nullable = false)
	private Integer stationNumber;
	
	@Column(name = "description", nullable = false, length = 40)
	private String description;
	
	@Column(name = "auto_logout", nullable = false, columnDefinition="INT default '0'")
	private Integer autoLogout;
	
	@Column(name = "active", nullable = false, columnDefinition="BIT")
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
