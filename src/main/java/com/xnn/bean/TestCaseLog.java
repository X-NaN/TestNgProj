package com.xnn.bean;

public class TestCaseLog {
    int logLevel;
    String logName;
    String logContent;

    public TestCaseLog(int logLevel,String logName,String logContent){
        this.logLevel=logLevel;
        this.logName=logName;
        this.logContent=logContent;
    }

    public int getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(int logLevel) {
        this.logLevel = logLevel;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }
}
