package com.xnn.util;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/20  15:36
 * Description:
 * Modified By:
 */
public class CharUtilsTest {

    @DataProvider
    public Object[][] provideData(){
        Object[][] data=new Object[][]{
                { 'A', 65 },{ 'a', 97 },
                { 'B', 66 },{ 'b', 98 },
                { 'C', 67 },{ 'c', 99 },
                { 'D', 68 },{ 'd', 100 },
                { 'Z', 90 },{ 'z', 122 },
                { '1', 49 },{ '9', 57 }
        };

        return data;
    }

    @Test(dataProvider = "provideData")
    public void testCharToASCII(final char ch,final int ascii){
        int result=CharUtils.charToASCII(ch);
        Assert.assertEquals(result,ascii);
    }

    @Test(dataProvider = "provideData")
    public void testAsciiToChar(final char ch,final int ascii){
        char result=CharUtils.asciiToChar(ascii);
        Assert.assertEquals(result,ch);
    }

}
