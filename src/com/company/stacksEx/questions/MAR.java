package com.company.stacksEx.questions;

import java.util.Stack;

public class MAR {
    public static void main(String[] args) {
        int max = 0 ;
        int[][] arr = {{0,1,1,0},
                {1,1,1,1},
                {1,1,1,1,},
                {1,1,0,0}
        };
        int[] arw = new int[arr[0].length];
        for(int i = 0 ; i < arr[0].length ;i++ ){
             arw[i] += arr[0][i];
        }
         max = mah(arw);
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] == 0 ) arw[j] = 0 ;
                else arw[j] += arr[i][j];
            }
            max = Math.max(max,mah(arw));
        }
        System.out.println(max);
    }

    static int mah(int[] arr){
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
        return max ;
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
