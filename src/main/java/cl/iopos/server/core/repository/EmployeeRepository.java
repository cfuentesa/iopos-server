package cl.iopos.server.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.iopos.server.core.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

	List<Employee> findByCompanyId(Integer companyId);

}
