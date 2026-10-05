package MultiThreading.ExecutorService;

import java.util.concurrent.*;

class base{

    public Callable<Integer> task1(){
        return () -> {
            try {
                Thread.sleep(5000);
                System.out.println("task1 completed");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return 43;
        };
        //return () -> 42;
    }

    public Callable<Integer> task2() throws InterruptedException{
        return ()->
        {

            try {


                Thread.sleep(6000);

                System.out.println("task2 completed");
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

            return 11;
        };

        //return () -> 12;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        base b = new base();

        Future<Integer> f1 = executorService.submit(b.task1());
        Future<Integer> f2 = executorService.submit(b.task2());

        System.out.println("Main ended");

        executorService.shutdown();

    }
}
