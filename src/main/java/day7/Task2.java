package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 10;
        int min = 5;
        int stamina = random.nextInt(max - min + 1)+min;
        Player player1 = new Player(stamina);
        Player player2 = new Player(stamina);
        Player player3 = new Player(stamina);
        Player player4 = new Player(stamina);
        Player player5 = new Player(stamina);
        Player player6 = new Player(stamina);
        Player.info();
        player1.run();
        player1.run();
        player1.run();
        player1.run();
        player1.run();
        Player.info();





    }
}
