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
public class ClassroomConfigTest {
    @Autowired @Qualifier("previousCohort")
    Classroom previousCohort;

    @Autowired @Qualifier("currentCohort")
    Classroom currentCohort;
    @Test
    public void currentCohortTest(){
        Assert.assertEquals(currentCohort.getInstructors().size(), 4);
        Assert.assertEquals(currentCohort.getStudents().size(), 2);
    }

    @Test
    public void previousCohortTest(){
        Assert.assertEquals(previousCohort.getInstructors().size(), 4);
        Assert.assertEquals(previousCohort.getStudents().size(), 2);
    }
}
