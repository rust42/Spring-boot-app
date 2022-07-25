package com.example.waa_playground.controller;

import com.example.waa_playground.Cachable;
import com.example.waa_playground.Playground;
import com.example.waa_playground.entity.Person;
import com.example.waa_playground.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class PersonsController {
    private final PersonRepo personRepo;

    public PersonsController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @GetMapping
    @Cachable

    List<Person> all() {
        List<Person> people = new ArrayList<>();
        personRepo.findAll()
                .forEach(people::add);
        return people;
    }

    @PostMapping
    Person create(@RequestBody Person person) {
        personRepo.save(person);
        return person;
    }


}
