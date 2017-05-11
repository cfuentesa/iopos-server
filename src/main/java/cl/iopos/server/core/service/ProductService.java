	package cl.iopos.server.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.iopos.server.core.dto.CategoryDTO;
import cl.iopos.server.core.dto.CompanyDTO;
import cl.iopos.server.core.dto.ProductDTO;
import cl.iopos.server.core.entity.Category;
import cl.iopos.server.core.entity.Company;
import cl.iopos.server.core.entity.Product;
import cl.iopos.server.core.exception.ServiceException;
import cl.iopos.server.core.repository.CategoryRepository;
import cl.iopos.server.core.repository.CompanyRepository;
import cl.iopos.server.core.repository.EmployeeRepository;
import cl.iopos.server.core.repository.ProductRepository;

@Component
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public CompanyRepository getCompanyRepository() {
		return companyRepository;
	}

	public void setCompanyRepository(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<CategoryDTO> categoryFindAll() throws ServiceException 
	{
		List<CategoryDTO> out = new ArrayList<CategoryDTO>();
		try {
			List<Category> result = (List<Category>) this.categoryRepository.findAll();
			
			for(Category category : result) {
				CategoryDTO dto = new CategoryDTO();
				dto.setId(category.getId());
				dto.setDescription(category.getDescription());
				out.add(dto);
			}
		} catch (Exception e) {
			throw new ServiceException("Error en categoryFindAll");
		}
		return out;
	}

	public List<CategoryDTO> categoryFindByCompany(Integer companyId) throws ServiceException 
	{
		List<CategoryDTO> out = new ArrayList<CategoryDTO>();
		
		try {
			List<Category> result = (List<Category>) this.categoryRepository.findByCompanyId(companyId);
			
			for(Category category : result) {
				CategoryDTO dto = new CategoryDTO();
				dto.setId(category.getId());
				dto.setCompanyId(category.getCompanyId());
				dto.setDescription(category.getDescription());
				out.add(dto);
			}
		} catch (Exception e) {
			throw new ServiceException("Error en categoryFindByCompany");
		}
		return out;
	}

	public List<ProductDTO> productFindAll() throws ServiceException
	{
		List<ProductDTO> out = new ArrayList<ProductDTO>();
		
		try {
			List<Product> result = (List<Product>) this.productRepository.findAll();
			
			for(Product product : result) {
				ProductDTO dto = new ProductDTO();
				dto.setId(product.getId());
				dto.setDescription(product.getDescription());
				dto.setPrintedDescription(product.getPrintedDescription());
				dto.setEnable(product.getEnable());
				dto.setPriceA(product.getPriceA());
				dto.setPriceB(product.getPriceB());
				dto.setPriceC(product.getPriceC());
				dto.setPriceD(product.getPriceD());
				dto.setPriceE(product.getPriceE());
				dto.setPriceF(product.getPriceF());
				dto.setPriceG(product.getPriceG());
				dto.setPriceH(product.getPriceH());
				dto.setPriceI(product.getPriceI());
				dto.setPriceJ(product.getPriceJ());
				dto.setCategoryId(product.getCategory().getId());
				dto.setCategoryDescription(product.getCategory().getDescription());
				out.add(dto);
			}
		} catch (Exception e) {
			throw new ServiceException("Error en productFindAll");
		}
		return out;
	}

	public List<ProductDTO> productFindByCompany(Integer companyId) throws ServiceException
	{
		List<ProductDTO> out = new ArrayList<ProductDTO>();
		
		try {
			List<Product> result = (List<Product>) this.productRepository.findByCompanyId(companyId);
			
			for(Product product : result) {
				ProductDTO dto = new ProductDTO();
				dto.setId(product.getId());
				dto.setCompanyId(product.getCompanyId());
				dto.setDescription(product.getDescription());
				dto.setPrintedDescription(product.getPrintedDescription());
				dto.setEnable(product.getEnable());
				dto.setPriceA(product.getPriceA());
				dto.setPriceB(product.getPriceB());
				dto.setPriceC(product.getPriceC());
				dto.setPriceD(product.getPriceD());
				dto.setPriceE(product.getPriceE());
				dto.setPriceF(product.getPriceF());
				dto.setPriceG(product.getPriceG());
				dto.setPriceH(product.getPriceH());
				dto.setPriceI(product.getPriceI());
				dto.setPriceJ(product.getPriceJ());
				dto.setCategoryId(product.getCategory().getId());
				dto.setCategoryDescription(product.getCategory().getDescription());
				out.add(dto);
			}
		} catch (Exception e) {
			throw new ServiceException("Error en productFindByCompany");
		}
		return out;
	}
	
	public CompanyDTO companyFindById(Integer id) throws ServiceException
	{
		CompanyDTO dto = new CompanyDTO();
		
		try {
			Company company = this.companyRepository.findOne(id);
			if (company != null) {
				
				dto.setName(company.getName());
				dto.setContact(company.getContact());
				dto.setAddress(company.getAddress());
				dto.setCity(company.getCity());
				dto.setCountry(company.getCountry());
				dto.setEmail(company.getEmail());
				dto.setId(company.getId());
				dto.setPostal(company.getPostal());
				dto.setState(company.getState());
				dto.setTelephone(company.getTelephone());
				dto.setWeb(company.getWeb());
				
				dto.setTax1Description(company.getTax1Description());
				dto.setTax1Value(company.getTax1Value());
				dto.setTax1Code(company.getTax1Code());
				dto.setTax1Gratuity(company.getTax1Gratuity());
				dto.setTax2Description(company.getTax2Description());
				dto.setTax2Value(company.getTax2Value());
				dto.setTax2Code(company.getTax2Code());
				dto.setTax2Gratuity(company.getTax2Gratuity());
				dto.setTax3Description(company.getTax3Description());
				dto.setTax3Value(company.getTax3Value());
				dto.setTax3Code(company.getTax3Code());
				dto.setTax3Gratuity(company.getTax3Gratuity());
				dto.setTax4Description(company.getTax4Description());
				dto.setTax4Value(company.getTax4Value());
				dto.setTax4Code(company.getTax4Code());
				dto.setTax4Gratuity(company.getTax4Gratuity());
				dto.setTax5Description(company.getTax5Description());
				dto.setTax5Value(company.getTax5Value());
				dto.setTax5Code(company.getTax5Code());
				dto.setTax5Gratuity(company.getTax5Gratuity());
				dto.setTax6Description(company.getTax6Description());
				dto.setTax6Value(company.getTax6Value());
				dto.setTax6Code(company.getTax6Code());
				dto.setTax6Gratuity(company.getTax6Gratuity());
				dto.setTax7Description(company.getTax7Description());
				dto.setTax7Value(company.getTax7Value());
				dto.setTax7Code(company.getTax7Code());
				dto.setTax7Gratuity(company.getTax7Gratuity());
				dto.setTax8Description(company.getTax8Description());
				dto.setTax8Value(company.getTax8Value());
				dto.setTax8Code(company.getTax8Code());
				dto.setTax8Gratuity(company.getTax8Gratuity());
				dto.setTax9Description(company.getTax9Description());
				dto.setTax9Value(company.getTax9Value());
				dto.setTax9Code(company.getTax9Code());
				dto.setTax9Gratuity(company.getTax9Gratuity());
				dto.setTax10Description(company.getTax10Description());
				dto.setTax10Value(company.getTax10Value());
				dto.setTax10Code(company.getTax10Code());
				dto.setTax10Gratuity(company.getTax10Gratuity());
				
				dto.setPresetPayment1(company.getPresetPayment1());
				dto.setPresetPayment2(company.getPresetPayment2());
				dto.setPresetPayment3(company.getPresetPayment3());
				dto.setPresetPayment4(company.getPresetPayment4());
				dto.setPresetPayment5(company.getPresetPayment5());
				dto.setPresetPayment6(company.getPresetPayment6());
				dto.setPresetPayment7(company.getPresetPayment7());
				dto.setPresetPayment8(company.getPresetPayment8());
				
			}
			
		} catch (Exception e) {
			throw new ServiceException("Error en companyFindById");
		}
		return dto;
	}
	
	public CategoryDTO categoryFindById(Integer id) throws ServiceException
	{
		CategoryDTO dto = new CategoryDTO();
		
		try {
			Category category = this.categoryRepository.findOne(id);
			if (category != null) {
				dto.setId(category.getId());
				dto.setDescription(category.getDescription());
			}
			
		} catch (Exception e) {
			throw new ServiceException("Error en categoryFindById");
		}
		return dto;
	}

	public ProductDTO productFindById(Integer id) throws ServiceException
	{
		ProductDTO dto = new ProductDTO();

		try {
			Product product = this.productRepository.findOne(id);
			if (product != null) {
				dto.setId(product.getId());
				dto.setDescription(product.getDescription());
				dto.setPrintedDescription(product.getPrintedDescription());
				dto.setEnable(product.getEnable());
				dto.setPriceA(product.getPriceA());
				dto.setPriceB(product.getPriceB());
				dto.setPriceC(product.getPriceC());
				dto.setPriceD(product.getPriceD());
				dto.setPriceE(product.getPriceE());
				dto.setPriceF(product.getPriceF());
				dto.setPriceG(product.getPriceG());
				dto.setPriceH(product.getPriceH());
				dto.setPriceI(product.getPriceI());
				dto.setPriceJ(product.getPriceJ());
				dto.setCategoryId(product.getCategory().getId());
				dto.setCategoryDescription(product.getCategory().getDescription());
			}
		} catch (Exception e) {
			throw new ServiceException("Error en productFindById");
		}
		return dto;
	}
	
	public CompanyDTO createCompany(CompanyDTO dto) throws ServiceException
	{
		try {
			Company company = new Company();
			company.setName(dto.getName());
			company.setContact(dto.getContact());
			company.setTelephone(dto.getTelephone());
			company.setAddress(dto.getAddress());
			company.setCity(dto.getCity());
			company.setPostal(dto.getPostal());
			company.setState(dto.getState());
			company.setCountry(dto.getCountry());
			company.setEmail(dto.getEmail());
			company.setWeb(dto.getWeb());
			this.companyRepository.save(company);
			dto.setId(company.getId());
		} catch (Exception e) {
			throw new ServiceException("Error en createCompany");
		}
		return dto;
	}
	
	public CategoryDTO createCategory(CategoryDTO dto) throws ServiceException
	{
		try {
			Category category = new Category();
			category.setDescription(dto.getDescription());
			this.categoryRepository.save(category);
			dto.setId(category.getId());
		} catch (Exception e) {
			throw new ServiceException("Error en createCategory");
		}
		return dto;
	}
	
	public ProductDTO createProduct(ProductDTO dto) throws ServiceException
	{
		try {
			Product product = new Product();
			product.setDescription(dto.getDescription());
			product.setPrintedDescription(dto.getPrintedDescription());
			product.setEnable(dto.getEnable());
			product.setPriceA(dto.getPriceA());
			product.setPriceB(dto.getPriceB());
			product.setPriceC(dto.getPriceC());
			product.setPriceD(dto.getPriceD());
			product.setPriceE(dto.getPriceE());
			product.setPriceF(dto.getPriceF());
			product.setPriceG(dto.getPriceG());
			product.setPriceH(dto.getPriceH());
			product.setPriceI(dto.getPriceI());
			product.setPriceJ(dto.getPriceJ());
			Category category = this.categoryRepository.findOne(dto.getCategoryId());
			product.setCategory(category);
			this.productRepository.save(product);
			dto.setId(product.getId());
		} catch (Exception e) {
			throw new ServiceException("Error en createProduct");
		}
		return dto;
	}
	
	public CompanyDTO updateCompany(CompanyDTO dto) throws ServiceException
	{
		try {
			Company company = this.companyRepository.findOne(dto.getId());
			company.setName(dto.getName());
			company.setContact(dto.getContact());
			company.setTelephone(dto.getTelephone());
			company.setAddress(dto.getAddress());
			company.setCity(dto.getCity());
			company.setPostal(dto.getPostal());
			company.setState(dto.getState());
			company.setCountry(dto.getCountry());
			company.setEmail(dto.getEmail());
			company.setWeb(dto.getWeb());
			this.companyRepository.save(company);
		} catch (Exception e) {
			throw new ServiceException("Error en updateCompany");
		}
		return dto;
	}

	public CompanyDTO updateCompanyTax(CompanyDTO dto) throws ServiceException
	{
		try {
			Company company = this.companyRepository.findOne(dto.getId());
			
			company.setTax1Description(dto.getTax1Description());
			company.setTax1Value(dto.getTax1Value());
			company.setTax1Code(dto.getTax1Code());
			company.setTax1Gratuity(dto.getTax1Gratuity());
			
			company.setTax2Description(dto.getTax2Description());
			company.setTax2Value(dto.getTax2Value());
			company.setTax2Code(dto.getTax2Code());
			company.setTax2Gratuity(dto.getTax2Gratuity());
			
			company.setTax3Description(dto.getTax3Description());
			company.setTax3Value(dto.getTax3Value());
			company.setTax3Code(dto.getTax3Code());
			company.setTax3Gratuity(dto.getTax3Gratuity());
			
			company.setTax4Description(dto.getTax4Description());
			company.setTax4Value(dto.getTax4Value());
			company.setTax4Code(dto.getTax4Code());
			company.setTax4Gratuity(dto.getTax4Gratuity());
			
			company.setTax5Description(dto.getTax5Description());
			company.setTax5Value(dto.getTax5Value());
			company.setTax5Code(dto.getTax5Code());
			company.setTax5Gratuity(dto.getTax5Gratuity());
			
			company.setTax6Description(dto.getTax6Description());
			company.setTax6Value(dto.getTax6Value());
			company.setTax6Code(dto.getTax6Code());
			company.setTax6Gratuity(dto.getTax6Gratuity());
			
			company.setTax7Description(dto.getTax7Description());
			company.setTax7Value(dto.getTax7Value());
			company.setTax7Code(dto.getTax7Code());
			company.setTax7Gratuity(dto.getTax7Gratuity());
			
			company.setTax8Description(dto.getTax8Description());
			company.setTax8Value(dto.getTax8Value());
			company.setTax8Code(dto.getTax8Code());
			company.setTax8Gratuity(dto.getTax8Gratuity());
			
			company.setTax9Description(dto.getTax9Description());
			company.setTax9Value(dto.getTax9Value());
			company.setTax9Code(dto.getTax9Code());
			company.setTax9Gratuity(dto.getTax9Gratuity());
			
			company.setTax10Description(dto.getTax10Description());
			company.setTax10Value(dto.getTax10Value());
			company.setTax10Code(dto.getTax10Code());
			company.setTax10Gratuity(dto.getTax10Gratuity());
			
			this.companyRepository.save(company);
		} catch (Exception e) {
			throw new ServiceException("Error en updateCompanyTax");
		}
		return dto;
	}

	public CompanyDTO updateCompanyPresetPayments(CompanyDTO dto) throws ServiceException
	{
		try {
			Company company = this.companyRepository.findOne(dto.getId());
			
			company.setPresetPayment1(dto.getPresetPayment1());
			company.setPresetPayment2(dto.getPresetPayment2());
			company.setPresetPayment3(dto.getPresetPayment3());
			company.setPresetPayment4(dto.getPresetPayment4());
			company.setPresetPayment5(dto.getPresetPayment5());
			company.setPresetPayment6(dto.getPresetPayment6());
			company.setPresetPayment7(dto.getPresetPayment7());
			company.setPresetPayment8(dto.getPresetPayment8());
			
			this.companyRepository.save(company);
		} catch (Exception e) {
			throw new ServiceException("Error en updateCompanyPresetPayments");
		}
		return dto;
	}
	
	public CategoryDTO updateCategory(CategoryDTO dto) throws ServiceException
	{
		try {
			Category category = this.categoryRepository.findOne(dto.getId());
			
			category.setDescription(dto.getDescription());
			
			this.categoryRepository.save(category);
		} catch (Exception e) {
			throw new ServiceException("Error en updateCategory");
		}
		return dto;
	}
	
	public ProductDTO updateProduct(ProductDTO dto) throws ServiceException
	{
		try {
			Product product = this.productRepository.findOne(dto.getId());
			product.setDescription(dto.getDescription());
			product.setPrintedDescription(dto.getPrintedDescription());
			product.setEnable(dto.getEnable());
			product.setPriceA(dto.getPriceA());
			product.setPriceB(dto.getPriceB());
			product.setPriceC(dto.getPriceC());
			product.setPriceD(dto.getPriceD());
			product.setPriceE(dto.getPriceE());
			product.setPriceF(dto.getPriceF());
			product.setPriceG(dto.getPriceG());
			product.setPriceH(dto.getPriceH());
			product.setPriceI(dto.getPriceI());
			product.setPriceJ(dto.getPriceJ());
			Category category = this.categoryRepository.findOne(dto.getCategoryId());
			product.setCategory(category);
			this.productRepository.save(product);
		} catch (Exception e) {
			throw new ServiceException("Error en updateProduct");
		}
		return dto;
	}
}
