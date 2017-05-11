package cl.iopos.server.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 9135203341568738355L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "company_id", nullable = true)
	private Integer companyId;
	
	@Column(name = "description", nullable = true, length = 40)
	private String description;
	
	@Column(name = "printed_description", nullable = true, length = 25)
	private String printedDescription;
	
	@Column(name = "price_a", nullable = true)
	private Double priceA;
	
	@Column(name = "price_b", nullable = true)
	private Double priceB;
	
	@Column(name = "price_c", nullable = true)
	private Double priceC;
	
	@Column(name = "price_d", nullable = true)
	private Double priceD;
	
	@Column(name = "price_e", nullable = true)
	private Double priceE;
	
	@Column(name = "price_f", nullable = true)
	private Double priceF;
	
	@Column(name = "price_g", nullable = true)
	private Double priceG;
	
	@Column(name = "price_h", nullable = true)
	private Double priceH;
	
	@Column(name = "price_i", nullable = true)
	private Double priceI;
	
	@Column(name = "price_j", nullable = true)
	private Double priceJ;
	
	@Column(name = "enable", nullable = true)
	private Boolean enable;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
	
	public Product() {}

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

	public String getPrintedDescription() {
		return printedDescription;
	}

	public void setPrintedDescription(String printedDescription) {
		this.printedDescription = printedDescription;
	}

	public Double getPriceA() {
		return priceA;
	}

	public void setPriceA(Double priceA) {
		this.priceA = priceA;
	}

	public Double getPriceB() {
		return priceB;
	}

	public void setPriceB(Double priceB) {
		this.priceB = priceB;
	}

	public Double getPriceC() {
		return priceC;
	}

	public void setPriceC(Double priceC) {
		this.priceC = priceC;
	}

	public Double getPriceD() {
		return priceD;
	}

	public void setPriceD(Double priceD) {
		this.priceD = priceD;
	}

	public Double getPriceE() {
		return priceE;
	}

	public void setPriceE(Double priceE) {
		this.priceE = priceE;
	}

	public Double getPriceF() {
		return priceF;
	}

	public void setPriceF(Double priceF) {
		this.priceF = priceF;
	}

	public Double getPriceG() {
		return priceG;
	}

	public void setPriceG(Double priceG) {
		this.priceG = priceG;
	}

	public Double getPriceH() {
		return priceH;
	}

	public void setPriceH(Double priceH) {
		this.priceH = priceH;
	}

	public Double getPriceI() {
		return priceI;
	}

	public void setPriceI(Double priceI) {
		this.priceI = priceI;
	}

	public Double getPriceJ() {
		return priceJ;
	}

	public void setPriceJ(Double priceJ) {
		this.priceJ = priceJ;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
