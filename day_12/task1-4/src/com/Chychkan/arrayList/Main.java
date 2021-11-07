package com.Chychkan.arrayList;

import task3and4.MusicBand;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(Arrays.asList("BMW", "Renault", "Dodge", "Mercedes", "Porsche"));
        System.out.println(cars);

        cars.add(2, "Haval");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);

        //------------------------------------------
        System.out.println("\n-----------0-3-300-350------------------");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 30; i++){
            if(i % 2 == 0){
                numbers.add(i);
            }
        }

        for (int i = 300; i <= 350; i++){
            if(i % 2 == 0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        System.out.println();

        //------------------------------------------
        List<String> members0 = new ArrayList<>(Arrays.asList("Artem", "Ivan", "Ann"));
        List<String> members1 = new ArrayList<>(Arrays.asList("Kate", "Gorge", "Vasil"));
        List<String> members2 = new ArrayList<>(Arrays.asList("Rob", "Tom", "Arnold"));


        MusicBand b0 = new MusicBand("b0", 1968, members0);
        MusicBand b1 = new MusicBand("b1", 2001, members1);
        MusicBand b2 = new MusicBand("b2", 1999, members2);
//        MusicBand b3 = new MusicBand("b3", 2012);
//        MusicBand b4 = new MusicBand("b4", 1934);
//        MusicBand b5 = new MusicBand("b5", 2016);
//        MusicBand b6 = new MusicBand("b6", 2001);
//        MusicBand b7 = new MusicBand("b7", 1997);
//        MusicBand b8 = new MusicBand("b8", 1978);
//        MusicBand b9 = new MusicBand("b9", 2004);

        //b0.setName("Chychkan_Artem");

        List<MusicBand> bands = new ArrayList<>(Arrays.asList(b0, b1, b2));

        for(MusicBand band: bands){
            System.out.println(band.getNameBand() + ", " + band.getYear() + ", " + band.getMembers());
        }
        //System.out.println(bands);

        System.out.println("\n-----------Shuffle-list-----------------");
        List<MusicBand> bandsShuffle = new ArrayList<MusicBand>(bands);

        Collections.shuffle(bandsShuffle);

        for(MusicBand band: bandsShuffle){
            System.out.println(band.getNameBand() + ", " + band.getYear());
        }

        System.out.println("\n-----------Bands-after-2000-------------");
        List<MusicBand> bandsAfter2000;
        bandsAfter2000 = groupsAfter2000(bands);
        for(MusicBand band: bandsAfter2000){
            System.out.println(band.getNameBand() + ", " + band.getYear());
        }
        //System.out.println(bandsAfter2000);

        System.out.println("\n-----------Original-band-list-----------");
        for(MusicBand band: bands){
            System.out.println(band.getNameBand() + ", " + band.getYear() + ", " + band.getMembers());
        }

        //--------------------------------------------------------------
        System.out.println("\n-----------Transfer-members-------------");
        MusicBand.transferMembers(b1, b2);
        //System.out.println(bands);
        for(MusicBand band: bands){
            System.out.println(band.getNameBand() + ", " + band.getYear() + ", " + band.getMembers());
        }

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsAfter2000 = new ArrayList<>();

        for(MusicBand band: bands){
            if(band.getYear() >= 2000){
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }

}
