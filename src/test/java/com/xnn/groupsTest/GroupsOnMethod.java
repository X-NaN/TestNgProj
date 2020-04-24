package com.xnn.groupsTest;

import org.testng.annotations.Test;

/**
 * 功能描述 <br>
 *
 * @author xingnana
 * @create 2020-04-24
 */
public class GroupsOnMethod {

    @Test(groups = "server")
    public void serverTest1(){
        System.out.println("服务端测试用例1");
    }

    @Test(groups = "server")
    public void serverTest2(){
        System.out.println("服务端测试用例2");
    }

    @Test(groups = "client")
    public void clientTest1(){
        System.out.println("客户端测试用例1");
    }

    @Test(groups = "client")
    public void clientTest2(){
        System.out.println("客户端测试用例2");
    }


}
