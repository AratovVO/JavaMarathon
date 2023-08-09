package day12.task4;

import day12.task5.MusicArtist;

import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    protected List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.year = year;
        this.name = name;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }
    public static void transferMembers (MusicBand band1, MusicBand band2){
        List <String> list1 = band1.getMembers();
        List<String> list2 = band2.getMembers();
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
                + "Участники: " + members;
    }
}
