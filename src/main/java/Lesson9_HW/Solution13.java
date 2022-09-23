package Lesson9_HW;

import javax.imageio.ImageTranscoder;
import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Solution13 {

    public static void main(String[] args) {

        Map<String, String> peoples = new HashMap<>();
        peoples.put("Banderos", "Antonio");
        peoples.put("Dicaprio", "Leo");
        peoples.put("Willis", "Bruis");
        peoples.put("Testovich", "Antonio");
        peoples.put("Jonsonuk", "Borys");
        peoples.put("Bandera", "Stepan");
        peoples.put("Band", "Antonio");
        peoples.put("Bond", "Antonio");
        peoples.put("Karaposov", "Antonio");
        peoples.put("Ivanov", "Ivan");
        Map<String, String> viseVersaMap = new HashMap<>();


        for (Map.Entry<String, String> pair : peoples.entrySet()) {
            viseVersaMap.put(pair.getValue(), pair.getKey());

        }
        for (Map.Entry<String, String> pair : viseVersaMap.entrySet()) {
            System.out.println(pair.getKey() + "-" + pair.getValue());
        }
    }


}




        







