package com.xnn.groupsTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/19  17:21
 * Description: 测试需要的配置
 * Modified By:
 */
public class TestConfig {
    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("testBeforeSuite()");
    }

    @AfterSuite
    public void testAfterSuite(){
        System.out.println("testAfterSuite()");
    }

    @BeforeTest
    public void testBeforeTest(){
        System.out.println("testBeforeTest()");
    }

    @AfterTest
    public void testAfterTest(){
        System.out.println("testAfterTest()");
    }

}
