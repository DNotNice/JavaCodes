package com.company.stacksEx.questions;

import java.util.Stack;

public class MinStack {
    //using extra space ;
    static  Stack<Integer> sc = new Stack<>();
    static  Stack<Integer> ss = new Stack<>();

    static void push(int elem){
        sc.push(elem);
    if(ss.size() == 0 || ss.peek() < elem)
        ss.push(elem);


    }
    static int pop(){
        if(sc.size() == 0)return  -1 ;

        if(sc.peek().equals(ss.peek())){
            ss.pop();
        }

        return sc.pop();
    }
    static int getmin(){
        if(ss.size() == 0) return -1 ;
        return ss.peek();
    }

}
