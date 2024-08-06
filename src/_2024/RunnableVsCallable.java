package _2024;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RunnableVsCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        AtomicInteger callSum = new AtomicInteger(0);
//        Callable<Integer> sumInt = () -> {
//            for (int i=0;i<=5;i++) {
//                callSum.addAndGet(i);
//            }
//            return callSum.get();
//        };
//        ExecutorService execute = Executors.newFixedThreadPool(2);
//        Future<Integer> res = execute.submit(sumInt);
//        System.out.println(res.get());
//        execute.close();
        AtomicInteger sum = new AtomicInteger(0);
        Runnable addInt = () -> {
            for (int i=0;i<=5;i++) {
                sum.addAndGet(i);
            }
            System.out.println(sum.get());
        };
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(addInt);
        executorService.close();
//        Thread t1 = new Thread(addInt);
//        Thread t2 = new Thread(addInt);
//        t1.start();
//        t2.start();
    }
}
