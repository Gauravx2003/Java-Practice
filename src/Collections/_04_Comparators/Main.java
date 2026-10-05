package Collections._04_Comparators;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Student implements Comparable<Student>
{
    int id;
    String name;
    int mark;

    Student(int id, String name, int mark)
    {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }


    public int compareTo(Student o)
    {
        return Integer.compare(o.mark, this.mark);
    }

    @Override
    public int hashCode()
    {
        return Integer.valueOf(id).hashCode();
    }

    @Override
    public boolean equals(Object s){
        if(this==s) return true;

        if(s==null) return false;

        Student ss =  (Student)s;
        return this.id==ss.id;
    }

    @Override
    public String toString(){
        return "Id: "+this.id+", Name: "+this.name+", Mark: "+this.mark;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.mark == o2.mark){
            return o2.id-o1.id;
        }
        return o1.mark - o2.mark;
    }
}

class child{
    public void readfile(){
        try{
            int a = 10 / 0;
            FileReader  fr = new FileReader("sdsd");
        }catch(ArithmeticException e){
            System.out.println("Error");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("IO Exception occured");
            e.printStackTrace();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        HashMap<Student, String> mp = new HashMap<Student, String>();

        Student s1 = new Student(1, "fusdfuwef", 5);
        Student s2 = new Student(2, "gaurav", 151);
        Student s3 = new Student(3, "Ajay", 151);

        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //Collections.sort(list, new StudentComparator());

        Collections.sort(list, (o1,o2)-> {
            if(o1.mark == o2.mark){
                return o1.name.compareTo(o2.name);
            }

            return o1.mark - o2.mark;
        });

        for(Student s: list){
            System.out.println(s);
        }

        child c = new child();
        c.readfile();
    }
}
