package Collections._01_Basics_od_collections._02_Iteration;

import Interfaces._01_baisc_interface.temp;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator it = list.iterator();

        //Cocurrent Modification Exception when we try to modify the collection while iterating it

        //We can use Iterator's inbuilt methods like remove() for modification and it would not throw exception

        while (it.hasNext()) {
            if(it.next().equals(3)) {
                it.remove();
            }
        }

        it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
