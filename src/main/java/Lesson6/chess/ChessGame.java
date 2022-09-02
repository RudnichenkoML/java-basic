package Lesson6.chess;

public class ChessGame {
    public static void main(String[] args) {
        King king = new King();
        Quin quin = new Quin();
        king.kingMove();
        quin.quinMove();
    }
}
