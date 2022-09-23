package Lesson9_HW;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("first String");
        strings.add("second String");
        strings.add("third String");
        strings.add("forth String");
        strings.add("fifth String");

        System.out.println(strings.size());

        for (int i = 0; i<strings.size(); i++) {
            System.out.println(strings.get(i));
        }



    }



}
