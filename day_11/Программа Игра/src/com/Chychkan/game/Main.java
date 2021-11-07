package com.Chychkan.game;

public class Main {

    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Paladin p1 = new Paladin();
        Magician m1 = new Magician();
        Shaman s1 = new Shaman();

        w1.physicalAttack(p1);
        System.out.println(p1);

        p1.healHimself();
        System.out.println(p1);

        for (int i = 0; i < 10; i++){
            m1.magicalAttack(p1);
            System.out.println(p1);
        }
    }
}
