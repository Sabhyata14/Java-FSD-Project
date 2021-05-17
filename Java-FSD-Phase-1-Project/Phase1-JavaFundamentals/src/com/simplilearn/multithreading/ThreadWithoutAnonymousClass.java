package com.simplilearn.multithreading;

public class ThreadWithoutAnonymousClass {
    public static void main(String[] args) {

        ThreadABC tabc1 = new ThreadABC();

        Thread t1 = new Thread(tabc1);
        t1.start();

        ThreadXYZ txyz = new ThreadXYZ();

        Thread t2 = new Thread(txyz);
        t2.start();
    }
}

class ThreadABC implements Runnable{

    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("ThreadABC :: Hello");
        }
    }
}

class ThreadXYZ implements Runnable{

    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("ThreadXYZ :: Hello");
        }
    }
}

