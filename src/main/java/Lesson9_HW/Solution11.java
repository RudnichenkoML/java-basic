package Lesson9_HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution11 {
    public static void main(String[] args) {
        Map<String, Object>hashMap = new  HashMap<>();
        hashMap.put("test",1);
        hashMap.put("test1",2);
        hashMap.put("test2",3);
        hashMap.put("test3",4);
        hashMap.put("test4",5);
        hashMap.put("test5",6);
        hashMap.put("test6",7);
        hashMap.put("test7",8);
        hashMap.put("test8",9);
        hashMap.put("test9",10);

        for (Map.Entry<String, Object>pair:hashMap.entrySet()) {
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
