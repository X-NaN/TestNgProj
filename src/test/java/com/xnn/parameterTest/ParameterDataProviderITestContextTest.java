package com.xnn.parameterTest;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/20  15:00
 * Description:参数化测试
 * ITestContext来确定调用当前测试方法的运行时参数
 * Modified By:
 */
public class ParameterDataProviderITestContextTest {

    @DataProvider(name = "data")
    public Object[][] provideData(ITestContext context){
        Object[][] data=null;
        //<test>标签的name
        System.out.println("<test> name:"+context.getName());

        for (String group:context.getIncludedGroups()){
            System.out.println("group:"+group);
            if (group.equals("groupA")){
                data=new Object[][]{
                        {1}
                };
                break;
            }
        }
        if (data==null){
            data=new Object[][]{
                    {2}
            };
        }
        return data;
    }

    @Test(dataProvider = "data",groups = {"groupA"})
    public void test1(int number){
        Assert.assertEquals(number,1);
    }

    @Test(dataProvider = "data",groups = {"groupB"})
    public void test2(int number){
        Assert.assertEquals(number,2);
    }


}
