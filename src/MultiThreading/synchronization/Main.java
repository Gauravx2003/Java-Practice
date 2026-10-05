package MultiThreading.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

class Counter
{
    int counter = 0;

    AtomicInteger atomicInteger = new AtomicInteger(0);

    public void increment()
    {
        atomicInteger.incrementAndGet();
    }
    public int getCounter()
    {
        return atomicInteger.get();
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(()->{
            for(int i=0; i<10000;i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0; i<10000;i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCounter());

        System.out.println("main thread end");
    }

}
