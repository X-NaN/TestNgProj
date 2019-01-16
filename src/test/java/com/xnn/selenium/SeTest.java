package com.xnn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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
    /**
     * 提供参数
     * 通过@DataProvider将参数传递给@Test方法
     * @return
     */
    @DataProvider(name = "loginData")
    public Object[][] provideData(){
        return new Object[][] { { "1186711035", "xnn12230118" }};
    }

    @Test(dataProvider = "loginData")
    public void login(String qqNumber,String pwd){

        //1.调用Chrome浏览器
        //2。打开qq邮箱首页
        //3。输入qq号/密码
        //4。点击登录按钮

        //设置驱动位置
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        //Chrome浏览器驱动
        WebDriver driver=new ChromeDriver();

        //打开qq email首页
        driver.get("https://mail.qq.com/");
        //driver.get("https://xui.ptlogin2.qq.com/cgi-bin/xlogin?target=self&appid=522005705&daid=4&s_url=https://mail.qq.com/cgi-bin/readtemplate?check=false%26t=loginpage_new_jump%26vt=passport%26vm=wpt%26ft=loginpage%26target=&style=25&low_login=1&proxy_url=https://mail.qq.com/proxy.html&need_qr=0&hide_border=1&border_radius=0&self_regurl=http://zc.qq.com/chs/index.html?type=1&app_id=11005?t=regist&pt_feedback_link=http://support.qq.com/discuss/350_1.shtml&css=https://res.mail.qq.com/zh_CN/htmledition/style/ptlogin_input24e6b9.css");
        String title=driver.getTitle();
        System.out.println("title=>"+title);
        //qq号输入框和密码输入框在iframe中
        driver.switchTo().frame("login_frame");
        //输入qq号
        driver.findElement(By.id("u")).sendKeys(qqNumber);
        //输入qq密码
        driver.findElement(By.id("p")).sendKeys(pwd);
        //点击"登录"按钮
        driver.findElement(By.id("login_button")).click();

        //页面跳转需要时间
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String useraddr="1186711035@qq.com";
        WebElement addr= driver.findElement(By.id("useraddr"));


        //断言
        Assert.assertEquals(useraddr,addr.getText());

        driver.close();

    }


}
