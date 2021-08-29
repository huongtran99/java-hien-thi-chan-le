package com.codegym;

public class OddThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i += 2) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
