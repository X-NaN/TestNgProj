package com.xnn.groupsTest;

import org.testng.annotations.Test;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/19  17:25
 * Description:
 * 一个测试类中包含两个分组db和db_nosql
 * Modified By:
 */
public class DatabaseTest {

    @Test(groups = "db")
    public void testConnectOracle(){
        System.out.println("testConnectOracle()");
    }

    @Test(groups = "db")
    public void testConnectMySQL(){
        System.out.println("testConnectMySQL()");
    }

    @Test(groups = "db_nosql")
    public void testConnectRedis(){
        System.out.println("testConnectRedis()");
    }

    @Test(groups = "db_nosql")
    public void testConncetMongoDB(){
        System.out.println("testConncetMongoDB()");
    }

}
