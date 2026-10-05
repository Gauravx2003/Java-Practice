import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



class base{
//    public base()
//    {
//        System.out.println("base");
//    }

    public base(int a){
        System.out.println(a);
    }
}

class child extends base{
    public child()
    {
        super(0);
        System.out.println("child");
    }
}

public class Main {

    Integer a;

    void add(int a, int b){

        System.out.println("Integer method");
        System.out.println(a+b);
    }

    void add(int a, float b){
        System.out.println("Integer and Float method");
        System.out.println(a+b);
    }

    void add(double a, double b){
        System.out.println("Integer and Double method");
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        Main m = new Main();

        m.add(1f,1f);
    }
}