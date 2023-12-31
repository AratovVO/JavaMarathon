package day14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }
    public static List<Person> parseFileToObjList(File file){
        List<Person> persons = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] str = line.split(" ");
                if(Integer.parseInt(str[1]) < 0)
                    throw new IllegalArgumentException();
                else if(line.isEmpty() || str[0]==null || str[1] == null){
                    throw new NullPointerException();
                }
                persons.add(new Person (Integer.parseInt(str[1]), str[0]));
            }

        } catch(IOException e){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException | NullPointerException e){
            System.out.println("Некорректный входной файл");
        }
        return persons;
    }
}
