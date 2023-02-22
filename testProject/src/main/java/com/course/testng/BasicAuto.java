package com.course.testng;

import org.testng.annotations.*;

public class BasicAuto {
    @Test
    public void testCase1(){
        System.out.println("这是一个测试用例");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("用例之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类之前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类之后运行的");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("这是beforeSuit测试套件");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("这是afterSuit测试套件");
    }
}
