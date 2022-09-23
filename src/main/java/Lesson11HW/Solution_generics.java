package Lesson11HW;

import java.util.*;

public class Solution_generics {
    static class Storage<T> {


        public void getVal(T t) {
            System.out.println(t);
        }

        public void getSomething(T t) {
            System.out.println(t);
        }


        List<T> list = new ArrayList<>();

        public void putVal(T val) {
            list.add(val);
        }

        public void getRemoveValues() {
            T val = list.get(list.size() - 1);
            System.out.println(val);
            list.remove(list.size() - 1);
            for (T t : list) {
                System.out.println(t);
            }


        }
    }
}
