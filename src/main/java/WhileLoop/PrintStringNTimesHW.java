package WhileLoop;

import java.util.Scanner;

public class PrintStringNTimesHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String text = scanner.nextLine();
        System.out.println("Enter the displaying quantity:  ");
        int n = scanner.nextInt();
        scanner.close();


        while (n > 0) {
            System.out.println(text);
            n--;
        }
    }

}
