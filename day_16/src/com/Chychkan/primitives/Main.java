package com.Chychkan.primitives;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers");
	    getAverage(file);
    }

    public static void getAverage(File file) throws FileNotFoundException {
        float average, sum = 0;

        Scanner scanner = new Scanner(file);
        String[] line = scanner.nextLine().split(" ");

        int[] array = new int[6];

        for (String num: line){
            sum += Integer.parseInt(num);
        }
        average = sum/array.length;
        scanner.close();

        System.out.println("Полная форма числа: " + average);
        System.out.print("Сокращенная форма числа: ");
        System.out.printf("%.3f", average);

    }
}
