package com.xnn.bean;

public enum  LogLevel {
    TestCase(0,"TestCase"),
    Result(1,"Result"),
    Step(1,"Step"),
    Info(1,"Info"),
    Success(1,"Success"),
    Warn(1,"Warn"),
    Error(1,"Error");

    private int id;
    private String name;
    private LogLevel(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
