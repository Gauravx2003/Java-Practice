package Interfaces._01_baisc_interface;

//Defines methods / blueprint that the implementing classes mus implement along with default and static methods
// are also valid

public interface testInterface
{

    //Constant ( public static final )
    int a = 10;

    //abstract method
    void display();

    //default method
    default void show()
    {
        System.out.println("This is a default method");
    }

    //static method
    static void bar()
    {
        System.out.println("This is a static method");
    }
}
