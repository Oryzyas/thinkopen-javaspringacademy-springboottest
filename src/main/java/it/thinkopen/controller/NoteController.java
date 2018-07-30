package it.thinkopen.controller;

import it.thinkopen.orm.Employee;
import it.thinkopen.orm.Note;
import it.thinkopen.orm.Project;
import it.thinkopen.repository.NoteRepository;
import it.thinkopen.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;

@RestController
public class NoteController {
    @Autowired
    private NoteRepository noteRepo;

    @RequestMapping("/notes")
    public Collection<Note> findAll() {
        return noteRepo.findAll();
    }

    @RequestMapping("/notes/date")
    public Collection<Note> findByDate(@DateTimeFormat(pattern = "yyyy-MM-dd") @Param("min") Date min,
                                       @DateTimeFormat(pattern = "yyyy-MM-dd") @Param("max") Date max) {
        return noteRepo.findByDateBetween(min, max);
    }

    @RequestMapping("/notes/employee/{employee}")
    public Collection<Note> findByEmployee(@PathVariable("employee")Employee employee) {
        return noteRepo.findByEmployee(employee);
    }

    @RequestMapping(value = "/notes/save", method = RequestMethod.POST)
    public Note save(@RequestBody Note note) {
        return noteRepo.save(note);
    }
}
