package com.company.sortingAlgos;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,22,7,9,31,5,13};
        int n = 7 ;
        for(int i = 0 ; i < n-1 ;i++){
            for(int j = 1 ; j < n-i;j++){
                if(arr[j] < arr[j-1]){
                    int  temp = arr[j] ;
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
