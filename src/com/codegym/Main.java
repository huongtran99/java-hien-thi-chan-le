package com.codegym;

public class Main {

    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        Thread thread1 = new Thread(oddThread);
        EvenThread evenThread = new EvenThread();
        Thread thread2 = new Thread(evenThread);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

    }
}
