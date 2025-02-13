package org.multithreading;

public class No3 {
    private static int j = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(No3::increase);
        Thread thread2 = new Thread(No3::increase);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(j);
    }

    private static void increase() {
        for (int i = 0; i < 100000; i++) {
            synchronized (No3.class) {
                j++; // <- эта строка
            }
        }
    }
}

