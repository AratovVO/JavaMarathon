package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        List<String> cars = new ArrayList<>();
//        cars.add("BMW");
//        cars.add("Mercedes");
//        cars.add("Audi");
//        cars.add("Lada");
//        cars.add("Chevrolet");
//        System.out.println(cars);
//        cars.add(cars.size()/2, "Renault");
//        cars.remove(0);
//        System.out.println(cars);
        List<String> cars = new ArrayList<>(Arrays.asList("BMW","Mercedes", "Lada","Audi","Chevrolet"));
        System.out.println(cars);
        cars.add(cars.size()/2, "Renault");
        cars.remove(0);
        System.out.println(cars);
    }
}
