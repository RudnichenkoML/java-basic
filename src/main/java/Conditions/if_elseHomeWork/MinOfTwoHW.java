package Conditions.if_elseHomeWork;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MinOfTwoHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNumb = scanner.nextInt();
        int secondNumb = scanner.nextInt();
        printMinOfTwo(firstNumb, secondNumb);
        scanner.close();

    }

    private static void printMinOfTwo(int a, int b) {
        if (a < b) {
            System.out.println("Min value is: " + a);
        } else if (a > b) {
            System.out.println("Min value is: " + b);
        } else {
            System.out.println("The values are the same");
        }
    }
}
