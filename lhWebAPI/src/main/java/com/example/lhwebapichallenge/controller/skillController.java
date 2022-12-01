package com.example.lhwebapichallenge.controller;

import com.example.lhwebapichallenge.models.skill;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.lhwebapichallenge.repository.skillRepository;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class skillController {

    private final skillRepository repository;

    public skillController(skillRepository repository) {
        this.repository = repository;
    }

    //GET http://localhost:8080/skills
    @GetMapping
    public List<skill> findAll(){
        return repository.findAll();
    }

    //GET http://localhost:8080/skills/Lukas
    @GetMapping("/{firstName}")
    public List<skill> findByName(@PathVariable String firstName){
        return repository.findByFirstName(firstName);
    }

    //POST http://localhost:8080/skills
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public skill create(@RequestBody skill s){
        return repository.create(s);
    }

    //PUT http://localhost:8080/skills/Football
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{name}")
    public void update(@RequestBody skill s, @PathVariable String name) {
        repository.update(s, name);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        repository.delete(name);
    }
}
