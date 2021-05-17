package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
    public static void main(String[] args) {
        // TODO :: Create a Integer queue with data insertion from both the ends.
        // Iteration over queue.

        Deque<Integer> queue = new ArrayDeque<Integer>();
        queue.addFirst(12);
        queue.add(120);
        queue.add(1232);
        queue.add(22);
        queue.add(232);
        queue.addLast(1452);

        System.out.println(queue);
        for (Integer n : queue){
            System.out.println(n);
        }

    }
}
