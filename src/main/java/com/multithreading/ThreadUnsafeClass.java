package com.multithreading;

public class ThreadUnsafeClass {
    int count = 0;

    public synchronized void incrementCounter(){
        count++;
    }

    public synchronized void decrementCounter(){
        count--;
    }

    public void printCounter(){
        System.out.println(count);
    }
}
