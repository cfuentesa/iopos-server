package cl.iopos.server.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "warehouse")
public class Warehouse implements Serializable {

	private static final long serialVersionUID = 5110422925925488396L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "company_id", nullable = false)
	private Integer companyId;
	
	@Column(name = "description", nullable = false, length = 40)
	private String description;
	
	@Column(name = "reference_number", nullable = false, length = 40)
	private String referenceNumber;
	
	@Column(name = "contact", nullable = false, length = 40)
	private String contact;
	
	@Column(name = "telephone_number", nullable = false, length = 40)
	private String telephoneNumber;
	
	@Column(name = "movil_number", nullable = false, length = 40)
	private String movilNumber;
	
	@Column(name = "email", nullable = false, length = 40)
	private String email;

	@Column(name = "address1", nullable = true, length = 45)
	private String address1;

	@Column(name = "address2", nullable = true, length = 45)
	private String address2;

	@Column(name = "city", nullable = true, length = 45)
	private String city;

	@Column(name = "postal_code", nullable = true, length = 45)
	private String postal;

	@Column(name = "state", nullable = true, length = 45)
	private String state;

	@Column(name = "country", nullable = true, length = 45)
	private String country;

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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getMovilNumber() {
		return movilNumber;
	}

	public void setMovilNumber(String movilNumber) {
		this.movilNumber = movilNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
