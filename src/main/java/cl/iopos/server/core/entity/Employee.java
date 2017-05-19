package cl.iopos.server.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = -3813538484318907551L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "company_id", nullable = true)
	private Integer companyId;
	
	@Column(name = "first_name", nullable = true, length = 40)
	private String firstName;
	
	@Column(name = "last_name", nullable = true, length = 40)
	private String lastName;
	
	@Column(name = "nick_name", nullable = true, length = 40)
	private String nickName;
	
	@Column(name = "address", nullable = true, length = 45)
	private String address;

	@Column(name = "city", nullable = true, length = 45)
	private String city;

	@Column(name = "postal", nullable = true, length = 45)
	private String postal;

	@Column(name = "state", nullable = true, length = 45)
	private String state;

	@Column(name = "country", nullable = true, length = 45)
	private String country;

	@Column(name = "email", nullable = true, length = 45)
	private String email;
	
	@Column(name = "birth_date", nullable = true)
	private Date birthDate;

	@Column(name = "gender", nullable = true, length = 45)
	private String gender;
	
	@Column(name = "training", nullable = true)
	private Boolean training;

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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getTraining() {
		return training;
	}

	public void setTraining(Boolean training) {
		this.training = training;
	}

}
