package com.baobaotao.reflect;

public class Car {
    private String brand;
    private String color;
    private int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //③未带参的方法
    public void introduce() {

        System.out.println("brand:"+brand+";color:"+color+";maxSpeed:" +maxSpeed);
    }
    //省略参数的getter/Setter方法
}