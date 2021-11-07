package com.Chychkan.inheritancePolymorphismAbstractClass;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */

public class Circle extends Figure{
    private double r;

    public Circle(String color, double r){
        super(color);
        this.r = r;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(2.0,2.0);
    }

    @Override
    public double perimeter() {
        return 2.0 * Math.PI * r;
    }
}