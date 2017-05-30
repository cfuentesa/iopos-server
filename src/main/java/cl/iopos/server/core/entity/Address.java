package cl.iopos.server.core.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name = "address_street_line1", nullable = true, length = 45)
	private String streetLine1;

	@Column(name = "address_street_line2", nullable = true, length = 45)
	private String streetLine2;
	
	@Column(name = "address_city", nullable = true, length = 45)
	private String city;
	
	@Column(name = "address_state", nullable = true, length = 45)
	private String state;

	@Column(name = "address_zip_code", nullable = true, length = 45)
	private String zipCode;

	@Column(name = "address_country", nullable = true, length = 45)
	private String country;

	public String getStreetLine1() {
		return streetLine1;
	}

	public void setStreetLine1(String streetLine1) {
		this.streetLine1 = streetLine1;
	}

	public String getStreetLine2() {
		return streetLine2;
	}

	public void setStreetLine2(String streetLine2) {
		this.streetLine2 = streetLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
