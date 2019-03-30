package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    Students current_students = new Students(
            new Student(1,"Student1"),
            new Student(2,"Student2"));
    Students previous_students= new Students(
            new Student(3,"Student3"),
            new Student(4,"Student4"));

    @Bean
    Students currentStudents(){
        return current_students;
    }
    @Bean
    Students previousStudents(){
        return previous_students;
    }
}
