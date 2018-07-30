package it.thinkopen.repository;

import it.thinkopen.orm.Project;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Created by Francesco Arciello on 26/06/17.
 */

@RepositoryRestResource
public interface ProjectRepository extends PagingAndSortingRepository<Project, Integer> {

    @Override
    Collection<Project> findAll();
}
