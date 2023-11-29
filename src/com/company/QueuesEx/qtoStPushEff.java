package com.company.QueuesEx;

import java.util.ArrayDeque;
import java.util.Queue;

// push should happen in constant time
// other things can take linear time
public class qtoStPushEff {
    Queue<Integer> mainQ ;
    Queue<Integer> helperQ;

      public qtoStPushEff(){
      mainQ = new ArrayDeque<>();
      helperQ = new ArrayDeque<>();
    }
    public  void push(int elem){
          mainQ.add(elem);
    }
    public int pop(){
        if(mainQ.size() == 0) {System.out.println("empty stack"); return -1;}
        while(mainQ.size() > 1) helperQ.add(mainQ.remove());
        int temp = mainQ.remove();
        while(helperQ.size()!= 0){
            mainQ.add(helperQ.remove());
        }
        return temp;

    }
    public int top(){
          if(mainQ.size() == 0) {System.out.println("empty stack"); return -1;}
          while(mainQ.size() > 1) helperQ.add(mainQ.remove());
          int temp = mainQ.remove();
          helperQ.add(temp);
          while(helperQ.size()!= 0){
              mainQ.add(helperQ.remove());
          }
          return temp;
    }

    public static void main(String[] args) {
        qtoStPushEff arr = new qtoStPushEff();
        arr.push(23);
        arr.push(5);
        arr.push(12);
        System.out.println(arr.pop());
        System.out.println(arr.top());
    }
}
