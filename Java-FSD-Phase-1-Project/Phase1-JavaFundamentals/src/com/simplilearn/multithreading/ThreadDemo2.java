package com.simplilearn.multithreading;

public class ThreadDemo2 {
    public static void main(String[] args) {

        Ram t1 = new Ram();
        t1.start();

        John t2 = new John();
        t2.start();
    }

}

class Ram extends Thread {

    @Override
    public void run() {
        System.out.println("Ram Thread is running");
    }
}

class John extends Thread {
    @Override
    public void run() {
        System.out.println("John Thread is running");
    }
}
