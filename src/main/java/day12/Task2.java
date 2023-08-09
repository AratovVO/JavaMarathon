package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        addNumbers(0,30,numbers);
        addNumbers(300,350,numbers);
    }
    public static void addNumbers(int firstNumber, int lastNumber, List <Integer> list){
        for(int i = firstNumber; i <= lastNumber; i++ ){
            if(i%2==0){
                list.add(i);
            }
        }
        System.out.println(list);

    }
}
