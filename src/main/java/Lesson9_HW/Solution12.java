package Lesson9_HW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution12 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i > 10) {
                iterator.remove();
            }
        }
        System.out.println(set);

    }
}
