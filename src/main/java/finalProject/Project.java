package finalProject;

public class Project {
    public static void main(String[] args) {
        Player player1 = new Player("Игрок 1");
        Player player2 = new Player("Игрок 2");
        GameFieldString field1 = new GameFieldString(player1);
        GameFieldString field2 = new GameFieldString(player2);
        field1.printField();
        field2.printField();
        Player.chooesFirst(player1,player2);
//        GameFieldChar fieldChar1 = new GameFieldChar(player1);
//        GameFieldChar fieldChar2 = new GameFieldChar(player2);
//        fieldChar1.printField();
//        fieldChar2.printField();



    }

}
