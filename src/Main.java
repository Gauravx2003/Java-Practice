import java.io.IOException;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.name.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;

        if(!(obj instanceof Student)) return false;
        Student other = (Student)obj;
        return this.name.equals(other.name);
    }

    int add(int x , int b){
        System.out.println("primitive method");
        return x+b;
    }

    int add(Integer x , Integer b){
        System.out.println("Object method");
        return x+b;
    }


}

public class Main {
    public static void main(String[] args) {

        HashMap<Student, String> mp = new HashMap<>(25);

        String str = "fusdfuwef";

        Student s = new Student("gaurav");
        mp.put(s,"daware");

        Student s2 = new Student("gaurav");

        System.out.println(s2.toString());

        Integer a = 24;

        System.out.println(a.toString());

        s.add(Integer.valueOf(3),Integer.valueOf(5));

//        System.out.println(mp.get(s2));
//
//        System.out.println(s.equals(s2));
//
//        System.out.println(s.hashCode() + " ," + s2.hashCode());



    }
}