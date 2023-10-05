package finalProject;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Игрок 1");
        Player player2 = new Player("Игрок 2");
        GameField field1 = new GameField(player1);
        GameField field2 = new GameField(player2);
        field1.printField();
        field2.printField();
        int ran = Player.chooesFirst(player1,player2);
        if(ran == 0){
            field1.setOneDeckShip();
        } else {
            field2.setOneDeckShip();
        }
    }

}
