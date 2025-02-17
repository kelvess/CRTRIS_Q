package org.multithreading;

public class No5 {
    int j = 0;
    synchronized (j) static void doSomeAction(){
        // Критическая секция
    }

    public static void main(String[] args) {
        doSomeAction();
    }
}
