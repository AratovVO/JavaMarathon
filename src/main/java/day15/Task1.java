package day15;

import javafx.scene.control.Separator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "E:" + separator +
                "IntelliJ IDEA Community Edition 2022.3" + separator +
        "Projects" + separator +
                "JavaMarathon2021"+ separator +"src"+ separator +
                "main" + separator +"resources" + separator +
                "shoes.csv";
        File file = new File(path);
        emptyShoes(file);
    }
    public static File emptyShoes(File file) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("empty_shoes.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] str = line.split(";");
                if(str.length<3){
                    throw new ArrayIndexOutOfBoundsException();
                } else if(str.length == 0){
                    throw new IllegalArgumentException();
                }else if(Integer.parseInt(str[2]) == 0){
                    fw.write(Arrays.toString(str) + "\n");
                }

            }
            System.out.println("Успех");
        } catch (IOException e) {
            System.out.println("Фалйн не найден");
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println("Строка не найдена");
        }
        try {
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
