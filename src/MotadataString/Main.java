package MotadataString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    Integer a;

    public static void main(String[] args) {
        Map<MotadataString, String> hm = new HashMap<>();

        MotadataString key1 = new MotadataString("Motadata");
        MotadataString key2 = new MotadataString("Motadata");
        MotadataString key3 = new MotadataString("Motadata");
        MotadataString key4 = new MotadataString("Motadata");

        hm.put(key1, "Ahmedabad");
        hm.put(key2, "Surat");
        hm.put(key3, "Ahmedabad");
        hm.put(key4,"Gujarat");

//        Main m = new Main();
        Iterator<Map.Entry<MotadataString,String>> it = hm.entrySet().iterator();
        // 3. Use a while loop to iterate through the map
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //System.out.println(a);
    }
}
