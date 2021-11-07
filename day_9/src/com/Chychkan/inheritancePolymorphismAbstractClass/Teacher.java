package com.Chychkan.inheritancePolymorphismAbstractClass;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Teacher extends Human{
    private String subjectName;

    public String getSubjectName(){
        return subjectName;
    }

    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }

    void printInfo(){
        System.out.println("te. Это человек с именем " + super.getName());
        System.out.println("te. Это преподаватель с именем " + getName());
    }

}
