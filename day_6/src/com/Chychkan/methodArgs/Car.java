package com.Chychkan.methodArgs;

/**
 * Created by A.I.Chychkan on 23/10/2021
 */

public class Car {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getInfoModel(){
        return model;
    }

    public void setcolor(String color){
        this.color = color;
    }
    public String getInfoColor(){
        return color;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getInfoYear(){
        return year;
    }

    void Info(){
        System.out.println("Этот автомобиль");
    }

    int yearDifference(int inputYear){
        return Math.abs(inputYear-year);
    }
}
