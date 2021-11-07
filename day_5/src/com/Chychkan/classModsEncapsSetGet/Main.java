package com.Chychkan.classModsEncapsSetGet;

/**
 * Created by A.I.Chychkan on 23/10/2021
 */

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Grey", 2006);
        car1.getInfoModel();
        car1.getInfoColor();
        car1.getInfoYear();

        car1.setModel("Renault");
        car1.setcolor("White");
        car1.setYear(2014);

        System.out.println("-----------------------");

        car1.getInfoModel();
        car1.getInfoColor();
        car1.getInfoYear();
    }
}
