package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

import java.util.Iterator;

public class Students extends People<Student> {

    public Students(Student... personList) {
        super(personList);
    }
}
