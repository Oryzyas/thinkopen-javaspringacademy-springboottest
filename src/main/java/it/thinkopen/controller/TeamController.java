package it.thinkopen.controller;

import it.thinkopen.orm.Employee;
import it.thinkopen.orm.Note;
import it.thinkopen.orm.Project;
import it.thinkopen.orm.Team;
import it.thinkopen.repository.NoteRepository;
import it.thinkopen.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Collection;
import java.util.Date;

@RestController
public class TeamController {
    @Autowired
    private TeamRepository teamRepo;

    @RequestMapping("/teams")
    public Collection<Team> findAll() {
        return teamRepo.findAll();
    }

    @RequestMapping("/teams/project/{project}")
    public Team findByProject(@PathVariable("project") Project project) {
        return teamRepo.findByProject(project);
    }

    @RequestMapping("/teams/employee/{employee}")
    public Team findByEmployee(@PathVariable("employee") Employee employee) {
        return teamRepo.findByEmployees(employee);
    }
}