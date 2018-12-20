package com.xnn;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/19  17:01
 * Description:
 * runSelenium()和runSelenium1()属于分组：selenium-test。
 * testConnectOracle()和testConnectMsSQL()属于分组：database 。
 * 如果分组selenium-test和database通过，则runFinal()将被执行。
 * Modified By:
 */
public class GroupTest {
    /**
     *   @BeforeGroups("database")
     *  在调用属于该组的第一个测试方法之前运行
     */
    @BeforeGroups("database")
    public void setupDB() {
        System.out.println("setupDB()");
    }

    /**
     * @AfterGroups("database")
     * 在调用属于组的最后一个测试方法之后运行
     */
    @AfterGroups("database")
    public void cleanDB() {
        System.out.println("cleanDB()");
    }

    /**
     * 在方法上的分组
     *  @Test(groups = "selenium-test")
     */
    @Test(groups = "selenium-test")
    public void runSelenium() {
        System.out.println("runSelenium()");
    }

    @Test(groups = "selenium-test")
    public void runSelenium1() {
        System.out.println("runSelenium()1");
    }

    @Test(groups = "database")
    public void testConnectOracle() {
        System.out.println("testConnectOracle()");
    }

    @Test(groups = "database")
    public void testConnectMsSQL() {
        System.out.println("testConnectMsSQL");
    }

    @Test(dependsOnGroups = { "database", "selenium-test" })
    public void runFinal() {
        System.out.println("runFinal");
    }
}
