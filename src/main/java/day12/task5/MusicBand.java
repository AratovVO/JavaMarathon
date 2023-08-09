package day12.task5;

import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<MusicArtist> membersWithAges;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.year = year;
        this.name = name;
        this.membersWithAges = members;
    }

    public List<MusicArtist> getMembers() {
        return membersWithAges;
    }

    public static void transferMembers (MusicBand band1, MusicBand band2){
        List <MusicArtist> list1 = band1.getMembers();
        List<MusicArtist> list2 = band2.getMembers();
        list2.addAll(list1);
        while(list1.size() != 0){
            list1.remove(list1.get(list1.size()-1));
        }

    }
    public void printMembers () {
        System.out.println(getMembers());
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Музыкальная группа " + name + ", основана в " + year + " году" + "\n"
                + "Участники: " + membersWithAges;
    }
}
