package cl.iopos.server.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company implements Serializable {

	private static final long serialVersionUID = 4176128509042107891L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", nullable = true, length = 45)
	private String name;

	@Column(name = "contact", nullable = true, length = 45)
	private String contact;

	@Column(name = "telephone", nullable = true, length = 45)
	private String telephone;

	@Column(name = "address", nullable = true, length = 45)
	private String address;

	@Column(name = "city", nullable = true, length = 45)
	private String city;

	@Column(name = "postal_code", nullable = true, length = 45)
	private String postal;

	@Column(name = "state", nullable = true, length = 45)
	private String state;

	@Column(name = "country", nullable = true, length = 45)
	private String country;

	@Column(name = "email", nullable = true, length = 45)
	private String email;

	@Column(name = "web", nullable = true, length = 45)
	private String web;
	
	@Column(name = "tax1_description", nullable = true, length = 45)
	private String tax1Description;
	
	@Column(name = "tax1_value", nullable = true)
	private Double tax1Value;
	
	@Column(name = "tax1_code", nullable = true, length = 45)
	private String tax1Code;
	
	@Column(name = "tax1_gratuity", nullable = true)
	private Boolean tax1Gratuity;
	
	@Column(name = "tax2_description", nullable = true, length = 45)
	private String tax2Description;
	
	@Column(name = "tax2_value", nullable = true)
	private Double tax2Value;
	
	@Column(name = "tax2_code", nullable = true, length = 45)
	private String tax2Code;
	
	@Column(name = "tax2_gratuity", nullable = true)
	private Boolean tax2Gratuity;
	
	@Column(name = "tax3_description", nullable = true, length = 45)
	private String tax3Description;
	
	@Column(name = "tax3_value", nullable = true)
	private Double tax3Value;
	
	@Column(name = "tax3_code", nullable = true, length = 45)
	private String tax3Code;
	
	@Column(name = "tax3_gratuity", nullable = true)
	private Boolean tax3Gratuity;
	
	@Column(name = "tax4_description", nullable = true, length = 45)
	private String tax4Description;
	
	@Column(name = "tax4_value", nullable = true)
	private Double tax4Value;
	
	@Column(name = "tax4_code", nullable = true, length = 45)
	private String tax4Code;
	
	@Column(name = "tax4_gratuity", nullable = true)
	private Boolean tax4Gratuity;
	
	@Column(name = "tax5_description", nullable = true, length = 45)
	private String tax5Description;
	
	@Column(name = "tax5_value", nullable = true)
	private Double tax5Value;
	
	@Column(name = "tax5_code", nullable = true, length = 45)
	private String tax5Code;
	
	@Column(name = "tax5_gratuity", nullable = true)
	private Boolean tax5Gratuity;
	
	@Column(name = "tax6_description", nullable = true, length = 45)
	private String tax6Description;
	
	@Column(name = "tax6_value", nullable = true)
	private Double tax6Value;
	
	@Column(name = "tax6_code", nullable = true, length = 45)
	private String tax6Code;
	
	@Column(name = "tax6_gratuity", nullable = true)
	private Boolean tax6Gratuity;
	
	@Column(name = "tax7_description", nullable = true, length = 45)
	private String tax7Description;
	
	@Column(name = "tax7_value", nullable = true)
	private Double tax7Value;
	
	@Column(name = "tax7_code", nullable = true, length = 45)
	private String tax7Code;
	
	@Column(name = "tax7_gratuity", nullable = true)
	private Boolean tax7Gratuity;
	
	@Column(name = "tax8_description", nullable = true, length = 45)
	private String tax8Description;
	
	@Column(name = "tax8_value", nullable = true)
	private Double tax8Value;
	
	@Column(name = "tax8_code", nullable = true, length = 45)
	private String tax8Code;
	
	@Column(name = "tax8_gratuity", nullable = true)
	private Boolean tax8Gratuity;
	
	@Column(name = "tax9_description", nullable = true, length = 45)
	private String tax9Description;
	
	@Column(name = "tax9_value", nullable = true)
	private Double tax9Value;
	
	@Column(name = "tax9_code", nullable = true, length = 45)
	private String tax9Code;
	
	@Column(name = "tax9_gratuity", nullable = true)
	private Boolean tax9Gratuity;
	
	@Column(name = "tax10_description", nullable = true, length = 45)
	private String tax10Description;
	
	@Column(name = "tax10_value", nullable = true)
	private Double tax10Value;
	
	@Column(name = "tax10_code", nullable = true, length = 45)
	private String tax10Code;
	
	@Column(name = "tax10_gratuity", nullable = true)
	private Boolean tax10Gratuity;
	
	@Column(name = "preset_payment1", nullable = true)
	private Double presetPayment1;
	
	@Column(name = "preset_payment2", nullable = true)
	private Double presetPayment2;
	
	@Column(name = "preset_payment3", nullable = true)
	private Double presetPayment3;
	
	@Column(name = "preset_payment4", nullable = true)
	private Double presetPayment4;
	
	@Column(name = "preset_payment5", nullable = true)
	private Double presetPayment5;
	
	@Column(name = "preset_payment6", nullable = true)
	private Double presetPayment6;
	
	@Column(name = "preset_payment7", nullable = true)
	private Double presetPayment7;
	
	@Column(name = "preset_payment8", nullable = true)
	private Double presetPayment8;
	
	@Column(name = "active", nullable = false)
	private Boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getTax1Description() {
		return tax1Description;
	}

	public void setTax1Description(String tax1Description) {
		this.tax1Description = tax1Description;
	}

	public Double getTax1Value() {
		return tax1Value;
	}

	public void setTax1Value(Double tax1Value) {
		this.tax1Value = tax1Value;
	}

	public String getTax1Code() {
		return tax1Code;
	}

	public void setTax1Code(String tax1Code) {
		this.tax1Code = tax1Code;
	}

	public Boolean getTax1Gratuity() {
		return tax1Gratuity;
	}

	public void setTax1Gratuity(Boolean tax1Gratuity) {
		this.tax1Gratuity = tax1Gratuity;
	}

	public String getTax2Description() {
		return tax2Description;
	}

	public void setTax2Description(String tax2Description) {
		this.tax2Description = tax2Description;
	}

	public Double getTax2Value() {
		return tax2Value;
	}

	public void setTax2Value(Double tax2Value) {
		this.tax2Value = tax2Value;
	}

	public String getTax2Code() {
		return tax2Code;
	}

	public void setTax2Code(String tax2Code) {
		this.tax2Code = tax2Code;
	}

	public Boolean getTax2Gratuity() {
		return tax2Gratuity;
	}

	public void setTax2Gratuity(Boolean tax2Gratuity) {
		this.tax2Gratuity = tax2Gratuity;
	}

	public String getTax3Description() {
		return tax3Description;
	}

	public void setTax3Description(String tax3Description) {
		this.tax3Description = tax3Description;
	}

	public Double getTax3Value() {
		return tax3Value;
	}

	public void setTax3Value(Double tax3Value) {
		this.tax3Value = tax3Value;
	}

	public String getTax3Code() {
		return tax3Code;
	}

	public void setTax3Code(String tax3Code) {
		this.tax3Code = tax3Code;
	}

	public Boolean getTax3Gratuity() {
		return tax3Gratuity;
	}

	public void setTax3Gratuity(Boolean tax3Gratuity) {
		this.tax3Gratuity = tax3Gratuity;
	}

	public String getTax4Description() {
		return tax4Description;
	}

	public void setTax4Description(String tax4Description) {
		this.tax4Description = tax4Description;
	}

	public Double getTax4Value() {
		return tax4Value;
	}

	public void setTax4Value(Double tax4Value) {
		this.tax4Value = tax4Value;
	}

	public String getTax4Code() {
		return tax4Code;
	}

	public void setTax4Code(String tax4Code) {
		this.tax4Code = tax4Code;
	}

	public Boolean getTax4Gratuity() {
		return tax4Gratuity;
	}

	public void setTax4Gratuity(Boolean tax4Gratuity) {
		this.tax4Gratuity = tax4Gratuity;
	}

	public String getTax5Description() {
		return tax5Description;
	}

	public void setTax5Description(String tax5Description) {
		this.tax5Description = tax5Description;
	}

	public Double getTax5Value() {
		return tax5Value;
	}

	public void setTax5Value(Double tax5Value) {
		this.tax5Value = tax5Value;
	}

	public String getTax5Code() {
		return tax5Code;
	}

	public void setTax5Code(String tax5Code) {
		this.tax5Code = tax5Code;
	}

	public Boolean getTax5Gratuity() {
		return tax5Gratuity;
	}

	public void setTax5Gratuity(Boolean tax5Gratuity) {
		this.tax5Gratuity = tax5Gratuity;
	}

	public String getTax6Description() {
		return tax6Description;
	}

	public void setTax6Description(String tax6Description) {
		this.tax6Description = tax6Description;
	}

	public Double getTax6Value() {
		return tax6Value;
	}

	public void setTax6Value(Double tax6Value) {
		this.tax6Value = tax6Value;
	}

	public String getTax6Code() {
		return tax6Code;
	}

	public void setTax6Code(String tax6Code) {
		this.tax6Code = tax6Code;
	}

	public Boolean getTax6Gratuity() {
		return tax6Gratuity;
	}

	public void setTax6Gratuity(Boolean tax6Gratuity) {
		this.tax6Gratuity = tax6Gratuity;
	}

	public String getTax7Description() {
		return tax7Description;
	}

	public void setTax7Description(String tax7Description) {
		this.tax7Description = tax7Description;
	}

	public Double getTax7Value() {
		return tax7Value;
	}

	public void setTax7Value(Double tax7Value) {
		this.tax7Value = tax7Value;
	}

	public String getTax7Code() {
		return tax7Code;
	}

	public void setTax7Code(String tax7Code) {
		this.tax7Code = tax7Code;
	}

	public Boolean getTax7Gratuity() {
		return tax7Gratuity;
	}

	public void setTax7Gratuity(Boolean tax7Gratuity) {
		this.tax7Gratuity = tax7Gratuity;
	}

	public String getTax8Description() {
		return tax8Description;
	}

	public void setTax8Description(String tax8Description) {
		this.tax8Description = tax8Description;
	}

	public Double getTax8Value() {
		return tax8Value;
	}

	public void setTax8Value(Double tax8Value) {
		this.tax8Value = tax8Value;
	}

	public String getTax8Code() {
		return tax8Code;
	}

	public void setTax8Code(String tax8Code) {
		this.tax8Code = tax8Code;
	}

	public Boolean getTax8Gratuity() {
		return tax8Gratuity;
	}

	public void setTax8Gratuity(Boolean tax8Gratuity) {
		this.tax8Gratuity = tax8Gratuity;
	}

	public String getTax9Description() {
		return tax9Description;
	}

	public void setTax9Description(String tax9Description) {
		this.tax9Description = tax9Description;
	}

	public Double getTax9Value() {
		return tax9Value;
	}

	public void setTax9Value(Double tax9Value) {
		this.tax9Value = tax9Value;
	}

	public String getTax9Code() {
		return tax9Code;
	}

	public void setTax9Code(String tax9Code) {
		this.tax9Code = tax9Code;
	}

	public Boolean getTax9Gratuity() {
		return tax9Gratuity;
	}

	public void setTax9Gratuity(Boolean tax9Gratuity) {
		this.tax9Gratuity = tax9Gratuity;
	}

	public String getTax10Description() {
		return tax10Description;
	}

	public void setTax10Description(String tax10Description) {
		this.tax10Description = tax10Description;
	}

	public Double getTax10Value() {
		return tax10Value;
	}

	public void setTax10Value(Double tax10Value) {
		this.tax10Value = tax10Value;
	}

	public String getTax10Code() {
		return tax10Code;
	}

	public void setTax10Code(String tax10Code) {
		this.tax10Code = tax10Code;
	}

	public Boolean getTax10Gratuity() {
		return tax10Gratuity;
	}

	public void setTax10Gratuity(Boolean tax10Gratuity) {
		this.tax10Gratuity = tax10Gratuity;
	}

	public Double getPresetPayment1() {
		return presetPayment1;
	}

	public void setPresetPayment1(Double presetPayment1) {
		this.presetPayment1 = presetPayment1;
	}

	public Double getPresetPayment2() {
		return presetPayment2;
	}

	public void setPresetPayment2(Double presetPayment2) {
		this.presetPayment2 = presetPayment2;
	}

	public Double getPresetPayment3() {
		return presetPayment3;
	}

	public void setPresetPayment3(Double presetPayment3) {
		this.presetPayment3 = presetPayment3;
	}

	public Double getPresetPayment4() {
		return presetPayment4;
	}

	public void setPresetPayment4(Double presetPayment4) {
		this.presetPayment4 = presetPayment4;
	}

	public Double getPresetPayment5() {
		return presetPayment5;
	}

	public void setPresetPayment5(Double presetPayment5) {
		this.presetPayment5 = presetPayment5;
	}

	public Double getPresetPayment6() {
		return presetPayment6;
	}

	public void setPresetPayment6(Double presetPayment6) {
		this.presetPayment6 = presetPayment6;
	}

	public Double getPresetPayment7() {
		return presetPayment7;
	}

	public void setPresetPayment7(Double presetPayment7) {
		this.presetPayment7 = presetPayment7;
	}

	public Double getPresetPayment8() {
		return presetPayment8;
	}

	public void setPresetPayment8(Double presetPayment8) {
		this.presetPayment8 = presetPayment8;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
