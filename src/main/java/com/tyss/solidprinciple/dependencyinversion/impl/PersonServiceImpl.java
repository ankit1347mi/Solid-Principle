package com.tyss.solidprinciple.dependencyinversion.impl;

import com.tyss.solidprinciple.dependencyinversion.Person;
import com.tyss.solidprinciple.dependencyinversion.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    private String PersonDao;

    @Override
    public Person addPerson(Person person) {
        return person;
    }

    @Override
    public Person getPersonById(String id) {
        return new Person();
    }

    @Override
    public List<Person> getAllPerson() {
        return null;
    }
}
