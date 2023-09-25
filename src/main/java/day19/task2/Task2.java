package day19.task2;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer, Point> cars = new HashMap<>();
        File file = new File("C:\\Users\\v.aratov\\Desktop\\Aratov\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if(str.length() == 0){
                    throw new NullPointerException();
                }
                String[] arr = str.split(" ");
                int x;
                int y;
                for(int i = 0; i< arr.length; i++){
                    x = Integer.parseInt(arr[1]);
                    y = Integer.parseInt(arr[2]);
                    cars.put(Integer.parseInt(arr[0]),new Point(x,y));
                    }
                }
//            System.out.println(cars);
            List<Map.Entry<Integer, Point>> entryList = new ArrayList<>(cars.entrySet());
            entryList.sort(new Comparator<Map.Entry<Integer, Point>>() {
                @Override
                public int compare(Map.Entry<Integer, Point> o1, Map.Entry<Integer, Point> o2) {
                    return o1.getKey().compareTo(o2.getKey());
                }
            });
            Scanner input = new Scanner(System.in);
                System.out.println("Введите координаты квадрата: ");
                System.out.print("x1: ");
                int x1 = input.nextInt();
                System.out.print("y1: ");
                int y1 = input.nextInt();
                System.out.print("x2: ");
                int x2 = input.nextInt();
                System.out.print("y2: ");
                int y2 = input.nextInt();
//                int x1,x2,y1,y2;
//                x1 = 0;
//                x2 = 10;
//                y1 = 10;
//                y2 = 10;
                if ((x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0) && (x1 == x2)) {
                    System.out.println("Введены некорректные координаты");
                } else {
                    for(Map.Entry<Integer,Point> entry : entryList){
                        if((entry.getValue().getX() < x2 && entry.getValue().getX() > x1)
                        && (entry.getValue().getY() < y2 && entry.getValue().getY() > y1)){
                            System.out.println("Номер идентификатора: " + entry.getKey());
                        } else {
                            throw new EmptyStackException();
                        }
                    }
                }
        } catch(IOException e){
            System.out.println("Файл не найден");
        } catch(NullPointerException e){
            System.out.println("Пустой файл");
        } catch (EmptyStackException e){
            System.out.println("Машин не найдено");
        }
    }
}

