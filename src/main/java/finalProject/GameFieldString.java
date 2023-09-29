package finalProject;

import java.util.Scanner;

public class GameFieldString {
    private String[][] field;
    Player player;

    public GameFieldString(Player player) {
        this.field = new String[11][11];
        this.player = player;
    }
    public String[][] getField() {
        return field;
    }
    public void printField(){
        System.out.println("Поле игрока " + this.player);

        int counter1 = 1;
        int counter2 = 1;
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field.length; j++) {
                    field[i][j] = "⬜";
                if(i == 0 && j == 0){
                    field[i][j] = "  ";
                    System.out.print(field[i][j]);
                }
                if(i > 0 && j == 0 && i<10){
                    String s = field[i][j] = String.valueOf(counter1);
                    System.out.print(s + " ");
                    counter1++;
                }else if(i > 9 && j == 0){
                    String s = field[i][j] = String.valueOf(counter1);
                    System.out.print(s);
                    counter1++;
                }
                else if(j > 0 && i == 0 && j<4){
                    String s = field[i][j] = String.valueOf(counter2);
                    System.out.print(s + " ");
                    counter2++;
                } else if(j > 3 && i == 0){
                    String s = field[i][j] = String.valueOf(counter2);
                    System.out.print(s + " " + "");
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
        System.out.println("\n");
    }

    public void setOneDeckShip(GameFieldString field){
        System.out.println("введите координаты первого однопалубного коробля: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату x");
        int x = scanner.nextInt();
        System.out.print("Введите координату y");
        int y = scanner.nextInt();
        if(x != 0 && y != 0 && x != field.getField().length & y != getField().length){

        }
    }


}
