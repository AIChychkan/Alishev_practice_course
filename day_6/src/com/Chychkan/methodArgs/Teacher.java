package com.Chychkan.methodArgs;

/**
 * Created by A.I.Chychkan on 23/10/2021
 */

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    void Evaluate(Student student){
        int generateNumber = (int)(Math.random()*4+2);
        System.out.print("Преподаватель " + name + " оценил(а) студента с именем " + student.getName() + " по предмету " + subject + " на оценку ");
        switch (generateNumber){
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
        }

    }
}
