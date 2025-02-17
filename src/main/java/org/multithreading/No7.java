package org.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class No7 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            final int value = i;
            executor.submit(() -> System.out.println(value));
        }
        executor.shutdown();
    }
}

