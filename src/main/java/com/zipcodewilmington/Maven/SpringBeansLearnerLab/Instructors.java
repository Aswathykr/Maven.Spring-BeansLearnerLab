package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

public class Instructors extends People<Instructor> {
    public Instructors(Instructor... personList) {
        super(personList);
    }
    public Instructors() {
        super();
    }
}
