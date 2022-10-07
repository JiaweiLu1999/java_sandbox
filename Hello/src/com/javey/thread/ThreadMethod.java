package com.javey.thread;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setDaemon(true);
        t.start();

        for (int i = 0; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("Main Thread " + i);
        }
    }
}

class T extends Thread {
    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child Thread ");
        }
    }
}
