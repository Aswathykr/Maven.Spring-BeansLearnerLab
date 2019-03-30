package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

import java.util.Collection;

public class Instructor extends Person implements Teacher {
    double numberOfHoursTaught;
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        numberOfHoursTaught +=numberOfHours;
    }

    @Override
    public void lecture(Collection<? extends Learner> learners, double numberOfHours) {
        numberOfHoursTaught+=numberOfHours;
        double numberOfHoursPerLearner = numberOfHours / learners.size();
        for(Learner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }

    }

    public double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }

    public void setNumberOfHoursTaught(double numberOfHoursTaught) {
        this.numberOfHoursTaught = numberOfHoursTaught;
    }
}
