package com.Chychkan.methodArgs;

import java.util.Arrays;

/**
 * Created by A.I.Chychkan on 23/10/2021
 */

public class Main {

    public static void main(String[] args) {
        Car car1  = new Car("Kia", "Black", 2017);
        System.out.println("Возраст автомобиля: " + car1.yearDifference(2342));

        Plane plane1 = new Plane("Boeing", 1987, 425.4f,33.8f);
        plane1.getInfo();

        plane1.setYear(1990);
        plane1.setLength(56.5f);
        plane1.fillUp(120.1f);
        plane1.fillUp(10.0f);

        plane1.getInfo();

        Teacher teacher1 = new Teacher("Валентина Константиновна", "математика");
        Student student1 = new Student("Антон");

        teacher1.Evaluate(student1);



    }
}
