package cl.iopos.server.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.iopos.server.core.entity.Category;

@Repository
public interface CategoryRepository  extends CrudRepository<Category,Integer>{

	List<Category> findByCompanyId(Integer companyId);
	
}
