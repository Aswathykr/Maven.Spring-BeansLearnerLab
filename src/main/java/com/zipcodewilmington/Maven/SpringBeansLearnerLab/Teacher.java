package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

import java.util.Collection;

public interface Teacher {
    void teach(Learner learner, double numberOfHours);
    void lecture(Collection<? extends Learner> learners, double numberOfHours);
}
