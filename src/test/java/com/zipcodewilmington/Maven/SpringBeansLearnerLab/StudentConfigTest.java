package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    public void currentStudentsTest(){
        Students students = applicationContext.getBean("currentStudents",Students.class);
        Assert.assertEquals(students.size(), 2);

    }

    @Test
    public void previousStudentsTest(){
        Assert.assertEquals(previousStudents.size(), 2);
        Assert.assertEquals(previousStudents.findById(3).getTotalStudyTime(), 1200, 0.01);
    }
}
