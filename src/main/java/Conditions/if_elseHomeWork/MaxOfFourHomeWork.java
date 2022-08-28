package Conditions.if_elseHomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;

public class MaxOfFourHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        printMaxOFFour(first, second, third, fourth);
        scanner.close();

    }

    private static void printMessage(int numb) {
        System.out.println("Max value is: " + numb);
    }

    private static void printMaxOFFour(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            printMessage(a);
        } else if (b > a && b > c && b > d) {
            printMessage(b);
        } else if (c > a && c > b && c > d) {
            printMessage(c);
        } else if (d > a && d > b && d > c) {
            printMessage(d);
        } else {
            System.out.println("The values is the same");
        }


    }
}
