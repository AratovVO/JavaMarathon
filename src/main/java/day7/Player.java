package day7;

public class Player {
    private int stamina;
    private static int countPlayers;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers < 6) {
            countPlayers++;
        }
    }
    public void run() {
        if (stamina == MIN_STAMINA) {
            return;
        }
        stamina--;
        if(stamina == MIN_STAMINA){
            System.out.println("Игроку нужен отдых");
            countPlayers--;
        }
    }

    public static void info(){
        // System.out.println("Всего игроков на поле:" + countPlayers);
        if(countPlayers < 6){
            System.out.println("Команды неполные. На поле есть ещё "
                    + (6 - Player.getCountPlayers()) +" свободных мест"  );
        } else if (countPlayers == 6){
            System.out.println("На поле нет свободных мест");
        }
    }

}
