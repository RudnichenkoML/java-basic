package array;

import java.util.Scanner;

public class TwoArraysHW {
    public static void main(String[] args) {
        String[] array1 = new String[10];
        int[] array2 = new int[10];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < array1.length) {
            System.out.println("Enter some text: ");
            array1[counter] = scanner.nextLine();
            counter++;
        }
        scanner.close();
        for (int i = 0; i < array1.length; i++) {
            String value = array1[i];
            int j = value.length();
            array2[i] = j;
        }
        for (int x = 0; x < array2.length; x++) {
            System.out.println(array2[x]);
        }

    }
}





