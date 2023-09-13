package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chess = new ChessPiece[8];
        for(int i = 0; i < 4; i++){
            chess[i] = ChessPiece.valueOf("PAWN_WHITE");
            System.out.print(chess[i].getFigure() + " ");
        }
        for(int i = 4; i < 8; i++){
            chess[i] = ChessPiece.valueOf("ROOK_BLACK");
            System.out.print(chess[i].getFigure() + " ");;
        }
    }
}