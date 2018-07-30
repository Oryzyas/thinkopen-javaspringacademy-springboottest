package it.thinkopen.repository;

import it.thinkopen.orm.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Francesco Arciello on 26/06/17.
 */

@RepositoryRestResource
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
}
