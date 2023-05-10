package com.himank.java.thread;

public class ThreadRunner {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside main Thread. i = " + i);
        }
    }
}
