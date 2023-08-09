package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Chester Bennington");
        members1.add("Mike Shinoda");
        MusicBand band1 = new MusicBand("Linkin Park", 1996,members1);
        System.out.println(band1);

        List<String> members2 = new ArrayList<>();
        members2.add("James Hatfield");
        members2.add("Lars Ulrich");
        MusicBand band2 = new MusicBand("Metallica", 1981,members2);
        System.out.println(band2);

        MusicBand.transferMembers(band1, band2);
        band2.printMembers();
        band1.printMembers();

    }
}
