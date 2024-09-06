package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex06 {

    public static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 16; i++){
            list.add(i);
        }

        System.out.println(list);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()->{
            for (int i = 0; i < 16; i++){
                list.set(i, list.get(i) + 1);
            }
        });
        executorService.submit(()->{
            for (int i = 0; i < 16; i++){
                list.set(i, list.get(i) + 1);
            }
        });
        executorService.submit(()->{
            for (int i = 0; i < 16; i++){
                list.set(i, list.get(i) + 1);
            }
        });

        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.SECONDS);

    }

}
