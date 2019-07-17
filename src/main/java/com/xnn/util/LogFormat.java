package com.xnn.util;

import com.xnn.bean.LogLevel;
import com.xnn.bean.TestCaseLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class LogFormat {

    public static void readFile() {
        String base = LogFormat.class.getClassLoader().getResource("").getPath();
        String pathname = "data/mtest.log";
        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try {
            FileReader reader = new FileReader(pathname);
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            String line;
            //网友推荐更加简洁的写法
            List<TestCaseLog> logList=new LinkedList<>();
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
                TestCaseLog log = null;
                if (line.contains("<TestCase>")) {
                    log = new TestCaseLog(LogLevel.TestCase.getId(), LogLevel.TestCase.getName(), line.replace("<TestCase>","").trim());
                }else if(line.contains("<Step>")){
                    log = new TestCaseLog(LogLevel.Step.getId(), LogLevel.Step.getName(), line.replace("<Step>","").trim());
                }else if(line.contains("<Info>")){
                    log = new TestCaseLog(LogLevel.Info.getId(), LogLevel.Info.getName(), line.replace("<Info>","").trim());
                }else if(line.contains("<Success>")){
                    log = new TestCaseLog(LogLevel.Success.getId(), LogLevel.Success.getName(), line.replace("<Success>","").trim());
                }else if(line.contains("<Warn>")){
                    log = new TestCaseLog(LogLevel.Warn.getId(), LogLevel.Warn.getName(), line.replace("<Warn>","").trim());
                }else if(line.contains("<Error>")){
                    log = new TestCaseLog(LogLevel.Error.getId(), LogLevel.Error.getName(), line.replace("<Error>","").trim());
                }
                if (log!=null){
                    logList.add(log);
                }
            }
            String s="";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]) {
        readFile();
    }
}
