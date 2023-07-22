package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing 747", 1969, 71, 183500);
        airplane.setFuel(0);
        airplane.info();

        airplane.setYear(1980);
        airplane.setLength(80);
        airplane.fillUp(1000);
        airplane.fillUp(1500);
        airplane.info();


    }
}
