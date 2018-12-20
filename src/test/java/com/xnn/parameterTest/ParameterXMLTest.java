package com.xnn.parameterTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/20  11:41
 * Description:参数化测试
 * 通过XML 和 @Parameters将参数传递给@Test方法
 * 参数放置在xml中，使得代码与测试数据分离
 * Modified By:
 */
public class ParameterXMLTest {

        Connection connection;

    /**
     *  通过XML 和 @Parameters将参数传递给@Test方法
     * @param dbConfig
     * @param poolSize
     */
    @Test
        @Parameters({"dbConfig","poolSize"})
        public void createConncetion(String dbConfig,int poolSize){
            System.out.println("数据库配置文件："+dbConfig);
            System.out.println("连接池大小："+poolSize);

            Properties prop=new Properties();
            InputStream input=null;

            try {
                //第一种方式：从项目的类路径下加载属性文件，则jdbc.properties需要放置在于pom.xml同级目录下
                //System.getProperty("user.dir") 获取项目路径
                //String path=System.getProperty("user.dir")+ "\\"+dbConfig;
                //prop.load(new FileInputStream(dbConfig));

                String packagePath = this.getClass().getResource("").getPath();

                //第二种方式 类的根路径classpath
                input=this.getClass().getClassLoader().getResourceAsStream(dbConfig);
                prop.load(input);

                String driver=prop.getProperty("jdbc.driver");
                String url=prop.getProperty("jdbc.url");
                String username=prop.getProperty("jdbc.username");
                String password=prop.getProperty("jdbc.password");

                System.out.println("drivers : " + driver);
                System.out.println("connectionURL : " + url);
                System.out.println("username : " + username);
                System.out.println("password : " + password);

                Class.forName(driver);
                connection= DriverManager.getConnection(url,username,password);
                System.out.println("数据库连接："+connection);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                if (input!=null){
                    try {
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
}
