package com.Chychkan.inheritancePolymorphismAbstractClass;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */

public class Triangle extends Figure{
    private double a, b, c;

    public Triangle(String color, double a, double b, double c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = perimeter() / 2.0; //halfPerimeter
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return (a + b + c);
    }
}