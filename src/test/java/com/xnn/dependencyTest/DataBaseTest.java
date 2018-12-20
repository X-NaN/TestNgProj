package com.xnn.dependencyTest;

import org.testng.annotations.Test;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/19  19:59
 * Description:
 * Modified By:
 */
public class DataBaseTest {

    @Test(groups = "db",dependsOnGroups = "deploy")
    public void initDB(){
        System.out.println("This is initDB()");
    }

    @Test(groups = "db",dependsOnMethods = "initDB")
    public void testConncetion(){
        System.out.println("this is testConncetion()");
    }
}
