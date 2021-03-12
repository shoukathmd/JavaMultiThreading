package com.multithreading;

public class CounterDemo {

    public static void main(String[] args) {
        ThreadUnsafeClass unsafeCounter = new ThreadUnsafeClass();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    unsafeCounter.incrementCounter();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++){
                    unsafeCounter.decrementCounter();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        unsafeCounter.printCounter();
    }
}
