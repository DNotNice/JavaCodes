package com.company.QueuesEx;

import java.util.ArrayDeque;
import java.util.Queue;
//make queue behave like stack
//this is only pop efficient

public class queueToStackAdap {

    Queue<Integer> mainQueue ;
    Queue<Integer> helpQueue ;
   public  queueToStackAdap() {
       mainQueue = new ArrayDeque<>();
       helpQueue = new ArrayDeque<>();

   }
   public  void  push(int elem){
       while(mainQueue.size() > 0){
           helpQueue.add(mainQueue.remove());
       }
       mainQueue.add(elem );
       while(helpQueue.size() > 0){
           mainQueue.add(helpQueue.remove());
       }
   }
   //now since the queue always have newest element at first pos
    // pop will always have constant TC ;
 public int pop(){
       return mainQueue.remove() ;
 }

    public static void main(String[] args) {
        queueToStackAdap arr = new queueToStackAdap();
       arr.push(23);
       arr.push(22);
       arr.push(1);
        System.out.println(arr.pop());
    }

}
