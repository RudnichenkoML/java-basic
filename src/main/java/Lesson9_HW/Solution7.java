package Lesson9_HW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution7 {
    public static void main(String[] args) {
        HashMap<String,String>hashMap = new HashMap<>();
        hashMap.put("banana","grass");
        hashMap.put("cherry","berry");
        hashMap.put("pear","fruit");
        hashMap.put("melon","vegetable");
        hashMap.put("blackberry","berry");
        hashMap.put("ginseng","root");
        hashMap.put("strawberry","berry");
        hashMap.put("toffee","flower");
        hashMap.put("potato","tuber");


        for (Map.Entry<String,String >pair: hashMap.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
