package com.Chychkan.whileFor;
/**
 * Created by A.I.Chychkan on 21/10/2021
 */

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int year = 1980;
        int k = 5;
        int res = 0;

        System.out.println("------Вывод в строку (while)-----");
            while (i!=10){
                System.out.print("JAVA ");
                i++;
            }

        System.out.println("\n\n------Вывод в столбик (for)-----");
        for(i=0; i<10; i++){
            System.out.println("JAVA");
        }

        System.out.println("\n------Используем while-----");
        while (year <= 2020){
            System.out.println("Олимпиада" + year + "года");
            year = year+4;
        }

        System.out.println("\n-----Используем for------");
        for(year=1980; year<=2020; year=year+4){
            System.out.println("Олимпиада" + year + "года");
        }

        System.out.println("\n-----Используем while------");
        for(i=1; i<=9; i++){
            res = i * k;
            System.out.println(i + " x " + k + " = " + res);
        }
    }
}
