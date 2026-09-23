package Collections._01_Basics_od_collections._02_Iteration;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, String> mp = new  HashMap<>();

        mp.put(1, "one");
        mp.put(2, "two");
        mp.put(3, "three");

        list.add(19);
        list.add(22);
        list.add(11);

        Iterator it = list.iterator();
        Iterator<Map.Entry<Integer, String>> it2 = mp.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it2.hasNext()) {
            Map.Entry<Integer, String> entry = it2.next();
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
    }
}
