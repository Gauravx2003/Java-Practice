package ExceptionHandling._01_basics_of_exception;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excep
{


    public static void printNumber(int number){
        if(number < 10)
        {
            throw new ArithmeticException("Arithmetic Exception");
        }

        System.out.println("Accepted NUmber: " + number);
    }

    public static void readfile() {
        try (FileReader fr = new FileReader("/home/gaurav-daware/Documents/Java-Practsrc/ExceptionHandling/_01_basics_of_exception/data.txt"))
        {
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }



    public static void main(String[] args)
    {
        readfile();
    }
}
