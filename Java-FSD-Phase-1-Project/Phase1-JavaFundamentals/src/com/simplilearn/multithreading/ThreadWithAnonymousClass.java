package com.simplilearn.multithreading;

public class ThreadWithAnonymousClass {
    public static void main(String[] args) {

       Runnable obj1 = new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 5; i++) {
                   System.out.println("Thread1 :: Hello");
               }
           }
       };

        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread2 :: Hello");
                }
            }
        };
        Thread t1 = new Thread(obj1);
        t1.start();

        Thread t2 = new Thread(obj2);
        t2.start();
    }
}




