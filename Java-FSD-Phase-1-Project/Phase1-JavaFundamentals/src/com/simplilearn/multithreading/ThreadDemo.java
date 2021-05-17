package com.simplilearn.multithreading;

public class ThreadDemo extends Thread{
    public static void main(String[] args) {

        ThreadDemo mainT = new ThreadDemo();
        mainT.start();

    }
    public void run() {
            System.out.println("Main Thread is Running ....");
        }

}
