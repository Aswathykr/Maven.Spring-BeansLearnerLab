package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    Instructors tcUsaInstructors = new Instructors(
            new Instructor(1,"Instructor1"),
            new Instructor(2,"Instructor2"));
    Instructors tcUkInstructors = new Instructors(
            new Instructor(3,"Instructor3"),
            new Instructor(4,"Instructor4"));

    @Bean
    Instructors tcUsaInstructors(){
        return tcUsaInstructors;
    }

    @Bean
    Instructors tcUkInstructors(){
        return tcUkInstructors;
    }

    @Bean
    @Primary
    Instructors instructors(){
        Instructors instructors = new Instructors();
        instructors.addAll(tcUkInstructors);
        instructors.addAll(tcUsaInstructors);
        return instructors;
    }

}
