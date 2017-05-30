package cl.iopos.server.core.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Contact {

	@Column(name = "contact_first_name", nullable = true, length = 45)
	private String firstName;
	
	@Column(name = "contact_last_name", nullable = true, length = 45)
	private String lastName;

	@Column(name = "contact_mobile_number", nullable = true, length = 45)
	private String mobileNumber;
	
	@Column(name = "contact_telephone_number", nullable = true, length = 45)
	private String telephoneNumber;
	
	@Column(name = "contact_email", nullable = true, length = 45)
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
