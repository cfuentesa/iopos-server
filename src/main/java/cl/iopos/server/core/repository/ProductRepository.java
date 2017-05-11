package cl.iopos.server.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.iopos.server.core.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>{

	List<Product> findByCompanyId(Integer companyId);
	
}

