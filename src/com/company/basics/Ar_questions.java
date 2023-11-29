package com.company.basics;
import  java.util.*;

public class Ar_questions {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int r,c;
     int [][] arr = new int[6][6];
     for(int i=1;i<6;i++) {
         for (int j = 1; j < 6; j++) {
             arr[i][j] = sc.nextInt();
             if (arr[i][j] == 1) {
                 r = Math.abs(3 - i);
                 c = Math.abs(3 - j);
                 System.out.println(r + c);
                 break;
             }
         }
     }

    }

}
//        int[] ans = new int [nums];
//        for(int i = 0 ;i<nums;i++){
//            a[i] = sc.nextInt();
//        }
//        for(int i = 0 ;i<nums;i++){
//            ans[i] = a[a[i]];
//        }
//        System.out.println(Arrays.toString(ans));


//        Maximum value in an Array
//        int [] arr = {1,4,26,2,46};
//        int a = max(arr);
//        System.out.println(a);
//    }
//    static int max(int[] arr){
//        int maxVal = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal ;



//reversing an array using Swap function in reverse func :
//        int[] arr = {1, 2, 3, 4, 5};
//         reverse(arr);
//        System.out.print(Arrays.toString(arr));
//    }
//    static void reverse(int[]ar){
//        int st = 0;
//        int end = ar.length-1;
//        while(st<end){
//            swap(ar,st,end);
//            st++;
//            end--;
//        }
//    }
//    static void swap(int[]arr , int index1,int index2){
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;