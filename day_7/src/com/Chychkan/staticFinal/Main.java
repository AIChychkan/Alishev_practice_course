package com.Chychkan.staticFinal;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	 Plane plane1 = new Plane("Boeing", 1980, 58.3f, 34.3f);
     Plane plane2 = new Plane("Mriia", 1999, 45.1f, 29.6f);
     //plane1.compareAirplanes(plane1, plane2);
     Plane.compareAirplanes(plane1, plane2);

        Random rand = new Random();
        int[] rand1 = new int[6];

        for (int i = 0; i< rand1.length; i++){
            rand1[i] = rand.nextInt(11)+90;
        }

        Player p1 = new Player(rand1[0]);
        Player p2 = new Player(rand1[1]);
        Player p3 = new Player(rand1[2]);
        Player p4 = new Player(rand1[3]);
        Player p5 = new Player(rand1[4]);
        Player p6 = new Player(rand1[5]);

        System.out.println("--------------------------------\nИгроки выходят на поле...");

        System.out.println("Выносливость игрока 1: " + p1.getStamina());
        System.out.println("Выносливость игрока 2: " + p2.getStamina());
        System.out.println("Выносливость игрока 3: " + p3.getStamina());
        System.out.println("Выносливость игрока 4: " + p4.getStamina());
        System.out.println("Выносливость игрока 5: " + p5.getStamina());
        System.out.println("Выносливость игрока 6: " + p6.getStamina());

        p1.info();
        System.out.println("--------------------------------\nИнформация об игроке 1:");
        for(int i = 0; i<130; i++){
            p1.run();
            if(p1.getStamina()==0)break;
        }
        p1.info();
    }
}
