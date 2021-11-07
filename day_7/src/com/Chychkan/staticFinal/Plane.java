package com.Chychkan.staticFinal;

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

    public float getLength() {
        return length;
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

    public static void compareAirplanes(Plane plane1, Plane plane2){
        if (plane1.getLength()> plane2.getLength()) System.out.println("Plane 1 is longer than Plane 2.");
        else if(plane2.getLength()> plane1.getLength()) System.out.println("Plane 2 is longer than Plane 1.");
        else System.out.println("Planes 1 and 2 are the same length.");
    }
}
