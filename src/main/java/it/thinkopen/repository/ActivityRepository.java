package it.thinkopen.repository;

import it.thinkopen.orm.Activity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Francesco Arciello on 26/06/17.
 */

@RepositoryRestResource
interface ActivityRepository extends PagingAndSortingRepository<Activity, Integer> {

}
