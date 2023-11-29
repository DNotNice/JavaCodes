package com.company.sortingAlgos;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 3, 14, 2, 4, 5, 6, 34};
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public  static  void mergesort(int [] arr, int lb ,int ub){
        if( lb < ub){
            int mid = (lb+ ub) / 2;
            mergesort(arr, lb , mid);
            mergesort(arr , mid+1 , ub);
            merge(arr, lb , mid , ub);
        }
    }
    public  static void merge(int[] arr, int lb , int mid , int ub){
        //find length of both the sub-arrays
        int n1 = mid-lb+1;
        int n2 = ub - mid ;

        //create two array for left and right side
        int [] fl = new int[n1];
        int [] fr = new int[n2] ;

        //copy values from arr
        for(int i = 0 ; i < n1 ; i++) fl[i] = arr[lb+i];
        for(int i = 0 ; i < n2 ; i++) fr[i] = arr[mid+1+i];


        int i = 0 ,j = 0 , k = lb;
        while( i < n1 && j < n2) {
            if (fl[i] <= fr[j]) {
                arr[k] = fl[i] ;
                i++;
            }
            else{
                arr[k] = fr[j];
                j++;
            }
            k++;
        }
        while( i < n1){
            arr[k] = fl[i] ;
            i++;
            k++;
        }
        while( j < n2){
            arr[k] = fr[j];
            k++;
            j++;
        }
    }
}
