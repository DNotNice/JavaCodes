package com.company.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n  = sc.nextInt() ;
           int x = sc.nextInt();
           int[] arr = new int[n] ;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE ;

            for(int i = 0 ; i < n ; i++){
               arr[i] = sc.nextInt() ;
                 max = Math.max(max,arr[i]);
                 min = Math.min(min , arr[i]);
           }

            int count = 0 ;
                int h = 0 ;
               while(h<n){
                   while(arr[h] > 0 ){
                       arr[h] -= x;
                       count++;
                   }
                   h++;
               }
               if(max < count){
                   System.out.println(max);
               }
               else{
                   System.out.println(count);
               }

        }
    }
}
