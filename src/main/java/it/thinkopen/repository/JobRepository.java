package it.thinkopen.repository;

import it.thinkopen.orm.Job;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Francesco Arciello on 26/06/17.
 */

@RepositoryRestResource
public interface JobRepository extends PagingAndSortingRepository<Job, Integer> {
    List<Job> findByName(@Param("name") String name);
}
