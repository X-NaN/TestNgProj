package com.xnn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeTest {

    @BeforeClass
    public void beforeClass(){
        System.out.println("test start...");
    }

    @AfterClass
    public void afterClass(){
        System.out.println(" test end...");
    }

    @Test
    public void actions(){

        //1.调用Chrome浏览器
        //2。打开百度首页
        //3。点击搜索框
        //4。输入关键字Adele
        //5。 单击"搜索按钮"

        //设置驱动位置
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        //Chrome浏览器驱动
        WebDriver driver=new ChromeDriver();

        //打开百度首页
        driver.get("https://www.baidu.com/");
        String title=driver.getTitle();
        System.out.println("title=>"+title);
        //输入搜索关键字
        driver.findElement(By.id("kw")).sendKeys("Adele csdn");
        //点击"百度一下"按钮
        driver.findElement(By.id("su")).click();

        //断言
        //Assert.assertEquals("");

        // Scroll down the webpage by 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 100)");

        // Click on the Search button
        //driver.findElement(By.linkText("【Adele的专栏】C#学习笔记_信息安全_Winform程序开发 - CSDN博客")).click();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

    }


}
