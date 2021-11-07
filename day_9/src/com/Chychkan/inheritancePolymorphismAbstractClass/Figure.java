package com.Chychkan.inheritancePolymorphismAbstractClass;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */

public abstract class Figure {
    private String color;

    public Figure(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public abstract double area();
    public abstract double perimeter();


}
