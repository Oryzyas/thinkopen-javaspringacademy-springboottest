package it.thinkopen.repository;

import it.thinkopen.orm.Employee;
import it.thinkopen.orm.Project;
import it.thinkopen.orm.Team;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface TeamRepository extends PagingAndSortingRepository<Team, Integer> {

    @Override
    Collection<Team> findAll();

    Team findByProject(@Param("project")Project project);

    Team findByEmployees(@Param("employee")Employee employee);
}
