package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Yellow", 2023);
        Motorbike motorbike = new Motorbike("Kawasaki Ninja H2", "Black", 2015);
        motorbike.info();
        car.info();

        System.out.println(motorbike.yearDifference(2023));
        System.out.println(car.yearDifference(2023));
    }
}
