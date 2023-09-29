package finalProject;

import java.util.Random;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void chooesFirst(Player player1, Player player2){
        Random random = new Random();
        if(random.nextInt(2) == 0){
            System.out.println("Игрок " + player1 + " ходит первым");
        } else if(random.nextInt(2) == 1){
            System.out.println("Игрок " + player2 + " ходит первым");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
