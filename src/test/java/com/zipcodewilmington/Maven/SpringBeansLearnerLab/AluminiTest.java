package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AluminiTest {
    @Autowired @Qualifier("previousStudents")
    Students previousStudents;

    @Autowired @Qualifier("instructors")
    Instructors instructors;

    @Test
    public void previousStudentsTest(){
        Assert.assertEquals(previousStudents.size(), 2);
        Assert.assertEquals(previousStudents.findById(3).getTotalStudyTime(), 1200, 0.01);
    }
    @Test
    public void instructorsTest(){
        Assert.assertEquals(instructors.size(), 4);
        Assert.assertEquals(instructors.findById(1).getNumberOfHoursTaught(), 600, 0.01);
    }

}
