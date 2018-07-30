package it.thinkopen.controller;

import it.thinkopen.orm.Project;
import it.thinkopen.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BasicController {
    private static final String template = "Hello %s!";

    @Autowired
    private ProjectRepository projectRepo;

    @RequestMapping("/welcome")
    public Collection<Project> helloworld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return projectRepo.findAll();
    }
}
