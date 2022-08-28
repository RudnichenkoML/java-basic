package Conditions.if_elseHomeWork;

import java.util.Scanner;

public class SortOfThreeHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        printFromHighestToLowest(first, second, third);
        scanner.close();
    }

    private static void printMessage(int a, int b, int c) {
        System.out.println(a + "-->" + b + "-->" + c);
    }

    private static void printFromHighestToLowest(int a, int b, int c) {
        int min;
        int avg;
        int max;
        if (a > b && b > c) {
            max = a;
            avg = b;
            min = c;
            printMessage(max, avg, min);
        } else if (a > c && c > b) {
            max = a;
            avg = c;
            min = b;
            printMessage(max, avg, min);

        } else if (c > a && a > b) {
            max = c;
            avg = a;
            min = b;
            printMessage(max, avg, min);
        } else if (c > b && b > a) {
            max = c;
            avg = b;
            min = a;
            printMessage(max, avg, min);
        } else if (b > a && a > c) {
            max = b;
            avg = a;
            min = c;
            printMessage(max, avg, min);
        } else if (b>c && c>a) {
            max = b;
            avg = c;
            min = a;
            printMessage(max, avg, min);
        }else {
            System.out.print("Values are the same");
        }


    }
}





