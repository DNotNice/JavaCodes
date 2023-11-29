package com.company.stacksEx.questions;

import java.util.ArrayList;
import java.util.Stack;

public class NGL {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[]{4,5,2,10,8};
        for(int i = 0  ; i < arr.length ; i++){
            if(stack.isEmpty()) list2.add(-1);
            else if (stack.peek() > arr[i]) list2.add(stack.peek());
            else if (stack.peek() <= arr[i]){
                while(stack.size() > 0 && stack.peek() <= arr[i]){
                    stack.pop();
                }
                if(stack.size() == 0) list2.add(-1);
                else {
                    list2.add(stack.pop());
                }
            }
            stack.push(arr[i]);
        }
        System.out.println(list2);
    }
}
