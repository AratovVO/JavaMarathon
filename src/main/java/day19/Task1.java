package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1{
    public static void main(String[] args)  {
        File file = new File("C:\\Users\\v.aratov\\Desktop\\Aratov\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        HashMap<String,Integer> hm  = new HashMap<>();
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            int counter;
            while(scanner.hasNext()){
                String s = scanner.next();
                if(s == null){
                    throw new EmptyStackException();
                }
                if(hm.containsKey(s)){
                    counter = hm.get(s);
                    counter++;
                    hm.replace(s,hm.get(s),counter);
                } else {
                    counter = 1;
                    hm.put(s,counter);
                }
            }
            List<Map.Entry<String,Integer>> entryList = new ArrayList<>(hm.entrySet());
            Collections.sort(entryList,new Comparator<Map.Entry<String, Integer>>(){
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            counter = entryList.size() - 1;
            while(counter != (entryList.size()-100)){
                System.out.println(entryList.get(counter--));
            }
// -------------------------------- Чичиков - 601 --------------------------------------------------

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch(EmptyStackException e){
            System.out.println("Пустой файл");
        }

    }
}
