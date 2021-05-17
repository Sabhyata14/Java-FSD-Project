package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionDemo {
    public static void main(String[] args) {

        // Queue  is a data structure which works in first in first out order.
        // Queue : Priority Queue :: Does not order element FIFO

        Queue<String> bankQueue = new PriorityQueue<String>();

        bankQueue.add("John");
        bankQueue.add("Mike");
        bankQueue.add("William");
        bankQueue.add("Vijay");
        bankQueue.add("Moose");

        // peek an element only print HEAD
        System.out.println("Head  :->  " + bankQueue.peek());
        System.out.println("Head  :->  " + bankQueue.element());

        // poll -> print element and remove element from queue
        System.out.println("Head  :->  " + bankQueue.poll());
        System.out.println(bankQueue);

        //Iteration over queue
        for (String n : bankQueue) {
            System.out.println(n);
        }

        ArrayDeque<String> queueFiles = new ArrayDeque<String>();
        queueFiles.addFirst("File 1");
        queueFiles.add("File 2");
        queueFiles.add("File 3");
        queueFiles.add("File 4");
        queueFiles.addLast("File 1");

        for (String f : queueFiles) {
            System.out.println(f);
        }
        System.out.println(queueFiles.pop());
        System.out.println(queueFiles);
        System.out.println(queueFiles.pollLast());
        System.out.println(queueFiles);
    }


}
