package com.Chychkan.stringBuilderObjectToString;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */

public class Main {

    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        long startTime, stopTime;

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 20001; i++){
            str1.append(i);
            str1.append(", ");
        }
        stopTime = System.currentTimeMillis();
        //System.out.println(str1);
        System.out.println("Длительность работы цикла со StringBuilder, в мс.: " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        String str2 = new String();

        for(int j = 0; j < 20001; j++){
            str2 = str2 + j + ", ";
        }

        //System.out.println(str2);
        stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы цикла со String, в мс.: " + (stopTime - startTime));

//---------------------------------------------------------------------------------------------------------------
        Plane plane1 = new Plane("Boeing", 1987, 425.4f,33.8f);
        plane1.getInfo();
        System.out.println(plane1);
    }
}
