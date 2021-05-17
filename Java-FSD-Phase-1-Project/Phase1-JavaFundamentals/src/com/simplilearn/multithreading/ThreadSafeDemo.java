package com.simplilearn.multithreading;

class Counter {
    int count;
    //make increase count ThreadSafe --> use synchronized keyword
    public synchronized void increaseCount(){
        count ++; //count = count +1; ; count+=1;
    }

    public void decreaseCount(){
        count --;
    }

}
public class ThreadSafeDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() ->{
            for (int i= 1; i<=1000; i++){
                counter.increaseCount();
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i= 1; i<=1000; i++){
                counter.increaseCount();
            }
        });

        Thread t3= new Thread(() ->{
            for (int i= 1; i<=1000; i++){
                counter.increaseCount();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Thread 1: " +t1.getId());
        System.out.println("Thread 2: " +t2.getId());
        System.out.println("Thread 3: " +t3.getId());
        System.out.println("The Count :: "+counter.count);
    }
}

