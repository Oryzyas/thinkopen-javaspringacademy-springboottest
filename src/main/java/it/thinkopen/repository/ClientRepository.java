package it.thinkopen.repository;

import it.thinkopen.orm.Client;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by Francesco Arciello on 26/06/17.
 */

@RepositoryRestResource
public interface ClientRepository extends PagingAndSortingRepository<Client, Integer> {

    @RestResource(path = "names")
    List<Client> findByName(@Param("name") String name);

}
