package MultiThreading.Basics;

//Two ways to create Threads ...extending thread class and implementing runnable interface

class taks extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread run by: " + Thread.currentThread().getName());
    }
}

class task2 implements  Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread run by: "+ Thread.currentThread().getName());
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        Thread.currentThread().getName() + " : " + i
                );
            }

        });

        Thread t2 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        Thread.currentThread().getName() + " : " + i
                );
            }

        });

        t1.setName("Worker-1");
        t2.setName("Worker-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main finished");
    }
}