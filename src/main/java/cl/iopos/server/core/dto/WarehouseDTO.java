package cl.iopos.server.core.dto;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WarehouseDTO implements Serializable {
	
	private static final long serialVersionUID = 1956859082545117208L;

	private Integer id;
	
	private Integer companyId;
	
	private String description;
	
	private String referenceNumber;
	
	private ContactDTO contact;

	private AddressDTO address;

	private Boolean active;
	
	private Long creationTime;
	
	private Long lastUpdateTime;

	public WarehouseDTO() {
		this.contact = new ContactDTO();
		this.address = new AddressDTO();
	}
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public ContactDTO getContact() {
		return contact;
	}

	public void setContact(ContactDTO contact) {
		this.contact = contact;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

	public Long getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
	public String getCreationTimeStr() {
		Date fecha = new Date(this.creationTime * 1000);
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
		String formatted = format.format(fecha);
		return formatted;
	}


}
