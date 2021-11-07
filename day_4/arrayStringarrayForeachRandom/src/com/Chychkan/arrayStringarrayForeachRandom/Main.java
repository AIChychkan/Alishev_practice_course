package com.Chychkan.arrayStringarrayForeachRandom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by A.I.Chychkan on 23/10/2021
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

    static void ex1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int moreThanEight = 0, oddNumber = 0, equalsOne = 0, evenNumber = 0, sum = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = (int)(Math.random()*10+1);
            if (arr[i] > 8)moreThanEight++;
            if (arr[i] == 1)equalsOne++;
            if (arr[i]%2 == 0)oddNumber++;
            if (arr[i]%2 == 1)evenNumber++;
            sum = sum + arr[i];
        }

        System.out.println("\nВывод с помощю for each:");
        for(int num: arr){
            System.out.print(num+", ");
        }

        System.out.println("\nВывод с помощю toString():");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nНиже представлена инофрмация о массиве:");
        System.out.println("а) Длина массива: "+ arr.length);
        System.out.println("б) Количество чисел больше 8: " + moreThanEight);
        System.out.println("в) Количество чисел равных 1: " + equalsOne);
        System.out.println("г) Количество четных чисел: " + oddNumber);
        System.out.println("д) Количество нечетных чисел " + evenNumber);
        System.out.println("е) Сумма всех элементов массива " + sum);
    }

    //-------------------------------------------------------------------------------------------------
    static void ex2(){
        int max = 0, min = 0, j = 0, countEndsZero = 0;
        long sumCountEndsZero = 0;
        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000 + 1);
        }
        System.out.println("Полученный массив:\n"+Arrays.toString(arr));

        for(int num: arr){
            if(max < arr[j]){
                max = arr[j];
            }
            j++;
        }

        j = 0;
        min = max;
        for(int num: arr){
            if(min > arr[j]){
                min = arr[j];
            }
            j++;
        }

        j = 0;
        for(int num: arr){
            if(arr[j] % 10 == 0 || arr[j] == 0){
                countEndsZero++;
                sumCountEndsZero = sumCountEndsZero + arr[j];
            }
            j++;
        }
        System.out.println("a) Максимальное число массива: " + max);
        System.out.println("б) Минимальное число массива: " + min);
        System.out.println("в) Количество элементов массива, оканчивающихся на 0: " + countEndsZero);
        System.out.println("г) Сумма элементов массива, оканчивающихся на 0: " + sumCountEndsZero);
    }

    //-------------------------------------------------------------------------------------------------
    static void ex3(){
        int[][] arr = new int[12][8];
        int[] sumRow = new int[arr.length];
        int maxSum = 0, k = 0, indMaxSumRow = 0;

        System.out.println("\nВывод массива в таблице:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < 8; j++){
                arr[i][j] = (int)(Math.random() * 50 + 1);
                System.out.print(arr[i][j] + " ");
                sumRow[i] = sumRow[i]+arr[i][j];
            }
            System.out.print("\n");
        }

        for(int num: sumRow){
            if(maxSum < sumRow[k]){
                maxSum = sumRow[k];
                indMaxSumRow=k;
            }
            else if(maxSum == sumRow[k]){
                indMaxSumRow=k;
            }
            k++;
        }

        System.out.println("\nВывод массива в строку: \n" + Arrays.deepToString(arr));
        System.out.println("\nСумма чисел в каждой строке: \n" + Arrays.toString(sumRow));
        System.out.println("Индекс (последней!) строки с найбольшей суммой чисел: " + indMaxSumRow);
    }

    //-------------------------------------------------------------------------------------------------
    static void ex4(){
        int[] arr = new int[15];
        int maxDigit = 0, maxSum = 0, k = 0, nextSum = 0, lastSum = 0, firstIndex = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 4 + 1);
        }
        System.out.println(Arrays.toString(arr));

        maxSum = arr[0] + arr[1];
        lastSum = arr[arr.length-1] + arr[arr.length - 2];

        for(k = 1; k < arr.length - 1; k++){
            nextSum = arr[k] + arr[k + 1] + arr[k - 1];
            if(k == arr.length-1 && maxSum < lastSum){
                maxSum = lastSum;
                break;
            }
            else if(maxSum < nextSum){
                maxSum = nextSum;
                firstIndex=--k;
                k++;

            }
        }
        System.out.println("Найбольшая сумма 3 соседних элементов: " + maxSum);
        System.out.println("Индекс первого элемента из этой тройки: " + firstIndex);
    }
}