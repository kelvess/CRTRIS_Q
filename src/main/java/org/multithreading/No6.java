package org.multithreading;

public class No6 {
    public static void main(String[] args){
        Runnable task = ()->{
            System.out.println(Thread.currentThread().getName());
            //какие-то вычисления
        };
        task.run();
    }
}
