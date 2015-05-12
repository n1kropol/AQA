package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Admin on 08.04.15.
 */
@RunWith(JUnit4.class)
public class UTest {
    @Test
    public void test2(){
        int a = 10;
        int b =5;
        int expectedResult = 16;
        Assert.assertEquals("Test failed!!!",expectedResult, a + b);
        Assert.assertTrue("Test failed!!!", expectedResult == (a + b));
    }
}
