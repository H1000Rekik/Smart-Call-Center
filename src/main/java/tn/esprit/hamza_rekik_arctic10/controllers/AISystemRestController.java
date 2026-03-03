package tn.esprit.hamza_rekik_arctic10.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamza_rekik_arctic10.entities.AISystem;
import tn.esprit.hamza_rekik_arctic10.services.IIASystemService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("aisystems")
public class AISystemRestController {
    private final IIASystemService aiSystemService;

    @PostMapping("add")
    public AISystem addAISystem(@RequestBody AISystem system) {
        return aiSystemService.addAISystem(system);
    }

    @GetMapping("all")
    public List<AISystem> getAllAISystems() {
        return aiSystemService.getAll();
    }

    @GetMapping("{id}")
    public AISystem getAISystemById(@PathVariable("id") long id) {
        return aiSystemService.getById(id);
    }

    @PutMapping("update")
    public AISystem updateAISystem(@RequestBody AISystem system) {
        return aiSystemService.updateAISystem(system);
    }

    @DeleteMapping("{id}")
    public void deleteAISystem(@PathVariable("id") long id) {
        aiSystemService.deleteById(id);
    }
}
