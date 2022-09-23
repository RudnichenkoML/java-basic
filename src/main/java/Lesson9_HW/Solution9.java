package Lesson9_HW;

import java.util.*;

public class Solution9 {
    public static void main(String[] args) {
        HashMap<String,String>hashMap = new HashMap<>();
        hashMap.put("First","string");
        hashMap.put("Second","string");
        hashMap.put("Third","string");
        hashMap.put("fourth","string");
        hashMap.put("fifth","string");
        hashMap.put("sixth","string");
        hashMap.put("seventh","string");
        hashMap.put("eighth","string");
        hashMap.put("ninth","string");
        hashMap.put("tenth","string");
        Set<String>keySet = hashMap.keySet();
        List<String>list = new ArrayList<>(keySet);
        for (String s:list) {
            System.out.println(s);
        }


    }
}
