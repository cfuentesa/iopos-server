package cl.iopos.server.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.iopos.server.core.entity.Station;

@Repository
public interface StationRepository extends CrudRepository<Station,Integer>{

	List<Station> findByCompanyId(Integer companyId);

}
