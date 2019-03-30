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
public class InstructorsConfigTest {
    @Autowired @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired @Qualifier("tcUkInstructors")
    Instructors tcUkInstructors;

    @Autowired @Qualifier("instructors")
    Instructors instructors;

    @Test
    public void tcUsaInstructorsTest(){
        Assert.assertEquals(tcUsaInstructors.size(), 2);
    }

    @Test
    public void tcUkInstructorsTest(){
        Assert.assertEquals(tcUkInstructors.size(), 2);
    }

    @Test
    public void instructorsTest(){
        Assert.assertEquals(instructors.size(), 4);
    }}
