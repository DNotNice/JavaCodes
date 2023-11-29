package com.company.stacksEx.questions;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProb {
    public static void main(String[] args) {
        int[] arr = new int[]{100,80,60,70,60,75,85};
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> art = new ArrayList<>();
        stk.push(0);
        art.add(1);
        for(int i = 1 ; i < arr.length ; i++){
            if(stk.size() > 0 && arr[i] < arr[stk.peek()]){
                art.add(i - stk.peek());
            }
            if(stk.size() > 0 && arr[i] > arr[stk.peek()]){
                while(stk.size() >0 && arr[stk.peek()] < arr[i]) stk.pop();
                if(stk.size() == 0) art.add(i+1);
                else art.add(i - stk.peek());}

            stk.push(i);

        }
        System.out.println(art);
    }
}
