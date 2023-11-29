package com.company.stacksEx.questions;

public class RainWaterTrap {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int[] maxl= new int[arr.length];
        maxl[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
         maxl[i] = Math.max(maxl[i-1], arr[i]);
        }
        int[] maxr = new int[arr.length];
         maxr[maxr.length - 1] = arr[arr.length-1];
        for(int i = arr.length - 2; i >= 0 ;i--){
            maxr[i] = Math.max(maxr[i+1], arr[i]);
        }
        int[] width = new int[arr.length];
        int ans = 0;
        for(int i = 0 ; i< arr.length ;i++){
            width[i] = Math.min(maxl[i] , maxr[i]) - arr[i] ;
            ans+= width[i];
        }
        System.out.println(ans);
    }
}
