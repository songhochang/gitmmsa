package org.example;

import java.util.Optional;
import java.util.concurrent.*;

public class Ex05 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Optional<Integer> aa = Optional.of(19);

        Callable<Integer> callable = ()->{
            int sum = 0;
            for(int i = 0; i < 100; i++){
                sum += 1;
            }
            return sum;
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(callable);

        System.out.println(future.get());
        executorService.shutdown();

    }

}
