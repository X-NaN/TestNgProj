package com.xnn.parameterTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created with IDEA
 * Author:Nana Xing
 * Date:2018/12/20  11:49
 * Description:参数化测试
 * 通过@DataProvider 传递一个对象参数（复杂参数，如Map） 给@Test方法
 * Modified By:
 */
public class ParameterDataProviderTest2 {

    /**
     * 读取属性文件
     * @return
     */
    public Map<String,String > readDbConfig(){
        Properties prop=new Properties();
        InputStream input=null;
        Map<String,String > map=new HashMap<>();

        input=this.getClass().getClassLoader().getResourceAsStream("jdbc.properties");

        try {
            prop.load(input);
            map.put("jdbc.driver",prop.getProperty("jdbc.driver"));
            map.put("jdbc.url",prop.getProperty("jdbc.url"));
            map.put("jdbc.username",prop.getProperty("jdbc.username"));
            map.put("jdbc.password",prop.getProperty("jdbc.password"));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(input!=null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return map;
    }

    /**
     * 提供参数
     * @DataProvider 支持传递一个对象参数Map
     * @return
     */
    @DataProvider(name = "dbConfig")
    public Object[][] provideData(){
        Map<String ,String> map=readDbConfig();
        return new Object[][]{{map}};
    }

    /**
     * 测试方法
     * @param map
     */
    @Test(dataProvider = "dbConfig")
    public void testConnection(Map<String,String> map){
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("[key]:"+entry.getKey()+"，[value]:"+entry.getValue());
        }
    }


}
