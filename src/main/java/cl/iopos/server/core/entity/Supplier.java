package cl.iopos.server.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier implements Serializable {

	private static final long serialVersionUID = -1273478033722642921L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "company_id", nullable = false)
	private Integer companyId;

	@Column(name = "name", nullable = false, length = 40)
	private String name;

	@Column(name = "contact", nullable = false, length = 40)
	private String contact;
	
	@Column(name = "telephone_number", nullable = false, length = 40)
	private String telephoneNumber;
	
	@Column(name = "movil_number", nullable = false, length = 40)
	private String movilNumber;
	
	@Column(name = "email", nullable = false, length = 40)
	private String email;
	
	@Column(name = "account_number", nullable = false, length = 40)
	private String accountNumber;
	
	@Column(name = "active", nullable = false)
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
