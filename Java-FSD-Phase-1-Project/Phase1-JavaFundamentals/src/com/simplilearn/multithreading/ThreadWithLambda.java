package com.simplilearn.multithreading;

public class ThreadWithLambda {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread1 :: Hello");
                }

        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread2 :: Hello");
                }
            }
        });
        t2.start();
    }
}




