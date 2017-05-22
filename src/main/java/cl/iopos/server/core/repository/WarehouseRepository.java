package cl.iopos.server.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cl.iopos.server.core.entity.Warehouse;

public interface WarehouseRepository extends CrudRepository<Warehouse,Integer> {

	List<Warehouse> findByCompanyId(Integer companyId);

}
