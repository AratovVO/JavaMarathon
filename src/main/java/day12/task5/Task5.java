package day12.task5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>(Arrays.asList(
                new MusicArtist("Chester Bennington",41),
                new MusicArtist("Mike Shinoda",46)));
        MusicBand band1 = new MusicBand("Linkin Park", 1996,members1);
        System.out.println(band1);

        List<MusicArtist> members2 = new ArrayList<>(Arrays.asList(
                new MusicArtist("James Hatfield",60),
                new MusicArtist("Lars Ulrich",59)));
        MusicBand band2 = new MusicBand("Metallica", 1981,members2);
        System.out.println(band2);

        MusicBand.transferMembers(band1, band2);
        band2.printMembers();
        band1.printMembers();
    }
}
