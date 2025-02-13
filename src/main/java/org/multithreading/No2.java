package org.multithreading;

public class No2 {
    private static int j = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(No2::increase);
        Thread thread2 = new Thread(No2::increase);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        print();
    }

    private static synchronized void print() {
        System.out.println(j);
    }

    private static synchronized void increase() {
        for (int i = 0; i < 100000; i++) {
            j++;
        }
    }
}
