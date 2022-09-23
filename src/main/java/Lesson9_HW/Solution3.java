package Lesson9_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Solution3 extends Solution2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        makeArrayList(list, 5);
        printLongestString(list);


    }


    public static void printLongestString(List<String> list) {
        String shortestString = list.get(0);
        for (String str : list) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
            }
        }
        System.out.println(shortestString);

    }
}
