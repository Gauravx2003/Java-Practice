package Collections.Trees;

import java.util.*;

class Employees implements  Comparable<Employees>
{
    String name;
    int id;
    double salary;

    public Employees(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "\nName: " + name + ", Id: " + id + ", Salary: " + salary;
    }

    @Override
    public int compareTo(Employees e){
        return Integer.compare(this.id, e.id);
    }
}

public class treemap {
    public static void main(String[] args) {
        TreeMap<Employees, String> tm  = new TreeMap<Employees, String>(Comparator.comparingInt((Employees e) -> e.id).thenComparing(
                (Employees e) -> e.name
        ));

        Employees e1 = new Employees("Gaurav", 4, 435.9);
        Employees e2 = new Employees("Ankit", 1, 873.2);
        Employees e3 = new Employees("Suresh", 9, 1200.8);
        Employees e4 = new Employees("Ramesh",4,9002);

        Employees e5 = new Employees("Lokesh",5,902);

        tm.put(e1,"QA");
        tm.put(e2,"Dev");
        tm.put(e3,"QA");
        tm.put(e4,"Dev");
        tm.put(e5,"Sales");

        SortedMap<Employees, String> result = tm.descendingMap();

        result.put(e1,"CEO");
        System.out.println(tm);
        System.out.println(result);

//        for(Map.Entry<Employees, String> e: tm.entrySet()){
//            System.out.println(e.getKey() + " --------> " + e.getValue());
//           // System.out.println(e.getValue());
//        }



    }
}
