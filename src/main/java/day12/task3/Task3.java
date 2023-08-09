package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>(Arrays.asList(new MusicBand("Linkin Park", 1996),
                new MusicBand("Metallica", 1981),
                new MusicBand("Limp Bizkit", 1994),
                new MusicBand("Skillet", 1996),
                new MusicBand("Fleet Foxes", 2006),
                new MusicBand( "Imagine Dragons",2008),
                new MusicBand("The Blue Stones", 2011),
                new MusicBand("Кино", 1981),
                new MusicBand("Rise Against", 1999),
                new MusicBand( "Paramore", 2004)));
        Collections.shuffle(bands);
        //System.out.println(bands);
        System.out.println(groupsAfter2000(bands));


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
