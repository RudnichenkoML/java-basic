package Lesson9_HW;

import java.util.ArrayList;
import java.util.List;

public class Solution4 extends Solution2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        makeArrayList(list,5);

        for (String s:list) {
            System.out.println(s);
        }

    }
}
