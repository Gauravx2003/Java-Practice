package MultiThreading.Producer_Consumer;

import java.util.LinkedList;
import java.util.Queue;

class Buffer{
    Queue<Integer> buffer = new LinkedList<>();
    int capacity = 10;

    public synchronized void produce(int value) throws InterruptedException {
         while (buffer.size() == capacity){
             wait();
         }

         buffer.add(value);
         System.out.println("Producer : " + value + " by " + Thread.currentThread().getName());
         notifyAll();
    }

    public synchronized int consumer() throws InterruptedException {
        while (buffer.size() == 0){
            wait();
        }

        int value = buffer.poll();
        System.out.println("Consumer : " + value + " by " + Thread.currentThread().getName());
        notifyAll();
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread t1 = new Thread(()->{
            try{
                for(int i=0;i<10000;i++){
                    buffer.produce(i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            try{
                for(int i=0;i<10000;i++){
                    buffer.consumer();
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}
