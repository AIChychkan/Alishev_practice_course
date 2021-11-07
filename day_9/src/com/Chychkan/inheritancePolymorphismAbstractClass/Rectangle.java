package com.Chychkan.inheritancePolymorphismAbstractClass;

import org.w3c.dom.css.Rect;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */

public class Rectangle extends Figure{
    private double width, height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }
}