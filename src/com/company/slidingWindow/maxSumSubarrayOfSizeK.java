package com.company.slidingWindow;

public class maxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int size=7;
        int[] arr = {2,5,1,8,2,9,1};
        int window  = 3;
        int max= Integer.MIN_VALUE;
        int i = 0 , j = 0 ,sum = 0 ;
        while(j < size){
            sum += arr[j];
            if(j-i+1 == window){
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        System.out.println(max);
    }
}
