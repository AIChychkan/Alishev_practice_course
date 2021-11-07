package com.Chychkan.inheritancePolymorphismAbstractClass;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */

public class Main {

    public static void main(String[] args) {
        Student stud1 = new Student("Artem", "PI_1");
        Teacher teach1 = new Teacher("Borodinska O. K.", "Math");

        System.out.println(stud1.getGroupName());
        System.out.println(teach1.getSubjectName());

        stud1.printInfo();
        teach1.printInfo();

        //---------------------------------------------------------------------------
        Figure[] figures = {
                new Triangle("Red", 16, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Rectangle("Green", 30, 10),
                new Circle("Red", 6),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        System.out.println("Red objects perimeter = " + calculateRedPerimeter(figures));
        System.out.println("Red objects area = " + calculateRedArea(figures));
    }

        public static double calculateRedPerimeter(Figure[] figures){
            double sumPerimeterRed = 0;
            for (int i = 0; i < figures.length - 1; i++) {
                if (figures[i].getColor().equalsIgnoreCase("Red")) {
                    sumPerimeterRed += figures[i].perimeter();
                }
            }
            return sumPerimeterRed;
        }

        public static double calculateRedArea(Figure[] figures){
            double sumAreaRed = 0;
            for (int i = 0; i < figures.length - 1; i++) {
                if (figures[i].getColor().equalsIgnoreCase("Red")) {
                    sumAreaRed += figures[i].area();
                }
            }
            return sumAreaRed;
        }
    }