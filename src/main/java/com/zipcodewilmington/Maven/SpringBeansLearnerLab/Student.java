package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
}
