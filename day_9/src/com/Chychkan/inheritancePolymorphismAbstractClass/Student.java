package com.Chychkan.inheritancePolymorphismAbstractClass;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Student extends Human{
    private String groupName;

    public String getGroupName(){
        return groupName;
    }

    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }

    //@Override
    void printInfo(){
        System.out.println("st. Это человек с именем " + super.getName());
        System.out.println("st. Это студент с именем " + getName());
    }

}
