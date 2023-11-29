package com.company.stacksEx.questions;

import java.util.Stack;

public class MAH {
    public static void main(String[] args) {
        int[] arr = new int[]{6,2,5,4,5,1,6};
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] width = new int[arr.length];
         int[] NSL = nsl(arr, left);
         int[] NSR   = nsr(arr, right);
         int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i< arr.length ;i++){
            width[i] = NSR[i] - NSL[i] - 1;
            width[i] *= arr[i] ;
            max = Math.max(max,width[i]);
        }
        System.out.println(max);
    }
    static int[] nsl(int[] arr, int[] left){
        Stack<Integer> stack = new Stack<>();
        int pseudo = - 1;
        for(int i = 0 ;  i < arr.length ; i++){
            while(stack.size() > 0 && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
        if(stack.size() == 0 ) left[i] = -1 ;
        else left[i] = stack.peek();
        stack.push(i);
        }
        return left ;
    }
    static int[] nsr(int[] arr  , int[] right) {
        Stack<Integer> stack = new Stack<>();
        int pseudo = arr.length ;
        for (int i = arr.length - 1; i >= 0; i--) {
            while (stack.size() > 0 && arr[stack.peek()] >= arr[i]) stack.pop();
            if(stack.size() == 0)  right[i] = pseudo ;
            else right[i] = stack.peek() ;
          stack.push(i);
        }
        return right;
    }

}
