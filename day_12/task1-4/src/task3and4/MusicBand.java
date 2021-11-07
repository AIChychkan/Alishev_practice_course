package task3and4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String nameBand;
    private int year;
    List<String> members = new ArrayList<>();

    public MusicBand(String nameBand, int year, List<String> members) {
        this.nameBand = nameBand;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers (MusicBand a, MusicBand b){
        for(String member: a.getMembers()){
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }

    public void printMembers(){
        System.out.println(this.members);
    }

    public String getNameBand() {
        return nameBand;
    }

    public MusicBand(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", year=" + year +
                '}';
    }
}
