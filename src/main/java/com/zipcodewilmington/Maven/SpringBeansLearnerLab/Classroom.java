package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

public class Classroom {
    private Instructors instructors;
    private Students students;

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        for(Student student : students){
            student.learn(numberOfHours);
        }
    }
}
