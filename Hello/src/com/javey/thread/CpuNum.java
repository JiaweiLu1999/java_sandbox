package com.javey.thread;

public class CpuNum {
    public static void main(String[] args) throws InterruptedException {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Cat extends Thread {
    int times = 0;
    String hello;
    @Override
    public void run() {
        while (times <= 8) {
            System.out.println(Thread.currentThread().getName() + " " + times + " meow~");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            times++;
        }
    }

    public void play(String hello) {
        System.out.println(hello);
    }
}
enum cats {
    EEE, RR
};
class Dog implements Runnable {
    int cnt = 0;
    @Override
    public void run() {
        while (cnt <= 10) {
            System.out.println(Thread.currentThread().getName() + " woof~");
            cnt++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
