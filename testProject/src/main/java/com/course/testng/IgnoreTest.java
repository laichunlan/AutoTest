package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest{

    @Test
    public void ignoreTest1(){
        System.out.println("这是忽略测试1");
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("这是忽略测试2");
    }
}
