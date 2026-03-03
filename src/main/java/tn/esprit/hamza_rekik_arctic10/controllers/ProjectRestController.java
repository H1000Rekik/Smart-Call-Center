package tn.esprit.hamza_rekik_arctic10.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamza_rekik_arctic10.entities.Agent;
import tn.esprit.hamza_rekik_arctic10.entities.Project;
import tn.esprit.hamza_rekik_arctic10.services.IProjectServices;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("projects")
public class ProjectRestController {
    private final IProjectServices projectServices;

    @PostMapping("add")
    public Project addProject(@RequestBody Project project) {
        return projectServices.addProject(project);
    }

    @GetMapping("all")
    public List<Project> getAllProjects() {
        return projectServices.getAll();
    }

    @GetMapping("{id}")
    public Project getProjectById(@PathVariable("id") long id) {
        return projectServices.getProjectById(id);
    }

    @PutMapping("update")
    public Project updateProject(@RequestBody Project project) {
        return projectServices.updateProject(project);
    }

    @DeleteMapping("{id}")
    public void deleteProject(@PathVariable("id") long id) {
        projectServices.deleteProjectById(id);
    }

    @GetMapping("{id}/agents")
    public List<Agent> getAgentsByProjectId(@PathVariable("id") long id) {
        return projectServices.getAgents(id);
    }
}
