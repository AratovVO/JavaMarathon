package day18;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
     int n = 707;
        System.out.println(count7(n));
    }
    public static int count7(int n){
        String str = String.valueOf(n);
        char[] chArr = str.toCharArray();
        int index = chArr.length-1;
        int counter = 0;
        if(index == 0 && chArr[index] != '7'){
            return counter;
        } else if (index == 0 && chArr[index] == '7') {
            return counter+1;
        } else if (chArr[index] == '7') {
            counter++;
        }
        return counter + count7(n/10);
    }
}
