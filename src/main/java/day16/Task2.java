package day16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[1000];
        PrintWriter pw1 = null;
        PrintWriter pw2 = null;
        try {
            pw1 = new PrintWriter("file1.txt");
            pw2 = new PrintWriter("file2.txt");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
                pw1.print(numbers[i]+ " ");
            }
            pw1.close();
            System.out.println("Запись в file1 прошла успешно");
            File file1 = new File("file1.txt");
            Scanner scanner = new Scanner(file1);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.length() == 0){
                    throw new NullPointerException();
                }
                String[] str = line.split(" ");
                if (str.length < 100) {
                    throw new NullPointerException();
                }
                double result = 0;
                int counter = 0;
                for (int i = 0; i < 1000; i++) {
                    result += Integer.parseInt(str[i]);
                    if(!((Double)result instanceof Double)){
                        throw new IllegalArgumentException();
                    }
                    if (i % 20 == 0) {
                        pw2.print(result / 20 + " ");
                        result = 0;
                        counter++;
                    }
                }
                pw2.close();
                System.out.println("Счетчик чисел: "+counter+". Запись в file2 прошла успешно");
            }
        } catch (IOException e){
            System.out.println("Файл не найден");
        } catch(NullPointerException e){
            System.out.println("Пустой файл");
        }
        File file2 = new File("file2.txt");
        printResult(file2);
    }
    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if(numbers.length < 50){
                throw new ArrayIndexOutOfBoundsException();
            }
            double[] arrNumbers = new double[numbers.length];
            int result = 0;
            for(int i = 0; i < arrNumbers.length; i++){
                arrNumbers[i] = Double.parseDouble(numbers[i]);
                if(!((Double)arrNumbers[i] instanceof Double)){
                    throw new IllegalArgumentException();
                }
               result += (int) Math.round(arrNumbers[i]);
            }
            System.out.println(result/arrNumbers.length);
        } catch (IOException e){
            System.out.println("Файл не найден");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Неверный файл");
        } catch (IllegalArgumentException e){
            System.out.println("Неверные данные файла");
        }
    }
}
