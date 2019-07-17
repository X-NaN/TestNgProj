package com.xnn.bean;

public enum  LogLevel {
    TestCase(0,"TestCase"),
    Result(1,"Result"),
    Step(1,"Step"),
    Info(3,"Info"),
    Success(3,"Success"),
    Warn(3,"Warn"),
    Error(3,"Error");

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
