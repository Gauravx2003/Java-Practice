package Collections._04_Comparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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
        if(this.mark > o.mark)
        {
            return -1;
        }else if(this.mark<o.mark)
        {
            return 1;
        }else{
            return 0;
        }
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
            return o2.name.compareTo(o1.name);
        }
        return o1.mark - o2.mark;
    }
}


public class Main {
    public static void main(String[] args) {
         ArrayList<Student> students = new ArrayList<Student>();
         students.add(new Student(1,"Alex",10));
         students.add(new Student(3,"David",30));
        students.add(new Student(2,"Bob",30));
         students.add(new Student(4,"Jack",40));

        Collections.sort(students);

        for(Student s: students){
            System.out.println(s);
        }
    }
}
