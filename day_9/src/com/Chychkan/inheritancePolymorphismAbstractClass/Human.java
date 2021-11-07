package com.Chychkan.inheritancePolymorphismAbstractClass;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */

public class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }

    //public Human(){}

    public String getName(){
        return name;
    }

    void printInfo(){
        System.out.println("hu. Этот человек с именем " + name);
    }


}
