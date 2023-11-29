package com.company.Extrass;
import java.util.*;

public class Cses1 {
    public static void main(String[] args) {
        int[] nums = {6, 7, 1, 2, 3, 4, 5};
        int target = 5;
        int sol = ans(nums ,target);
        System.out.println(sol);
    }
//    static void lsie ( int s){
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        whiile(t-- > 0){
//            int a = sc.nextInt():
//        }
//    }
      static int ans (int[] nums , int target ) {

          int pivotis = pivot(nums);
          if (pivotis == -1) {
              return binarysearchf(nums, target, 0, nums.length - 1);
          }
          if (nums[pivotis] == target) {
              return pivotis;
          }
          if (nums[0] <= target) {
              return binarysearchf(nums, target, 0, pivotis - 1);
          }

          return binarysearchf(nums, target, pivotis + 1, nums.length - 1);
      }

          static   int binarysearchf(int[] ar2 , int target , int start , int end ) {;
                while(start<=end){
                    int mid = (start + end)/2;
                    if(target < ar2[mid]){
                        end = mid - 1 ;
                    }
                    else if (target > ar2[mid]){
                        start= mid+ 1;
                    }
                    else
                        return mid;
                }
                return -1;
            }



         static    int pivot(int[] array  ){
                int start = 0 ;
                int end = array.length -1 ;
                while(start <= end) {
                    int mid =  (end + start ) / 2 ;
                    //4 cases to find pivot
                    if( mid < end && array[mid ] > array[mid + 1]){
                        return mid ; }
                    if( mid > start && array[mid] < array[mid - 1] ){
                        return mid - 1;
                    }
                    if(array[mid] <= start){
                        end = mid - 1;
                    }
                    if(start < array[mid]){
                        start = mid + 1 ;
                    }
                }
                return - 1 ;
            }


        }


