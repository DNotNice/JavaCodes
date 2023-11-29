package com.company.sortingAlgos;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = 5 ;
        for(int i = 0 ; i < n-1 ; i++){
            //find the maximum item in the remaining array and swap with correct index
            int last_ind = arr.length - i - 1;
             int max_index = getMaxIndex( arr , last_ind);
            swap(arr , max_index , last_ind);
        }
        System.out.println(Arrays.toString(arr));
    }
    static public void swap(int[] arr, int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int end) {
        int maxx= end;
        for(int i = 0; i < end ; i++) {
            if(arr[maxx] < arr[i]) maxx= i ;
        }
        return maxx;
    }
}
