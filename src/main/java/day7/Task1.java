package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing 747", 1969, 71, 183500);
        Airplane airplane2 = new Airplane("Airbus", 1969, 80, 183500);
        Airplane.compareAirplanes(airplane2, airplane1);
    }
}