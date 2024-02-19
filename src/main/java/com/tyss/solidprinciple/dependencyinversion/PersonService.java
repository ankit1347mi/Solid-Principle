package com.tyss.solidprinciple.dependencyinversion;

import java.util.List;

public interface PersonService {

    Person addPerson(Person person);

    Person getPersonById(String id);

    List<Person> getAllPerson();

}
