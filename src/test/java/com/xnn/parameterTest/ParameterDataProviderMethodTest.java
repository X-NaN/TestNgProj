package com.xnn.parameterTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/20  14:16
 * Description:参数化测试
 * @DataProvider + 方法
 * 根据测试方法名称传递不同的参数
 * Modified By:
 */
public class ParameterDataProviderMethodTest {

    /**
     * 测试方法
     * @param number
     * @param expected
     */
    @Test(dataProvider = "data")
    public void test1(int number,int expected){
        Assert.assertEquals(number,expected);
    }

    /**
     * 测试方法
     * @param email
     * @param expected
     */
    @Test(dataProvider = "data")
    public void test2(String email,String expected){
        Assert.assertEquals(email,expected);
    }

    /**
     * 测试数据
     * @param method
     * @return
     */
    @DataProvider(name = "data")
    public Object[][] provideData(Method method){
        Object[][] data=null;
        if (method.getName().equals("test1")){
            data=new Object[][]{
                    {1,1},{2,2}
            };
        }else if (method.getName().equals("test2")){
            data=new Object[][]{
                    {"1186711035@11.com","1186711035@11.com"},
                    {"test@163.com","test@163.com"}
            };
        }

        return data;
    }


}
