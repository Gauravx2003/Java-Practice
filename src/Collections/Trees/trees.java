package Collections.Trees;

import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}

public class trees {

    public static void main(String[] args) {


        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(10, "A");
        employees.put(20, "B");
        employees.put(30, "C");
        employees.put(40, "D");
        employees.put(50, "E");

        Map.Entry<Integer, String> x = employees.lowerEntry(30);
        Map.Entry<Integer, String> y = employees.higherEntry(30);

        System.out.println(x.getValue() + y.getValue());

        System.out.println(employees);






//        for(Employee e:treeSet){
//            System.out.println(e);
//        }
    }
}
