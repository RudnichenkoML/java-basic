package Lesson9_HW;

import java.util.ArrayList;
import java.util.List;

public class Solution5 extends Solution2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        makeArrayList(list, 5);

        for (int i = 0; i<13; i++) {
            String lastVal = list.get(list.size() - 1);
            list.add(0,lastVal);
            list.remove(list.size()-1);

        }
        for (String s:list){
            System.out.println(s);
        }
    }
}
