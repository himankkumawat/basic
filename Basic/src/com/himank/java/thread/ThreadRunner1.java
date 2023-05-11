package com.himank.java.thread;

public class ThreadRunner1 {

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("Priority of main thread: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        myThread1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Inside main Thread. i = " + i);
        }
    }
}
