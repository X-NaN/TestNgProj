package com.xnn.calculate;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/18  15:37
 * Description:
 * Modified By:
 */
public class CalculateTest {

    @Test(enabled = true)//false 忽略测试此测试用例
    public void testAdd() {
        /**
         * assertEquals这个方法是一个断言方法
         * 第一个参数表示预期的结果
         * 第二个参数表示程序的执行结果
         * 当预期结果与执行结果是一致的时候，则表示单元测试成功
         */
        Assert.assertEquals( new Calculate().add(1, 3),4);
        System.out.println("testAdd()");
    }


    @Test
    public void testSubtract() {
        Assert.assertEquals(new Calculate().subtract(9, 5),4 );
        System.out.println("testSubtract()");
    }

    @Test
    public void testMultiply() {
        System.out.println("testMultiply()");
        Assert.assertEquals(new Calculate().multiply(2, 3),6 );

    }

    /**
     * 预期异常测试
     */
    @Test(expectedExceptions =ArithmeticException.class)
    public void testDivide() {
        Assert.assertEquals( new Calculate().divide(9, 0),3);
        System.out.println("testDivide()");
    }

    /**
     * 超时测试
     * 测试冒泡排序
     * @throws Exception
     */
    @Test(timeOut = 2000,enabled = false)
    public void testSort() throws Exception {
        int[] arr = new int[50000]; //数组长度为50000
        int arrLength = arr.length;
        //随机生成数组元素
        Random r = new Random();
        for (int i = 0; i < arrLength; i++) {
            arr[i] = r.nextInt(arrLength);
        }
        //冒泡排序
        new Calculate().sort(arr);
    }

    /**
     * 测试快速排序
     * @throws Exception
     */
    @Test(timeOut = 2000,enabled = false)
    public void testQuickSort()throws Exception{
        int[] arr = new int[50000]; //数组长度为50000
        int arrLength = arr.length;
        //随机生成数组元素
        Random r = new Random();
        for (int i = 0; i < arrLength; i++) {
            arr[i] = r.nextInt(arrLength);
        }

        new Calculate().quickSort(arr);
    }


}
