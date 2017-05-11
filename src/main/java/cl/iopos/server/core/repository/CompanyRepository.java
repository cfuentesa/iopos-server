package cl.iopos.server.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.iopos.server.core.entity.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Integer> {

}
