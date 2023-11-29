package com.company.stacksEx.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NGR {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,4};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list  = new ArrayList<>();
      for(int i = arr.length- 1; i >= 0 ; i--){
          if(stack.isEmpty()) list.add(-1);
         else if(  stack.peek() > arr[i]) list.add(stack.peek());
          else if(stack.size() > 0 && stack.peek() <= arr[i]){
              while(stack.size() > 0 && stack.peek() <= arr[i]){
                  stack.pop();
              }
              if(stack.size() == 0) list.add(-1);
              else list.add(stack.peek());
          }
          stack.push(arr[i]);
      }
        Collections.reverse(list);
        System.out.println(list );
    }
}
