package com.company.QueuesEx;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        //Queue is an iterface cannot use it without overriding ... we can use ArrayDeque which implements Deque
//        //Deque extends Queue interface
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(23);
//        queue.add(44);
//        queue.add(12);
//        queue.add(84);
//        System.out.println(queue.remove());
//        System.out.println(queue.element());
//        System.out.println(queue);
customQueue queue = new customQueue(3);
        queue.add(3);
        queue.add(23);
        queue.add(8);
        queue.display();
    }
}
