package org.multithreading;


public class No4 {
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            synchronized (Main.class) {
                for (int i = 0; i < 100000; i++) {
                    count++;
                }
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}

