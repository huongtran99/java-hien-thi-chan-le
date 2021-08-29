package com.codegym;

public class EvenThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 11; i += 2) {
                System.out.println(i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
