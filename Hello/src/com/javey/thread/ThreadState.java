package com.javey.thread;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        System.out.println(a.getName() + " " + a.getState());
        a.start();

        while (Thread.State.TERMINATED != a.getState()) {
            System.out.println(a.getName() + " " + a.getState());
            Thread.sleep(1000);
        }


        System.out.println(a.getName() + " " + a.getState());
    }
}

class A extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
