package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("File.txt");
        printSumDigits(file);
    }
    public static void printSumDigits(File file){
        try {
            Scanner scan = new Scanner(file);
            String x = scan.nextLine();
            String[] arrString = x.split(" ");
            if (arrString.length != 10 ){
                throw new ArrayIndexOutOfBoundsException("Некорректный входной файл");
            }
            int[] numbers = new int[arrString.length];
            int result = 0;
            for(int i = 0; i< numbers.length;i++){
                numbers[i] = Integer.parseInt(arrString[i]);
                result += numbers[i];
            }
            System.out.println(result);

        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}

