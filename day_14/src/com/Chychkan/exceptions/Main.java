package com.Chychkan.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File fileNumbers = new File("src\\Text_files\\numbers");
        File namesAges = new File("src\\Text_files\\people");

        //System.out.println("Сумма всех числе в файле = " + printSumDigits(fileNumbers));
        printSumDigits(fileNumbers);

//-----------------------------------------------------
        //parseFileToStringList(namesAges);
        System.out.print("Список людей из файла people.txt: " + parseFileToStringList(namesAges) + "\n");
//-----------------------------------------------------

        System.out.println(Human.parseFileToObjList(namesAges));

    }

    public static void printSumDigits(File file) {
        int sum = 0;

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            scanner.close();

            for (String num: numbersString){
                sum += Integer.parseInt(num);
            }

            if(numbersString.length != 5)throw new IllegalArgumentException();
            else System.out.println("Сумма всех числе в файле numbers.txt= " + sum);

        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IllegalArgumentException e){
            System.out.println("Incorrect file data.");
        }
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        List<String> peopleList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] nameAgeString = line.split(" ");

                if (Integer.parseInt(nameAgeString[1]) < 0) throw new IllegalArgumentException();
                peopleList.add(line);
            }
            scanner.close();
            return peopleList;
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IllegalArgumentException e){
            System.out.println("Incorrect file data.");
        }
        return null;
    }
}