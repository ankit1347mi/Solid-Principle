package com.tyss.solidprinciple.singleresponsibilityprinciple;

//here we have created 2 class having different responsibility
//it follows Single Responsibility Principle
public class ResumeView {

    private Resume resume;

    public ResumeView(Resume resume) {
        this.resume = resume;
    }

    public void searchResume() {
        System.out.println("Searching Resume...");
    }
}
