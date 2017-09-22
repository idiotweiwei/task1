package com.test.bean;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("学习独孤九剑");
        System.out.println("name："+getName()+"  age:"+getAge());
    }
}
