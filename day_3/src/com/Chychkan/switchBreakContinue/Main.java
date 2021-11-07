package com.Chychkan.switchBreakContinue;

import java.util.Scanner;

/**
 * Created by A.I.Chychkan on 22/10/2021
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер программы: ");

        int exNumber = sc.nextInt();

        switch (exNumber) {
            case 1:
                System.out.println("--- Программа 1 запущена ---");
                ex1();
                break;
            case 2:
                System.out.println("--- Программа 2 запущена ---");
                ex2();
                break;
            case 3:
                System.out.println("--- Программа 3 запущена ---");
                ex3();
                break;
            case 4:
                System.out.println("--- Программа 4 запущена ---");
                ex4();
                break;
            default:
                System.out.println("Введите корректный номер программы");

        }
    }

    //----------------------------------------------------------------------------------
    static void ex1() {

        Scanner sc = new Scanner(System.in);
        String city = "default";

        while (city != "stop") {
            System.out.print("Введите название города: ");
            city = sc.nextLine();
            switch (city) {
                case ("Москва"):
                case ("Владивосток"):
                case ("Ростов"):
                    System.out.print(city + " находится в России.\n");
                    break;
                case ("Рим"):
                case ("Милан"):
                case ("Турин"):
                    System.out.print(city + " находится в Италии.\n");
                    break;
                case ("Ливерпуль"):
                case ("Манчестер"):
                case ("Лондон"):
                    System.out.print(city + " находится в Англии.\n");
                    break;
                case ("Берлин"):
                case ("Мюнхен"):
                case ("Кёльн"):
                    System.out.print(city + " находится в Германии.\n");
                    break;
                case ("stop"):
                    System.out.println("Программа прекратила свою работу.");
                    city = "stop";
                    break;
                default:
                    System.out.println("Неизвестная страна");

            }
        }
    }

    //----------------------------------------------------------------------------------
    static void ex2(){
        double a,b,res;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите вещественное число 'a' с запятой: ");
        a = sc.nextDouble();
        System.out.print("Введите вещественное число 'b' с запятой: ");
        b = sc.nextDouble();

        while (b!=0){
            res=a/b;
            System.out.println("Результат деления a/b = "+ res);
            System.out.print("Введите вещественное число 'a' с запятой: ");
            a = sc.nextDouble();
            System.out.print("Введите вещественное число 'b' с запятой: ");
            b = sc.nextDouble();
        }
        System.out.print("Программа прекратира работу.");
    }

    // Та же задачка но с break;---------------------------------------------------------
    static void ex3(){
        double a,b,res;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Введите вещественное число 'a' с запятой: ");
            a = sc.nextDouble();
            System.out.print("Введите вещественное число 'b' с запятой: ");
            b = sc.nextDouble();
            res=a/b;
            if (b==0)break;
            System.out.println("Результат деления a/b = "+ res);
        }
        System.out.print("Программа прекратира работу.");
    }

    //----------------------------------------------------------------------------------
    static void ex4(){
        double a,b,res;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            System.out.print("Введите вещественное число 'a' с запятой: ");
            a = sc.nextDouble();
            System.out.print(i+"Введите вещественное число 'b' с запятой: ");
            b = sc.nextDouble();
            if(b==0){
                System.out.println("Так низя! Делитель не может равняться 0. Попробуй ищчо.\n--------------------------------------------------------");
                continue;
            }
            res = a / b;
            System.out.println("Результат деления a/b = " + res+"\n--------------------------------------------------------");
        }
    }
}

