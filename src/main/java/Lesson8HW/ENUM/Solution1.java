package Lesson8HW.ENUM;

public class Solution1 {
    public static void main(String[] args) {

        System.out.println(Alphabet.getLetterPosition(Alphabet.Z));

    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;

        static int getLetterPosition(Alphabet a) {
            return  a.ordinal()+1;
        }
    }
}
