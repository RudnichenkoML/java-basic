package Lesson9_HW;

import java.util.HashMap;
import java.util.Map;

public class Solution8 {
    public static class Cat{
        String name;

    }

    public static void main(String[] args) {
        HashMap<String,Cat>cats = new HashMap<>();
        cats.put("Marsik",new Cat());
        cats.put("Vaska",new Cat());
        cats.put("Borka",new Cat());
        cats.put("Mursic",new Cat());
        cats.put("Kusia",new Cat());
        cats.put("Maxic",new Cat());
        cats.put("Snow",new Cat());
        cats.put("Citty",new Cat());
        cats.put("Candy",new Cat());
        cats.put("Cherry",new Cat());

        for (Map.Entry<String,Cat>pair:cats.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue().name);
        }
    }


}

