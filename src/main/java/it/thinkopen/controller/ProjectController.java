package it.thinkopen.controller;

import it.thinkopen.orm.Employee;
import it.thinkopen.orm.Project;
import it.thinkopen.orm.Team;
import it.thinkopen.repository.ProjectRepository;
import it.thinkopen.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ProjectController {
    @Autowired
    private ProjectRepository projRepo;

    @RequestMapping("/projects")
    public Collection<Project> findAll() {
        return projRepo.findAll();
    }

}