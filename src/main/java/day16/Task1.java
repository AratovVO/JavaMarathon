package day16;

import java.awt.geom.QuadCurve2D;
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
            if(numbers.isEmpty()){
                throw new NullPointerException();
            }
            String[] arrNumbers = numbers.split(" ");
            double avg = 0;
            for (int i = 0; i < arrNumbers.length; i++) {
                avg += Integer.parseInt(arrNumbers[i]);
                if(!((Double)avg instanceof Double)){
                    throw new IllegalArgumentException();
                }
            }
            avg /= arrNumbers.length;
            DecimalFormat df = new DecimalFormat("#.###");
            String result = df.format(avg);
            System.out.print(avg + " --> " +result);
        }
    } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (NullPointerException e){
            System.out.println("Пустой файл");
        } catch (IllegalArgumentException e){
            System.out.println("Неверные данные файла");
        }
    }
}

