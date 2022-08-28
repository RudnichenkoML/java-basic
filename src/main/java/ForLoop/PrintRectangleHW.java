package ForLoop;

import java.util.Scanner;

public class PrintRectangleHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        int[][] arr = new int[m][n];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}

