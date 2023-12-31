package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));

    }
    public static List<String> parseFileToStringList(File file) {
        List<String> names = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] str = line.split(" ");
                if(Integer.parseInt(str[1]) < 0){
                    throw new IllegalArgumentException();
                } else if(line.isEmpty() || str[0]==null || str[1] == null){
                    throw new NullPointerException();
                }
                names.add(line);
            }
        } catch (IOException e) {
            System.out.println("Фалйн не найден");
        } catch (IllegalArgumentException | NullPointerException e ){
            System.out.println("Некорректный входной файл");
            return null;
        }
        return names;
    }
}
