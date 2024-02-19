package com.tyss.solidprinciple.dependencyinversion;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    private String id;
    private String name;
    private int age;
    private String email;
}

//The principle states that we must use abstraction (abstract classes and interfaces)
// instead of concrete implementations. High-level modules should not depend on the
// low-level module but both should depend on the abstraction. Because the abstraction does
// not depend on detail but the detail depends on abstraction. It decouples the software
