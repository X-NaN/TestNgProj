package com.xnn.dependencyTest;

import org.testng.annotations.Test;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/19  20:05
 * Description:
 * Modified By:
 */
public class AppTest {

    @Test(dependsOnGroups = {"deploy","db"})
    public void method1(){
        System.out.println(" this is method1()");
    }

    @Test(dependsOnMethods ={"method1"})
    public void method2(){
        System.out.println("this is method2()");
    }
}
