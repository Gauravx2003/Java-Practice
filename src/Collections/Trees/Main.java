package Collections.Trees;

import java.util.*;

class employee implements Comparable<employee>{
    int id;
    String name;

    employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(employee o) {
        return o.id - this.id;
    }

    @Override
    public String toString() {
        return  "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

}

public class Main {
    public static void main(String[] args) {
        TreeSet<employee> treeSet = new TreeSet<>();

        treeSet.add(new employee(2,"Gaurav"));
        treeSet.add(new employee(3,"David"));

        Iterator<employee> it =  treeSet.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        TreeSet<Integer> numbers =
                new TreeSet<>(Arrays.asList(
                        10, 20, 30, 40, 50, 60
                ));

        SortedSet<Integer> st = numbers.headSet(20, true);
        System.out.println(st);

        System.out.println(numbers);

        st.remove(20);

        System.out.println(numbers);

        //System.out.println(treeSet);
    }

}
