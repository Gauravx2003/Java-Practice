package ExceptionHandling._02_advanced_exception_handling;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class custom extends  RuntimeException {
    public custom(String message, Throwable cause) {
        super(message, cause);
    }
}


class base
{
    void readfile(){
        try{
            Integer x = Integer.valueOf("abc");
        }catch (IllegalArgumentException e){
            throw new custom("Invalid input",e);
        }
    }
}

//class child extends base{
//
//}

public class Main {

     public void show(final int a , final int b)
    {
        System.out.println("Inside main method" + (a+b));
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 8));

        base b = new base();
        b.readfile();
    }
}
