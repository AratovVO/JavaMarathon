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

    public static int chooesFirst(Player player1, Player player2) {
        Random random = new Random();
        int ran = random.nextInt(2);
        if (ran == 0) {
            System.out.println("Игрок " + player1 + " ходит первым");
        } else {
            System.out.println("Игрок " + player2 + " ходит первым");

        }
        return ran;
    }

    @Override
    public String toString() {
        return name;
    }
}

