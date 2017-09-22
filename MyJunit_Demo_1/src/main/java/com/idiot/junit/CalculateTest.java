package com.idiot.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest {
    Calculate calculate = new Calculate();
    int sum = calculate.sum(2,5);
    int testSum = 7;

    @Test
    public void testSum(){
        System.out.println("@Test.sum():"+sum+"="+testSum);
        assertEquals(sum,testSum);
    }
}
