package com.idiot.junit;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FristDayAtSchoolTest {

    FirstDayAtSchool school = new FirstDayAtSchool();
    String[] bag1 = {"Books","Notebooks","Pens"};
    String[] bag2 = {"Books","Notebooks","Pens","Pencils"};


    @Test
    public void testPrepareMyBag(){
        System.out.println("Inside testPrepareMyBag()");
        assertArrayEquals(bag1,school.prepareMyBag());
    }

    @Test
    public void testAddPencils(){
        System.out.println("Inside testAddPencils()");
        assertArrayEquals(bag2,school.addPencils());
    }
}
