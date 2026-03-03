package tn.esprit.hamza_rekik_arctic10.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamza_rekik_arctic10.entities.Calls;
import tn.esprit.hamza_rekik_arctic10.services.CallsServicesImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("calls")
public class CallsRestController {
    private final CallsServicesImpl callsServices;

    @PostMapping("add")
    public Calls addCalls(@RequestBody Calls call) {
        return callsServices.addCall(call);
    }

    @GetMapping("all")
    public List<Calls> getAllCalls() {
        return callsServices.getAll();
    }

    @GetMapping("{id}")
    public Calls getCallById(@PathVariable("id") long id) {
        return callsServices.getById(id);
    }

    @PutMapping("update")
    public Calls updateCall(@RequestBody Calls call) {
        return callsServices.updateCall(call);
    }

    @DeleteMapping("{id}")
    public void deleteCall(@PathVariable("id") long id) {
        callsServices.deleteById(id);
    }
}
