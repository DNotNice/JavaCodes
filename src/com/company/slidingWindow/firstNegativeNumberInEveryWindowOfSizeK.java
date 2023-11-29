package com.company.slidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class firstNegativeNumberInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[]arr = {12,-1,-7,8,-15,30,16,28};
        int window = 3 ,start = 0 , end = 0 ;
        ArrayDeque<Integer> Adeque  = new  ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(end < arr.length){
            if( arr[end] < 0) Adeque.add(arr[end]);
            if(end - start + 1 == window){
                if(Adeque.size()==0) list.add(0);
                else{
                   list.add(Adeque.getFirst());
                   if(arr[start]==Adeque.getFirst()) Adeque.removeFirst();
                   start++;
                }
            }
            end++;
        }
        System.out.println(list);
    }
}
