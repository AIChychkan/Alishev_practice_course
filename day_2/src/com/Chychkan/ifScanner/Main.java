package com.Chychkan.ifScanner;
import java.util.Scanner;

/**
 * Created by A.I.Chychkan on 21/10/2021
 */

public class Main extends NumberFormatException {

    public static void main(String[] args) {

        int exerciseNum;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите номер программы (1-4): ");
        exerciseNum = sc.nextInt();
        while (exerciseNum < 1 || exerciseNum > 4) {
            System.out.print("Некоректный ввод! Введите номер программы (1-4): ");
            exerciseNum = sc.nextInt();
        }

        switch (exerciseNum) {
            case (1):
                System.out.println("\nПрограмма 1 запущена!");
                ex1();
                break;
            case (2):
                System.out.println("\nПрограмма 2 запущена!");
                ex2();
                break;
            case (3):
                System.out.println("\nПрограмма 3 запущена!");
                ex3();
            case (4):
                System.out.println("\nПрограмма 4 запущена!");
                ex4();
                break;
        }
    }

    //----------------------------------------------------------------------------------------------------
    static void ex1() {
            int floorCount;
            Scanner sc = new Scanner(System.in);
            System.out.println("-----Задача 1-----");
            System.out.print("Введите кол. этажей здания: ");
            floorCount = sc.nextInt();


            while (floorCount <= 0) {
                if (floorCount > 0) {
                    break;
                } else {
                    System.out.println("Кол. этажей не может быть меньше 1. Повторите ввод.");
                    System.out.print("Введите кол. этажей здания: ");
                    floorCount = sc.nextInt();
                }
            }
            System.out.println("Кол. этажей = " + floorCount + "\n" + "------------------");

            System.out.println("Ниже представлена информация о типе здания:");
            if (floorCount >= 1 && floorCount <= 4) {
                System.out.println("Малоэтажный дом.");
            } else if (floorCount >= 5 && floorCount <= 8) {
                System.out.println("Среднеэтажный дом.");
            } else if (floorCount >= 9) {
                System.out.println("Многоэтажный дом.");
            }
        }

        //----------------------------------------------------------------------------------------------------
        static void ex2() {
            int i, a, b, countBMoreA, countALessB;

            Scanner sc = new Scanner(System.in);
            System.out.printf("\n-----Задача 2-----\n");

            System.out.print("Введите первое число: ");
            a = sc.nextInt();
            System.out.print("Введите второе число: ");
            b = sc.nextInt();

            while (a == b) {
                System.out.println("Как дела, нормально? Числа должны быть разными!");
                System.out.print("Введите первое число: ");
                a = sc.nextInt();
                System.out.print("Введите второе число: ");
                b = sc.nextInt();
            }
            countBMoreA = b - a - 2;//(-2) - не учитывать первое и последнее число из диапазона;
            countALessB = a - b - 2;//(-2) - не учитывать первое и последнее число из диапазона;

            if (a < b) {
                a++;//(+1) - не учитывать первое и последнее число из диапазона;
                System.out.print("Все числа из заданного диапазона:\n");
                for (i = 0; i <= countBMoreA; i++) {
                    if (a % 5 == 0 && a % 10 != 0) {
                        System.out.println(a);
                        a++;
                    } else a++;
                }
            } else if (a > b) {
                b++;//(+1) - не учитывать первое и последнее число из диапазона;
                System.out.println("В след. раз введите первое число, чтоб оно было меньше второго. Ну да ладно, я все равно посчитаю.\nВот ваш результат:");
                for (i = 0; i <= countALessB; i++) {
                    if (b % 5 == 0 && b % 10 != 0) {
                        System.out.println(b);
                        b++;
                    } else b++;
                }
            }
        }

        // Реализация 2 программы используя while------------------------------------------------------------
        static void ex3() {
            int i, a, b, countBMoreA, countALessB;
            Scanner sc = new Scanner(System.in);

            System.out.printf("\n-----Задача 2, но с циклом while-----\n");

            System.out.print("Введите первое число: ");
            a = sc.nextInt();
            System.out.print("Введите второе число: ");
            b = sc.nextInt();

            while (a==b){
                System.out.println("Как дела, нормально? Числа должны быть разными!");
                System.out.print("Введите первое число: ");
                a = sc.nextInt();
                System.out.print("Введите второе число: ");
                b = sc.nextInt();
            }
            countBMoreA=b-a-2;//(-2) - не учитывать первое и последнее число из диапазона;
            countALessB=a-b-2;//(-2) - не учитывать первое и последнее число из диапазона;

            if(a<b) {
                i=0;
                a++;//(+1) - не учитывать первое и последнее число из диапазона;
                System.out.print("Все числа из заданного диапазона:\n");

                while (i<=countBMoreA){
                    if(a%5==0 && a%10!=0) {
                        System.out.println(a);
                        a++;
                        i++;
                    }
                    else {
                        a++;
                        i++;
                    }
                }
            }
            else if (a>b){
                i=0;
                b++;//(+1) - не учитывать первое и последнее число из диапазона;
                System.out.println("В след. раз введите первое число, чтоб оно было меньше второго. Ну да ладно, я все равно посчитаю.\nВот ваш результат:");

                while (i<=countALessB){
                    if(b%5==0 && b%10!=0) {
                        System.out.println(b);
                        b++;
                        i++;
                    }
                    else {
                        b++;
                        i++;
                    }
                }
            }
        }

    //----------------------------------------------------------------------------------------------------
        static void ex4() {
            double x,y,pow1,pow2;
            Scanner sc = new Scanner(System.in);

            System.out.print("Введите число Х в виде вещественного числа, используя запятую: ");
            x = sc.nextDouble();
            System.out.println("Ваше число = " + x);

            if(x>=5){
                pow1=Math.pow(x,2.0);
                y = (pow1-10)/(x+7);
            }
            else if(x>-3 && x<5){
                pow2=Math.pow(x,2.0);
                y = (x+3)/(pow2-2);
            }
            else y=420;

            System.out.println("Результат:\ny = " + y);
        }
}

