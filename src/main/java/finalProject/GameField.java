package finalProject;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CompletionException;

public class GameField {
    private String[][] field;
    Player player;
    int x;
    int y;
    String[] numbers = new String[] {"\u0030\uFE0F\u20E3","\u0031\uFE0F\u20E3","\u0032\uFE0F\u20E3","\u0033\uFE0F\u20E3","\u0034\uFE0F\u20E3","\u0035\uFE0F\u20E3"
            ,"\u0036\uFE0F\u20E3", "\u0037\uFE0F\u20E3", "\u0038\uFE0F\u20E3","\u0039\uFE0F\u20E3"};

    public GameField(Player player) {
        this.field = new String[11][11];
        this.player = player;
    }
    public String[][] getField() {
        return field;
    }

    public void printField() {
        System.out.println("Поле игрока " + this.player);
        int counter1 = 0;
        int counter2 = 0;
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++) {
                field[i][j] = "⬜";
                if(i == 0 && j == 0){
                    field[i][j] = " ";
                    System.out.print(field[i][j]);
                }
                if(i > 0 && j == 0){
                    String s = field[i][j] = numbers[i-1];
                    System.out.print(s);
                }
                else if(j > 0 && i == 0){
                    String s = field[i][j] = numbers[j-1];
                    System.out.print(s);
                    counter2++;
                }
                else {
                    System.out.print(field[i][j]);
                }
                if (j == field.length - 1) {
                    System.out.print("\n");
                }
            }
        }
    }
    public void printField(Cordiante cordinate) {
        System.out.println("Поле игрока " + this.player);
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++) {
                field[i][j] = "⬜";
                if(i == 0 && j == 0){
                    field[i][j] = " ";
                    System.out.print(field[i][j]);
                }
                if(i > 0 && j == 0){
                    String s = field[i][j] = numbers[i-1];
                    System.out.print(s);
                }
                else if(j > 0 && i == 0){
                    String s = field[i][j] = numbers[j-1];
                    System.out.print(s);
                }
                else if(i == cordinate.getX() && j == cordinate.getY()){
                    String ship = field[i][j] = "\uD83D\uDEE5";
                    System.out.print(ship);
                }
                else {
                    System.out.print(field[i][j]);
                }
                if (j == field.length - 1) {
                    System.out.print("\n");
                }
            }
        }
    }
    public void setOneDeckShip() {
    int length = 1;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите координату x: ");
    int x = scanner.nextInt();
    System.out.print("Введите координату y: ");
    int y = scanner.nextInt();
        if (x >= 0 && y >= 0 && x <= 9 && y <= 9) {
            Cordiante cordinate = new Cordiante(x+1, y+1);
            printField(cordinate);
        }

//    if (x >= 0 && y >= 0 && x <= 9 && y <= 9) {
//        for (int i = 0; i < length; i++) {
//            field[x + 2][y + 2] = "\uD83D\uDEE5";
//        }
//        printField();
//    } else {
//        System.out.println("Координата введена неверно. Пожалуйста, введите другую координату.");
//        setOneDeckShip();
//    }
}

    }


