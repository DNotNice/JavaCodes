package com.company.slidingWindow;

public class LargestSubarryOfSizeK {
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,2,3,5};
        int sum = 5 , start = 0 , end = 0 , ans = 0 , temp = 0  ;

        //works for positive elements only
        while(end < arr.length ){
             temp += arr[end];
             if(temp > sum)   while(temp > sum ) temp-=arr[start++];
             if (temp == sum) ans++;
             end++;
        }
        System.out.println(ans);


        //for negative elements  -- will use something like Map

    }
}
