package tn.esprit.hamza_rekik_arctic10.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamza_rekik_arctic10.entities.Agent;
import tn.esprit.hamza_rekik_arctic10.services.IAgentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("agents")
public class AgentRestController {
    private final IAgentService agentService;

    @PostMapping("add")
    public Agent addAgent(@RequestBody Agent agent) {
        return agentService.addAgent(agent);
    }

    @GetMapping("all")
    public List<Agent> getAllAgents() {
        return agentService.getAll();
    }

    @GetMapping("{id}")
    public Agent getAgentById(@PathVariable("id") long id) {
        return agentService.getById(id);
    }

    @PutMapping("update")
    public Agent updateAgent(@RequestBody Agent agent) {
        return agentService.updateAgent(agent);
    }

    @DeleteMapping("{id}")
    public void deleteAgent(@PathVariable("id") long id) {
        agentService.deleteById(id);
    }
}
