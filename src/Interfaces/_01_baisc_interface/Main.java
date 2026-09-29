package Interfaces._01_baisc_interface;

interface tempo{
    default void show(){
        System.out.println("This is a interface 1 method");
    }
}

interface tempo2{
    default void show(){
        System.out.println("This is a interface 2 method");
    }
}

class tempo3 implements tempo2,tempo{
    public void show(){
        tempo2.super.show();
    }
}


public class Main extends temp{

    public static void main(String[] args)
    {
           tempo3 t = new tempo3();
           t.show();

    }
}
