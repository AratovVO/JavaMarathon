package day17;

public class ChessBoard {
    String[][] figures;

    public ChessBoard(String[][] figures) {
        this.figures = figures;
    }
    public void print(){
        for(int i = 0; i< figures.length; i++){
         for(int j = 0; j< figures.length; j++){
             System.out.print(figures[i][j]);
             if(j == 7){
                 System.out.print("\n");
             }

         }
        }
    }
}
