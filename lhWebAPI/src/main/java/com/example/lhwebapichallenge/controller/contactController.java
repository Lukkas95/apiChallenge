package com.example.lhwebapichallenge.controller;

import com.example.lhwebapichallenge.models.contact;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.lhwebapichallenge.repository.contactRepository;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class contactController {

    private final contactRepository repository;

    public contactController(contactRepository repository) {
        this.repository = repository;
    }

    //GET http://localhost:8080/contacts
    @GetMapping
    public List<contact> findAll(){
        return repository.findAll();
    }

    //GET http://localhost:8080/contacts/Lukas
    @GetMapping("/{firstName}")
    public List<contact> findByName(@PathVariable String firstName){
        return repository.findByFirstName(firstName);
    }

    //POST http://localhost:8080/contacts
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public contact create(@RequestBody contact c){
        return repository.create(c);
    }

    //PUT http://localhost:8080/contacts/Lukas
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{fullName}")
    public void update(@RequestBody contact c, @PathVariable String fullName) {
        repository.update(c, fullName);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{fullName}")
    public void delete(@PathVariable String fullName) {
        repository.delete(fullName);
    }
}
