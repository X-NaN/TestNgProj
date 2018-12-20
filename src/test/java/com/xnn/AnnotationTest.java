package com.xnn;

import org.testng.annotations.*;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/19  14:41
 * Description:
 * Modified By:
 */
public class AnnotationTest {

    /**
     *   @BeforeSuite
     *   对于套件测试，在此套件中的所有测试运行之前运行。
     */
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite");
    }

    /**
     * @AfterSuite
     * 对于套件测试，在此套件中的所有测试运行之后运行。
     */
    @AfterSuite
    public void afterSuite(){
        System.out.println("@AfterSuite");
    }

    /**
     * @BeforeTest
     * 对于套件测试，在运行属于<test>标签内的类的任何测试方法之前运行
     */
    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest");
    }

    /**
     *  @AfterTest
     * 对于套件测试，在运行属于<test>标签内的类的所有测试方法都已运行之后运行
     */
    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest");
    }

    /**
     * 在每个测试方法之前运行
     */
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("@AfterMethod");
    }

    @Test
    public void test1(){
        System.out.println("com.xnn.AnnotationTest- test1()");
    }

    @Test
    public void test2(){
        System.out.println("com.xnn.AnnotationTest -test2()");
    }

}
