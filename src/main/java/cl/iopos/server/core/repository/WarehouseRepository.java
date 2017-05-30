package cl.iopos.server.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.iopos.server.core.entity.Warehouse;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehouse,Integer> {

	List<Warehouse> findByCompanyId(Integer companyId);

}
