package day12.task3;

public class MusicBand {
    private int year;
    private String name;

    public MusicBand(String name, int year) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Музыкальная группа " + name + ", основана в " + year + "\n";
    }
}
