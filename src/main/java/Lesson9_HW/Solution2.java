package Lesson9_HW;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        List string = new ArrayList();
        makeArrayList(string, 5);
        printLongestString(string);


    }


    public static void makeArrayList(List<String> myList, int size) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            if (i < size) {
                System.out.println("Enter 5 strings: ");
                myList.add(scanner.nextLine());

            }
        }scanner.close();

    }

    public static void printLongestString(List<String> list) {
      int longestString = 0;
      String longestStringInList = null;
        for (int i = 0; i < list.size(); i++) {
            int size = list.get(i).length();
            if (size>longestString){
                longestString = size;
                longestStringInList = list.get(i);

            }
        }
        System.out.println(longestStringInList);

    }
}

