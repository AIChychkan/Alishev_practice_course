package com.Chychkan.methodArgs;

/**
 * Created by A.I.Chychkan on 23/10/2021
 */

public class Plane {
    private String producer;
    private int year;
    private float length, weight, fuel;

    public Plane(String producer, int year, float length, float weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0.0f;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public float getFuel() {
        return fuel;
    }

    void getInfo(){
        System.out.println("--- Информация о самолёте ---\nИзготовитель: " + producer + "\nГод выпуска: " + year + "\nДлина: " + length + " м" + "\nВес: " + weight + " т" + "\nТоплива в баке: " + fuel + " л");
    }

    void fillUp(float fuel){
        this.fuel = this.fuel + fuel;
    }
}
