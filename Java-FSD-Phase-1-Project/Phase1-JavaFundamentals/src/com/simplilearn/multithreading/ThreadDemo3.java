package com.simplilearn.multithreading;

public class ThreadDemo3 {
    public static void main(String[] args) {

        Bob bob = new Bob();

        Thread t1 = new Thread(bob);
        t1.start();
    }
}
class Bob extends Thread implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Bob :: Hi");
        }
    }
}

class Work{
    public void coding(String name) {
        System.out.println("----- Coding-----");
    }
}
