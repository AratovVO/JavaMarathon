package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("File.txt");
        printResult(file);
    }
    public static void printResult(File file){
        try{
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String numbers = scanner.nextLine();
            String[] arrNumbers = numbers.split(" ");
            int[] arr = new int[arrNumbers.length];
            double avg = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(arrNumbers[i]);
                avg += arr[i];
            }
            avg /= arrNumbers.length;
            DecimalFormat df = new DecimalFormat("#.###");
            String result = df.format(avg);
            System.out.print(avg + " --> " +result);
        }
    } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }
}

