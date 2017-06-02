	package cl.iopos.server.core.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.iopos.server.core.dto.AddressDTO;
import cl.iopos.server.core.dto.CategoryDTO;
import cl.iopos.server.core.dto.CompanyDTO;
import cl.iopos.server.core.dto.ContactDTO;
import cl.iopos.server.core.dto.EmployeeDTO;
import cl.iopos.server.core.dto.ProductDTO;
import cl.iopos.server.core.dto.StationDTO;
import cl.iopos.server.core.dto.SupplierDTO;
import cl.iopos.server.core.dto.WarehouseDTO;
import cl.iopos.server.core.entity.Address;
import cl.iopos.server.core.entity.Category;
import cl.iopos.server.core.entity.Company;
import cl.iopos.server.core.entity.Contact;
import cl.iopos.server.core.entity.Employee;
import cl.iopos.server.core.entity.Product;
import cl.iopos.server.core.entity.Station;
import cl.iopos.server.core.entity.Supplier;
import cl.iopos.server.core.entity.Warehouse;
import cl.iopos.server.core.exception.ServiceException;
import cl.iopos.server.core.repository.CategoryRepository;
import cl.iopos.server.core.repository.CompanyRepository;
import cl.iopos.server.core.repository.EmployeeRepository;
import cl.iopos.server.core.repository.ProductRepository;
import cl.iopos.server.core.repository.StationRepository;
import cl.iopos.server.core.repository.SupplierRepository;
import cl.iopos.server.core.repository.WarehouseRepository;

@Component
public class ProductService implements Serializable {
	
	private static final long serialVersionUID = 1732602600288046499L;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private StationRepository stationRepository;
	
	@Autowired
	private WarehouseRepository warehouseRepository;
	
	@Autowired
	private SupplierRepository supplierRepository;

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
	
	public StationRepository getStationRepository() {
		return stationRepository;
	}

	public void setStationRepository(StationRepository stationRepository) {
		this.stationRepository = stationRepository;
	}

	public WarehouseRepository getWarehouseRepository() {
		return warehouseRepository;
	}

	public void setWarehouseRepository(WarehouseRepository warehouseRepository) {
		this.warehouseRepository = warehouseRepository;
	}

	public SupplierRepository getSupplierRepository() {
		return supplierRepository;
	}

	public void setSupplierRepository(SupplierRepository supplierRepository) {
		this.supplierRepository = supplierRepository;
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

	public List<EmployeeDTO> employeeFindByCompany(Integer companyId) throws ServiceException
	{
		List<EmployeeDTO> out = new ArrayList<EmployeeDTO>();
		try {
			List<Employee> result = this.employeeRepository.findByCompanyId(companyId);
			for(Employee employee : result) {
				EmployeeDTO dto = new EmployeeDTO();
				
				dto.setId(employee.getId());
				dto.setCompanyId(employee.getCompanyId());
				
				dto.setFirstName(employee.getFirstName());
				dto.setLastName(employee.getLastName());
				dto.setNickName(employee.getNickName());
				dto.setEmail(employee.getEmail());
				dto.setBirthDate(employee.getBirthDate());
				dto.setGender(employee.getGender());
				dto.setTraining(employee.getTraining());
				
				dto.setAddress(employee.getAddress());
				dto.setCity(employee.getCity());
				dto.setState(employee.getState());
				dto.setCountry(employee.getCountry());
				dto.setPostal(employee.getPostal());
				
				out.add(dto);
			}
		} catch (Exception e) {
			throw new ServiceException("Error en employeeFindByCompany");
		}
		return out;
	}
	
	public List<StationDTO> stationFindByCompany(Integer companyId) throws ServiceException
	{
		List<StationDTO> out = new ArrayList<StationDTO>();
		try {
			List<Station> result = this.stationRepository.findByCompanyId(companyId);
			for(Station station : result) {
				StationDTO dto = new StationDTO();
				dto.setId(station.getId());
				dto.setCompanyId(station.getCompanyId());
				dto.setStationNumber(station.getStationNumber());
				dto.setDescription(station.getDescription());
				dto.setAutoLogout(station.getAutoLogout());
				dto.setActive(station.getActive());
				out.add(dto);
			}
		} catch (Exception e) {
			throw new ServiceException("Error en stationFindByCompany");
		}
		return out;
	}
	
	public List<WarehouseDTO> warehouseFindByCompany(Integer companyId) throws ServiceException
	{
		List<WarehouseDTO> out = new ArrayList<WarehouseDTO>();
		try {
			List<Warehouse> result = this.warehouseRepository.findByCompanyId(companyId);
			for(Warehouse warehouse : result) {
				WarehouseDTO dto = new WarehouseDTO();
				dto.setId(warehouse.getId());
				dto.setCompanyId(warehouse.getCompanyId());
				dto.setDescription(warehouse.getDescription());
				dto.setReferenceNumber(warehouse.getReferenceNumber());
				dto.setActive(warehouse.getActive());
				
				if (warehouse.getContact() != null) {
					ContactDTO contactDTO = new ContactDTO();
					contactDTO.setFirstName(warehouse.getContact().getFirstName());
					contactDTO.setLastName(warehouse.getContact().getLastName());
					contactDTO.setTelephoneNumber(warehouse.getContact().getTelephoneNumber());
					contactDTO.setMobileNumber(warehouse.getContact().getMobileNumber());
					contactDTO.setEmail(warehouse.getContact().getEmail());
					dto.setContact(contactDTO);
				} else {
					dto.setContact(new ContactDTO());
				}
				
				if (warehouse.getAddress() != null) {
					AddressDTO addressDTO = new AddressDTO();
					addressDTO.setStreetLine1(warehouse.getAddress().getStreetLine1());
					addressDTO.setStreetLine2(warehouse.getAddress().getStreetLine2());
					addressDTO.setCity(warehouse.getAddress().getCity());
					addressDTO.setZipCode(warehouse.getAddress().getZipCode());
					addressDTO.setState(warehouse.getAddress().getState());
					addressDTO.setCountry(warehouse.getAddress().getCountry());
					dto.setAddress(addressDTO);					
				} else {
					dto.setAddress(new AddressDTO());
				}
				
				out.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("Error en warehouseFindByCompany");
		}
		return out;
	}
	
	public List<SupplierDTO> supplierFindByCompany(Integer companyId) throws ServiceException
	{
		List<SupplierDTO> out = new ArrayList<SupplierDTO>();
		try {
			List<Supplier> result = this.supplierRepository.findByCompanyId(companyId);
			for (Supplier supplier : result) {
				SupplierDTO dto = new SupplierDTO();
				dto.setId(supplier.getId());
				dto.setCompanyId(supplier.getCompanyId());
				dto.setName(supplier.getName());
				dto.setActive(supplier.getActive());
				
				AddressDTO addressDTO = new AddressDTO();
				addressDTO.setStreetLine1(supplier.getAddress().getStreetLine1());
				addressDTO.setStreetLine2(supplier.getAddress().getStreetLine2());
				addressDTO.setCity(supplier.getAddress().getCity());
				addressDTO.setZipCode(supplier.getAddress().getZipCode());
				addressDTO.setState(supplier.getAddress().getState());
				addressDTO.setCountry(supplier.getAddress().getCountry());
				dto.setAddress(addressDTO);
				
				ContactDTO contactDTO = new ContactDTO();
				contactDTO.setFirstName(supplier.getContact().getFirstName());
				contactDTO.setLastName(supplier.getContact().getLastName());
				contactDTO.setTelephoneNumber(supplier.getContact().getTelephoneNumber());
				contactDTO.setMobileNumber(supplier.getContact().getMobileNumber());
				contactDTO.setEmail(supplier.getContact().getEmail());
				dto.setContact(contactDTO);
				
				out.add(dto);
			}
		} catch (Exception e) {
			throw new ServiceException("Error en supplierFindByCompany");
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
	
	public EmployeeDTO employeeFindById(Integer employeeId) throws ServiceException 
	{
		EmployeeDTO dto = new EmployeeDTO();
		
		try {
			Employee employee = this.employeeRepository.findOne(employeeId);
			if (employee != null) {
				dto.setId(employee.getId());
				dto.setCompanyId(employee.getCompanyId());
				
				dto.setFirstName(employee.getFirstName());
				dto.setLastName(employee.getLastName());
				dto.setNickName(employee.getNickName());
				dto.setBirthDate(employee.getBirthDate());
				dto.setEmail(employee.getEmail());
				dto.setGender(employee.getGender());
				dto.setTraining(employee.getTraining());
				
				dto.setAddress(employee.getAddress());
				dto.setCity(employee.getCity());
				dto.setState(employee.getState());
				dto.setCountry(employee.getCountry());
				dto.setPostal(employee.getPostal());
				
			}
		} catch (Exception e) {
			throw new ServiceException("Error en employeeFindById");
		}
		
		return dto;
	}
	
	public StationDTO stationFindById(Integer id) throws ServiceException
	{
		StationDTO dto = new StationDTO();
		
		try {
			Station station = this.stationRepository.findOne(id);
			dto.setId(station.getId());
			dto.setCompanyId(station.getCompanyId());
			dto.setStationNumber(station.getStationNumber());
			dto.setDescription(station.getDescription());
			dto.setAutoLogout(station.getAutoLogout());
			dto.setActive(station.getActive());
		} catch (Exception e) {
			throw new ServiceException("Error en productFindById");
		}
		return dto;
	}
	
	public WarehouseDTO warehouseFindById(Integer id) throws ServiceException
	{
		WarehouseDTO dto = new WarehouseDTO();
		
		try {
			Warehouse warehouse = this.warehouseRepository.findOne(id);
			dto.setId(warehouse.getId());
			dto.setCompanyId(warehouse.getCompanyId());
			dto.setDescription(warehouse.getDescription());
			dto.setReferenceNumber(warehouse.getReferenceNumber());
			dto.setActive(warehouse.getActive());			
			
			ContactDTO contactDTO = new ContactDTO();
			contactDTO.setFirstName(warehouse.getContact().getFirstName());
			contactDTO.setLastName(warehouse.getContact().getLastName());
			contactDTO.setTelephoneNumber(warehouse.getContact().getTelephoneNumber());
			contactDTO.setMobileNumber(warehouse.getContact().getMobileNumber());
			contactDTO.setEmail(warehouse.getContact().getEmail());
			dto.setContact(contactDTO);
			
			AddressDTO addressDTO = new AddressDTO();
			addressDTO.setStreetLine1(warehouse.getAddress().getStreetLine1());
			addressDTO.setStreetLine2(warehouse.getAddress().getStreetLine2());
			addressDTO.setCity(warehouse.getAddress().getCity());
			addressDTO.setZipCode(warehouse.getAddress().getZipCode());
			addressDTO.setState(warehouse.getAddress().getState());
			addressDTO.setCountry(warehouse.getAddress().getCountry());
			dto.setAddress(addressDTO);

		} catch (Exception e) {
			throw new ServiceException("Error en warehouseFindById");
		}
		return dto;
	}
	
	public SupplierDTO supplierFindbyId(Integer id) throws ServiceException
	{
		SupplierDTO dto = new SupplierDTO();
		
		try {
			Supplier supplier = this.supplierRepository.findOne(id);
			
			dto.setId(supplier.getId());
			dto.setCompanyId(supplier.getCompanyId());
			dto.setName(supplier.getName());
			dto.setActive(supplier.getActive());
			
			AddressDTO addressDTO = new AddressDTO();
			addressDTO.setStreetLine1(supplier.getAddress().getStreetLine1());
			addressDTO.setStreetLine2(supplier.getAddress().getStreetLine2());
			addressDTO.setCity(supplier.getAddress().getCity());
			addressDTO.setZipCode(supplier.getAddress().getZipCode());
			addressDTO.setState(supplier.getAddress().getState());
			addressDTO.setCountry(supplier.getAddress().getCountry());
			dto.setAddress(addressDTO);
			
			ContactDTO contactDTO = new ContactDTO();
			contactDTO.setFirstName(supplier.getContact().getFirstName());
			contactDTO.setLastName(supplier.getContact().getLastName());
			contactDTO.setTelephoneNumber(supplier.getContact().getTelephoneNumber());
			contactDTO.setMobileNumber(supplier.getContact().getMobileNumber());
			contactDTO.setEmail(supplier.getContact().getEmail());
			dto.setContact(contactDTO);

		} catch (Exception e) {
			throw new ServiceException("Error en supplierFindbyId");
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
	
	public EmployeeDTO createEmployee(EmployeeDTO dto) throws ServiceException
	{
		try {
			Employee employee = new Employee();

			employee.setCompanyId(dto.getCompanyId());

			employee.setFirstName(dto.getFirstName());
			employee.setLastName(dto.getLastName());
			employee.setNickName(dto.getNickName());
			employee.setEmail(dto.getEmail());
			employee.setBirthDate(dto.getBirthDate());
			employee.setGender(dto.getGender());
			employee.setTraining(dto.getTraining());
			
			employee.setAddress(dto.getAddress());
			employee.setCity(dto.getCity());
			employee.setState(dto.getState());
			employee.setCountry(dto.getCountry());
			employee.setPostal(dto.getPostal());			
			
			this.employeeRepository.save(employee);
			
			dto.setId(employee.getId());
		} catch (Exception e) {
			throw new ServiceException("Error en createEmployee");
		}
		return dto;
	}
	
	public StationDTO createStation(StationDTO dto) throws ServiceException
	{
		try {
			Station station = new Station();
			station.setCompanyId(dto.getCompanyId());
			station.setStationNumber(dto.getStationNumber());
			station.setDescription(dto.getDescription());
			station.setAutoLogout(dto.getAutoLogout());
			station.setActive(dto.getActive());
			this.stationRepository.save(station);
			dto.setId(station.getId());
		} catch (Exception e) {
			throw new ServiceException("Error en createStation");
		}
		return dto;
	}
	
	public WarehouseDTO createWarehouse(WarehouseDTO dto) throws ServiceException
	{
		try {
			Warehouse warehouse = new Warehouse();
			warehouse.setCompanyId(dto.getCompanyId());
			warehouse.setDescription(dto.getDescription());
			warehouse.setReferenceNumber(dto.getReferenceNumber());
			warehouse.setActive(dto.getActive());
			
			Address address = new Address();
			address.setStreetLine1(dto.getAddress().getStreetLine1());
			address.setStreetLine2(dto.getAddress().getStreetLine2());
			address.setCity(dto.getAddress().getCity());
			address.setZipCode(dto.getAddress().getZipCode());
			address.setState(dto.getAddress().getState());
			address.setCountry(dto.getAddress().getCountry());
			warehouse.setAddress1(address);
			
			Contact contact = new Contact();
			contact.setFirstName(dto.getContact().getFirstName());
			contact.setLastName(dto.getContact().getLastName());
			contact.setTelephoneNumber(dto.getContact().getTelephoneNumber());
			contact.setMobileNumber(dto.getContact().getMobileNumber());
			contact.setEmail(dto.getContact().getEmail());
			warehouse.setContact(contact);
			
			this.warehouseRepository.save(warehouse);
			dto.setId(warehouse.getId());
		} catch (Exception e) {
			throw new ServiceException("Error en createWarehouse");
		}
		return dto;
	}
	
	public SupplierDTO createSupplier(SupplierDTO dto) throws ServiceException
	{
		try {
			Supplier supplier = new Supplier();
			supplier.setCompanyId(dto.getCompanyId());
			supplier.setName(dto.getName());
			supplier.setAccountNumber(dto.getAccountNumber());
			supplier.setActive(dto.getActive());
			
			Address address = new Address();
			address.setStreetLine1(dto.getAddress().getStreetLine1());
			address.setStreetLine2(dto.getAddress().getStreetLine2());
			address.setCity(dto.getAddress().getCity());
			address.setZipCode(dto.getAddress().getZipCode());
			address.setState(dto.getAddress().getState());
			address.setCountry(dto.getAddress().getCountry());
			supplier.setAddress(address);
			
			Contact contact = new Contact();
			contact.setFirstName(dto.getContact().getFirstName());
			contact.setLastName(dto.getContact().getLastName());
			contact.setTelephoneNumber(dto.getContact().getTelephoneNumber());
			contact.setMobileNumber(dto.getContact().getMobileNumber());
			contact.setEmail(dto.getContact().getEmail());
			supplier.setContact(contact);
			
			this.supplierRepository.save(supplier);
			dto.setId(supplier.getId());
		} catch (Exception e) {
			throw new ServiceException("Error en createSupplier");
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
	
	public EmployeeDTO updateEmployee(EmployeeDTO dto) throws ServiceException
	{
		try {
			Employee employee = this.employeeRepository.findOne(dto.getId());

			employee.setCompanyId(dto.getCompanyId());

			employee.setFirstName(dto.getFirstName());
			employee.setLastName(dto.getLastName());
			employee.setNickName(dto.getNickName());
			employee.setEmail(dto.getEmail());
			employee.setBirthDate(dto.getBirthDate());
			employee.setGender(dto.getGender());
			employee.setTraining(dto.getTraining());

			employee.setAddress(dto.getAddress());
			employee.setCity(dto.getCity());
			employee.setState(dto.getState());			
			employee.setCountry(dto.getCountry());
			employee.setPostal(dto.getPostal());
			
			this.employeeRepository.save(employee);
			
		} catch (Exception e) {
			throw new ServiceException("Error en updateEmployee");
		}
		return dto;
	}
	
	public StationDTO updateStation(StationDTO dto) throws ServiceException
	{
		try {
			Station station = this.stationRepository.findOne(dto.getId());
			station.setCompanyId(dto.getCompanyId());
			station.setStationNumber(dto.getStationNumber());
			station.setDescription(dto.getDescription());
			station.setAutoLogout(dto.getAutoLogout());
			station.setActive(dto.getActive());
			this.stationRepository.save(station);
			
		} catch (Exception e) {
			throw new ServiceException("Error en updateStation");
		}
		return dto;
	}

	public WarehouseDTO updateWarehouse(WarehouseDTO dto) throws ServiceException
	{
		try {
			Warehouse warehouse = this.warehouseRepository.findOne(dto.getId());
			warehouse.setCompanyId(dto.getCompanyId());
			warehouse.setDescription(dto.getDescription());
			warehouse.setReferenceNumber(dto.getReferenceNumber());
			warehouse.setActive(dto.getActive());
			
			Address address = new Address();
			address.setStreetLine1(dto.getAddress().getStreetLine1());
			address.setStreetLine2(dto.getAddress().getStreetLine2());
			address.setCity(dto.getAddress().getCity());
			address.setZipCode(dto.getAddress().getZipCode());
			address.setState(dto.getAddress().getState());
			address.setCountry(dto.getAddress().getCountry());
			warehouse.setAddress1(address);
			
			Contact contact = new Contact();
			contact.setFirstName(dto.getContact().getFirstName());
			contact.setLastName(dto.getContact().getLastName());
			contact.setTelephoneNumber(dto.getContact().getTelephoneNumber());
			contact.setMobileNumber(dto.getContact().getMobileNumber());
			contact.setEmail(dto.getContact().getEmail());
			warehouse.setContact(contact);
			
			this.warehouseRepository.save(warehouse);
		} catch (Exception e) {
			throw new ServiceException("Error en updateWarehouse");
		}
		return dto;
	}
	
	public SupplierDTO updateSupplier(SupplierDTO dto) throws ServiceException
	{
		try {
			Supplier supplier = this.supplierRepository.findOne(dto.getId());
			supplier.setCompanyId(dto.getCompanyId());
			supplier.setName(dto.getName());
			supplier.setAccountNumber(dto.getAccountNumber());
			supplier.setActive(dto.getActive());
			
			Address address = new Address();
			address.setStreetLine1(dto.getAddress().getStreetLine1());
			address.setStreetLine2(dto.getAddress().getStreetLine2());
			address.setCity(dto.getAddress().getCity());
			address.setZipCode(dto.getAddress().getZipCode());
			address.setState(dto.getAddress().getState());
			address.setCountry(dto.getAddress().getCountry());
			supplier.setAddress(address);
			
			Contact contact = new Contact();
			contact.setFirstName(dto.getContact().getFirstName());
			contact.setLastName(dto.getContact().getLastName());
			contact.setTelephoneNumber(dto.getContact().getTelephoneNumber());
			contact.setMobileNumber(dto.getContact().getMobileNumber());
			contact.setEmail(dto.getContact().getEmail());
			supplier.setContact(contact);
			
			this.supplierRepository.save(supplier);
		} catch (Exception e) {
			throw new ServiceException("Error en updateSupplier");
		}
		return dto;
	}

}
