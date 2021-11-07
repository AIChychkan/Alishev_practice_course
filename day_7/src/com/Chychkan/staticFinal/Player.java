package com.Chychkan.staticFinal;

/**
 * Created by A.I.Chychkan on 23/10/2021
 */

public class Player {
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private int stamina = MAX_STAMINA;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    void run(){
        stamina--;

        if(stamina==MIN_STAMINA){
            System.out.println("Игрок уходит с поля. Его выносливость составляет: 0");
            countPlayers--;
        }
        if(stamina>0)
        System.out.println("Игрок бежит. Его выносливость составляет: " + stamina);
    }

    void info(){
        System.out.print("На поле сейчас " + countPlayers + " игроков.");
        if(countPlayers<6){
            System.out.println(" Команды неполные. На поле ещё есть " + (6-countPlayers) + " свободных мест.");
        }
        else {
            System.out.println(" На поле нет свободных мест.");
        }
    }
}
