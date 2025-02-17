package org.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class No8 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            final int value = i;
            executor.submit(() -> System.out.println(value));
        }
        executor.shutdown();
    }
}

