package array;

import java.util.Arrays;
import java.util.Scanner;

public class DivideArrayHW {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int counter = 0;
        while (counter < arr.length) {
            System.out.println("Enter the number: ");
            arr[counter] = scanner.nextInt();
            counter++;
        }

        scanner.close();

        int[] arr1 = Arrays.copyOfRange(arr, 0, 9);
        int[] arr2 = Arrays.copyOfRange(arr, 10, 20);

        for (int a : arr2) {
            System.out.print(a + "|");
        }
        System.out.println();
    }
}

