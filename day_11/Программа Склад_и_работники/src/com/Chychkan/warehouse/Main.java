package com.Chychkan.warehouse;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Main {

    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse(0, 0);
        Picker picker1 = new Picker(0, false, warehouse1);
        Picker picker2 = new Picker(0, false, warehouse1);
        Courier courier1 = new Courier(0, false, warehouse1);

        System.out.println("8:00-Начало-рабочего-дня-----------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------Сборщик-1--------------------------------------------------");
        businessProcessEight(picker1);
        System.out.println("Работник закончил работу. Заработная плата за сегодня с учётом бонусоа составила: " + picker1.getSalary() + "грн.");
        System.out.println("------------------------------------------------Курьер-1--------------------------------------------------");

        businessProcessEight(courier1);
        System.out.println("Работник закончил работу. Заработная плата за сегодня с учётом бонусоа составила: " + courier1.getSalary() + "грн.");
        System.out.println("------------------------------------------------Сборщик-2--------------------------------------------------");

        businessProcessTwenty(picker2);
        System.out.println("Работник закончил работу. Заработная плата за сегодня с учётом бонусоа составила: " + picker2.getSalary() + "грн.");

        System.out.println("------------------------------------------------Сборщик-1--------------------------------------------------");
        businessProcessEight(picker1);
        System.out.println("Работник закончил работу. Заработная плата за сегодня с учётом бонусоа составила: " + picker1.getSalary() + "грн.");

    }

    static void businessProcessEight(Worker worker){
        for (int i = 0; i < 8; i++){
            worker.doWork();
        }
        worker.bonus();
    }

    static void businessProcessTwenty(Worker worker){
        for (int i = 0; i < 8; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}