package com.course.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TestMethodsDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
}
