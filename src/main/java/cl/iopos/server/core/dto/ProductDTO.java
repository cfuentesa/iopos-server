package cl.iopos.server.core.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 4307429154435991674L;

	private Integer id;
	
	private Integer companyId;
	
	private String description;
	
	private String printedDescription;
	
	private Double priceA;
	
	private Double priceB;
	
	private Double priceC;
	
	private Double priceD;
	
	private Double priceE;
	
	private Double priceF;
	
	private Double priceG;
	
	private Double priceH;
	
	private Double priceI;
	
	private Double priceJ;
	
	private Boolean enable;
	
	private Integer categoryId;
	
	private String categoryDescription;

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

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

}
