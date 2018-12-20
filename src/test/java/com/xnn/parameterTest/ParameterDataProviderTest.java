package com.xnn.parameterTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/20  11:43
 * Description:参数化测试
 *  通过@DataProvider将参数（简单参数，如int）传递给@Test方法
 * Modified By:
 */
public class ParameterDataProviderTest {

    /**
     * 提供参数
     * 通过@DataProvider将参数传递给@Test方法
     * @return
     */
    @DataProvider(name = "provideNumbers")
    public Object[][] provideData(){
        return new Object[][] { { 10, 20 }, { 100, 110 }, { 200, 210 } };
    }

    /***
     * 测试方法
     * @param number 参数1 输入值
     * @param expected 参数2 期望值
     */
    @Test(dataProvider = "provideNumbers")
    public void testAdd(int number,int expected){
        Assert.assertEquals(number+10,expected);
    }

}
