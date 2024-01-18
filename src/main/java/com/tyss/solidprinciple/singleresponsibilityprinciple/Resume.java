package com.tyss.solidprinciple.singleresponsibilityprinciple;

import lombok.Data;

//this class is violating the Single Responsibility Principle
@Data
public class Resume {

    private String technology;

    private int yearOfExperience;

//    public void searchResume(){
//        System.out.println("Searching Resume...");
//    }
}
