package com.company.sortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i =   0 ;i  < n ;i++)arr[i] = sc.nextInt();
       sort(arr , 0,arr.length-1 );
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr , int low  , int hi){
        if(low >= hi)return;
        int s = low ;
        int e = hi;
        int pivot = arr[(e+s)/2];
        while(s <= e){
            while(arr[s] < pivot)s++;
            while(arr[e]  > pivot) e--;
            if(s <= e) {
                int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++;
                    e--;
            }}
         sort(arr , low , e );
         sort(arr ,s , hi);
    }}
