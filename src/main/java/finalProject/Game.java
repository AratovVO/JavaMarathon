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
            System.out.println("Введите координаты первого однопалубного корабля: ");
            field1.setOneDeckShip();
            System.out.println("Введите координаты второго однопалубного корабля: ");
            field1.setOneDeckShip();
            System.out.println("Введите координаты третьего однопалубного корабля: ");
            field1.setOneDeckShip();
            System.out.println("Введите координаты четвертого однопалубного корабля: ");
            field1.setOneDeckShip();
        } else {
            field2.setOneDeckShip();
        }
    }

}
