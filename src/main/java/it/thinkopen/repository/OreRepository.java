package it.thinkopen.repository;

import it.thinkopen.orm.Ore;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Biagio Gallucci on 10/07/2017.
 */
@RepositoryRestResource
public interface OreRepository extends PagingAndSortingRepository<Ore, Integer> {
}