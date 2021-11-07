package com.Chychkan.musicBandWithAge;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String nameBand;
    private int year;
    List<MusicArtist> artists = new ArrayList<>();

    public MusicBand(String nameBand, int year, List<MusicArtist> artists) {
        this.nameBand = nameBand;
        this.year = year;
        this.artists = artists;
    }

    public static void transferMembers (MusicBand a, MusicBand b){
        for(MusicArtist artists: a.getMembers()){
            b.getMembers().add(artists);
        }
        a.getMembers().clear();
    }

    public void printMembers(){
        System.out.println(this.artists);
    }

    public String getNameBand() {
        return nameBand;
    }

    public List<MusicArtist> getMembers() {
        return artists;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", year=" + year +
                ", artists=" + artists.toString() +
                '}';
    }
}
