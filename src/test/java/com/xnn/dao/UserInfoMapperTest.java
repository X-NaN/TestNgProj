package com.xnn.dao;

import org.testng.annotations.Test;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/19  17:38
 * Description:
 * Modified By:
 */
public class UserInfoMapperTest {

    @Test(groups={"userInfoMapper", "insert"})
    public void testInsertUser() {
        System.out.println("testInsertUser()");
    }

    @Test(groups={"userInfoMapper", "select"})
    public void testSelectByPrimaryKey() {
        System.out.println("testSelectByPrimaryKey()");
    }

    @Test(groups = {"userInfoMapper","update"})
    public void testUpdateByPrimaryKey(){
        System.out.println("testUpdateByPrimaryKey()");
    }

}
