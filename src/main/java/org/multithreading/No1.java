package org.multithreading;

public class No1 {
    private static int j = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(No1::increase);
        Thread thread2 = new Thread(No1::increase);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(j);
    }

    private static void increase() {
        for (int i = 0; i < 100000; i++) {
            j++;
        }
    }
}
