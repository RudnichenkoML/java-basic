package Lesson9_HW;

import java.util.HashMap;
import java.util.Map;

public class Solution10 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Maxim","Rudnichenko");
        map.put("Ivan","Ivanov");
        map.put("Yan","Yansky");
        map.put("Petro","Powder");
        map.put("Kirill","Kirillovsky");
        map.put("Anna","Annovna");
        map.put("Halina","Akulova");
        map.put("Mykola","Mykoloiv");
        map.put("Kate","Blade");
        map.put("Bruis","Willis");


        for (Map.Entry<String, String>pair:map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }

}
