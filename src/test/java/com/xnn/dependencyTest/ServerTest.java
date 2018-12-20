package com.xnn.dependencyTest;

import org.testng.annotations.Test;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/19  19:51
 * Description: 这个类中的所有方法都属于组deploy
 * Modified By:
 */
@Test(groups = "deploy")
public class ServerTest {

    @Test
    public void deployServer(){
        System.out.println("Deploying Server......");
        //throw new RuntimeException();
    }

    /**
     * 依赖测试，本方法依赖方法deployServer（）
     * 如果deployServer（）失败，则跳过deployBackUpServer（）
     */
    @Test(dependsOnMethods = "deployServer")
    public void deployBackUpServer(){
        System.out.println("Deploy Backup Server.....");
    }

}
