package com.Chychkan.fileWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File readOut = new File("src\\files\\BootList.csv");
        readAndWrite(readOut);
    }

    public static void readAndWrite (File file) {
        try {
            Scanner scanner = new Scanner(file);

            File writeTo = new File("src\\files\\ZeroBoots.txt");
            PrintWriter pw = new PrintWriter(writeTo);

            while (scanner.hasNextLine()){
                String[] boots = scanner.nextLine().split(";");

                if (Integer.parseInt(boots[2]) == 0){
                    pw.println(boots[0] + "; " + boots[1] + "; "+ boots[2]);
                }
            }
            scanner.close();
            pw.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Invalid data. Please try again.");
        }
    }
}
