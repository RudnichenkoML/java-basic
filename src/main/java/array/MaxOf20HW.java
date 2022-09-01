package array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOf20HW {
    public static void main(String[] args) {
        int[] array = initializeArray();
        int maxNumber = max(array);
        System.out.println(maxNumber);

    }

    private static int[] initializeArray() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int counter = 0;
        while (counter < arr.length) {
            System.out.println("Enter the number: ");
            arr[counter] = scanner.nextInt();
            counter++;
        }
        scanner.close();
        return arr;
    }

    private static int max(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }
}
