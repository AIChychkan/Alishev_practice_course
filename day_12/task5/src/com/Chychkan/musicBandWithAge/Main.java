package com.Chychkan.musicBandWithAge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MusicArtist a00 = new MusicArtist("Artem", 23);
        MusicArtist a01 = new MusicArtist("Ivan", 69);
        MusicArtist a10 = new MusicArtist("Anna", 20);
        MusicArtist a11 = new MusicArtist("Sveta", 56);

        List<MusicArtist> artists0 = new ArrayList<>(Arrays.asList(a00, a01));
        List<MusicArtist> artists1 = new ArrayList<>(Arrays.asList(a10, a11));

        MusicBand b0 = new MusicBand("b0", 2021, artists0);
        MusicBand b1 = new MusicBand("b1", 2020, artists1);

        System.out.println("-----Инфо-о-бандах----------------------------------------------");
        System.out.println(b0);
        System.out.println(b1);

        MusicBand.transferMembers(b0, b1);

        System.out.println("\n-----Инфо-о-бандах-после-трансформации--------------------------");
        System.out.println(b0);
        System.out.println(b1);

    }
}
