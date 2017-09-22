package com.idiot.junit;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.*;


public class AssertionTest {


    @Test
    public void test(){
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obi4 = "test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] arithmetic1 = {1,2,3};
        int[] arithmetic2 = {1,2,3};

        assertEquals(obj1,obj2);

        assertSame(obj3,obi4);

        assertNotSame(obj2,obi4);

        assertNull(obj5);

        assertTure(var1,var2);

        assertArrayEquals(arithmetic1,arithmetic2);
    }

    private void assertTure(int var1, int var2) {
    }

}
