package array;

import java.util.Scanner;

public class ReverseArrayHW {
    public static void main(String[] args) {
        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < array.length-2) {
            System.out.println("Enter some test: ");
            array[counter] = scanner.nextLine();
            counter++;
        }
        scanner.close();
        for (int i = array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        }
    }
}
