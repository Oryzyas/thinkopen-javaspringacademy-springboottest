package it.thinkopen.repository;

import it.thinkopen.orm.Employee;
import it.thinkopen.orm.Note;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.soap.Node;
import java.util.Collection;
import java.util.Date;

@RepositoryRestResource
public interface NoteRepository extends PagingAndSortingRepository<Note, Integer> {

    @Override
    Collection<Note> findAll();

    Collection<Note> findByDateBetween(@DateTimeFormat(pattern = "yyyy-MM-dd") @Param("min") Date min,
                                       @DateTimeFormat(pattern = "yyyy-MM-dd") @Param("max") Date max);

    Collection<Note> findByEmployee(@Param("employee")Employee employee);

    @Override
    Note save(Note node);
}
