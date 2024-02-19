package com.tyss.solidprinciple.dependencyinversion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity addUser(Person person) {
        return new ResponseEntity(personService.addPerson(person), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getPersonById(String id) {
        return new ResponseEntity(personService.getPersonById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllPerson() {
        return new ResponseEntity(personService.getAllPerson(), HttpStatus.OK);
    }
}
