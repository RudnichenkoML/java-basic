package Lesson9_HW;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution6 {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("pear");
        fruits.add("melon");
        fruits.add("blackberry");
        fruits.add("ginseng");
        fruits.add("strawberry");
        fruits.add("toffee");
        fruits.add("potato");

        for (String s :fruits) {
            System.out.println(s);
        }

    }
}



