package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s = String.valueOf(0);
        for(int i = 1; i< 20000; i++){
            s = s + " " + i;
        }
//        System.out.println(s);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(String.valueOf(0));
        for(int i = 1; i < 20001; i++){
            sb.append(i).append(" ");
        }
//        System.out.println(sb);

        stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}
