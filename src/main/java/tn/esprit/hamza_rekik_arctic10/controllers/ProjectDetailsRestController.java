package tn.esprit.hamza_rekik_arctic10.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamza_rekik_arctic10.entities.ProjectDetails;
import tn.esprit.hamza_rekik_arctic10.services.IProjectDetailsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("projectdetails")
public class ProjectDetailsRestController {
    private final IProjectDetailsService projectDetailsService;

    @PostMapping("add")
    public ProjectDetails addProjectDetails(@RequestBody ProjectDetails details) {
        return projectDetailsService.addProjectDetails(details);
    }

    @GetMapping("all")
    public List<ProjectDetails> getAllProjectDetails() {
        return projectDetailsService.getAll();
    }

    @GetMapping("{id}")
    public ProjectDetails getProjectDetailsById(@PathVariable("id") long id) {
        return projectDetailsService.getById(id);
    }

    @PutMapping("update")
    public ProjectDetails updateProjectDetails(@RequestBody ProjectDetails details) {
        return projectDetailsService.updateProjectDetails(details);
    }

    @DeleteMapping("{id}")
    public void deleteProjectDetails(@PathVariable("id") long id) {
        projectDetailsService.deleteById(id);
    }
}
