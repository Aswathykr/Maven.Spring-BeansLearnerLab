package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

public class Person {
    private final long id;
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
