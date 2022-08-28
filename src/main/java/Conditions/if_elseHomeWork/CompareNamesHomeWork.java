package Conditions.if_elseHomeWork;

import javax.sound.midi.Soundbank;
import java.util.Objects;
import java.util.Scanner;

public class CompareNamesHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two names: ");
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        printComparisonNameResult(firstName, secondName);
        scanner.close();
    }

    private static void printComparisonNameResult(String firstName, String secondName) {

        if (Objects.equals(firstName.toLowerCase(), secondName.toLowerCase())) {
            System.out.println("Names are the same");
        } else {
            if (firstName.length() == secondName.length()) {
                System.out.println("Length of names the same");
            } else {
                System.out.println("It's different names with different length quantity");
            }
        }
    }
}
