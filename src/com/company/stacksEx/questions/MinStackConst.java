package com.company.stacksEx.questions;

import java.util.Stack;

public class MinStackConst {
      Stack<Integer> stack;
    static int minElem = Integer.MAX_VALUE;

    MinStackConst() {
        this.stack = new Stack<>();
    }

     void push(int elem) {
        if (stack.isEmpty()) {
            stack.push(elem);
            minElem = elem;
        }
        else{
            if(elem >= minElem)stack.push(elem);
            else {
                 stack.push(2*elem - minElem);
                 minElem = elem;
            }

        }
    }

     int  pop() {
        int result = 0;
        if (stack.size() == 0) return -1;
        else {
            if (stack.peek() >= minElem) {
                return stack.pop();
            } else minElem = 2 * minElem - stack.peek();
            result = stack.pop();

        }
        return  result;
    }

      int peek() {
        int result = 0 ;
        if(stack.isEmpty()) return -1 ;
        else {
            if (stack.peek() >= minElem) result = stack.peek();
            else result = minElem;

        }
        return  result ;
    }
    int getMinElem(){

        if(stack.isEmpty()) return  -1;
        return  minElem;
    }




    public static void main(String[] args) {
    MinStackConst stack   = new MinStackConst();
    stack.push(5);
   stack.push(7);
    stack.push(3);
        System.out.println(stack.getMinElem());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}