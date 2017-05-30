package cl.iopos.server.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.iopos.server.core.entity.Supplier;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier,Integer> {

	List<Supplier> findByCompanyId(Integer companyId);

}
