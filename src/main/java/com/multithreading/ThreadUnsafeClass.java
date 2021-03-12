package com.multithreading;

public class ThreadUnsafeClass {
    int count = 0;

    public void incrementCounter(){
        count++;
    }

    public void decrementCounter(){
        count--;
    }

    public void printCounter(){
        System.out.println(count);
    }
}
