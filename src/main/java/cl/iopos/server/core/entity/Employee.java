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

}
