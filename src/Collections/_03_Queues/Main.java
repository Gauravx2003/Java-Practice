package Collections._03_Queues;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("x");
        pq.add("gaurav");
        pq.add("gausar");

        String[] array = pq.toArray(new String[pq.size()]);
        Arrays.sort(array,pq.comparator());

        Iterator<String> it = pq.iterator();

        for(String s : array){
            System.out.println(s);
        }



    }
}
