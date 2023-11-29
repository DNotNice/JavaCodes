package com.company.BinarySearch;

public class binarysearch {
    public static void main(String[] args) {
     // split array largest sum :
        int[] arr = {7,2,5,8,10 };
        int [] arr2 = {10,9,8,7,6,5,4,3,2,1};
        int target = 9 ;
        int m = 2 ;
        System.out.println( binarysearchf(arr2 , target));
       // System.out.println(largestsum(arr , m ));
    }
    static int largestsum(int[] arr , int m){
        int start = 0 ;
        int end = 0 ;
        for(int i : arr){
            start = Math.max(start , i);
            end  += i;
        }
        while(start < end){
            int mid = start + (end - start)/2 ;
            int sum = 0 ;
            int pieces = 1 ;
            for(int nums : arr){
            if(sum + nums > mid) {
                sum = nums ;
                pieces++;
            }
            else {
                sum += nums ;
            }
            }
            if(pieces > m){
                start = mid  + 1 ;
            }
            else {
                end = mid ;
            }
        }
        return end ;
    }
// BINARY SEARCH
   static int binarysearchf(int[] ar2 , int target) {
        int start = 0 ;
         int end = ar2.length-1;
         while(start<=end){
             int mid = start + (end-start)/2;
             if(target > ar2[mid]){
                 end = mid - 1 ;
             }
             else if (target < ar2[mid]){
                 start= mid+ 1;
             }
             else
                 return mid;
         }
         return -1;
   }
}

    //Order Agnostic Binary Search :

//    int [] arr = {10,9,8,7,6,5,4,3,2,1};
//    int target  = 10 ;
//        System.out.println(OrderAgnostic(arr,target));
//                }
//static int OrderAgnostic(int[]arr , int target){
//        int start = 0;
//        int end = arr.length-1;
//        boolean Order = arr[start] < arr[end];
//        while(start <= end){
//        int mid = start + (end - start)/2;
//        if(arr[mid] == target){
//        return mid ;
//        }
//        if(Order){
//        if(target < arr[mid]){
//        end = mid - 1;
//        }
//        else{
//        start = mid +1;
//        }
//        }
//        else{
//        if(target < arr[mid] ){
//        start = mid +1;
//        }
//        else{
//        end = mid -1;
//        }
//        }
//        }
//        return - 1;
//        }




    //CEILING OF  A NUMBER : find the smallest element greater or = to target :
//    int[] arr = {1,2,3,4,5,7,8,9,10,11};
//    int target = 6;
//    int ans = Ceiling(arr,target);
//        System.out.println(ans);
//                }
//static int Ceiling(int[] array , int target ){
//        int start = 0 ;
//        int  end = array.length-1 ;
//        while (start <= end){
//        int mid = start + (end-start)/2;
//        if(target < array[mid])
//        end = mid -1;
//        if(target > array[mid])
//        start = mid + 1;
//        else{
//        return array[mid] ;
//        }
//      return array[start] ;
//    }
//  }



    //FlOOR OF  A NUMBER : find the greatest element smaller or = to target :
//    int[] arr = {1,2,3,4,5,7,8,9,10,11};
//    int target = 6;
//        System.out.println(Floor(arr,target));
//                }
//static int Floor(int[] array , int target ){
//        int start = 0 ;
//        int  end = array.length-1 ;
//        while (start <= end){
//        int mid = start + (end-start)/2;
//        if(target < array[mid]) {
//        end = mid - 1;
//        } else if (target > array[mid]) {
//        start = mid  + 1;
//        } else {
//        return array[mid];
//        }
//        }
//        return array[end] ;



    //finding element in an infinite array ;
    // we cannot use arr.length :
//    int[] arr = {3,7,5,9,10,90,100,130,140,160,170};
//    int target = 10;
//        System.out.println(ans(arr , target));
//}
//    static int ans(int[] arr, int target) {
//        int start = 0;
//        int end = 1;
//        while (target > arr[end]) {
//            int temp = end + 1;
//            end = end + ((end - start) * 2 )+ 1;
//            start = temp;
//        }
//        return binarysearchf (  arr,  target, start, end);
//    }
//    static int binarysearchf ( int[] ar2, int target, int start, int end){
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (target < ar2[mid]) {
//                end = mid - 1;
//            } else if (target > ar2[mid]) {
//                start = mid + 1;
//            } else
//                return mid;
//        }
//        return -1;
//    }


        //find target in a mountain array :
//        int[] arr = {1,2,3,4,5,3,1};
//        int target = 5 ;
//        System.out.println(ans(arr , target));
//    }
//    static int ans(int[] arr , int target ){
//        int peak = peakofanarray(arr);
//        int onepart = OrderAgnostic(arr , target , 0 , peak);
//        if(onepart != -1){
//            return onepart ;
//        }
//        return OrderAgnostic(arr , target , peak+1, arr.length -1);
//    }
//    static int peakofanarray(int [] arr ){
//        int  start = 0 ;
//        int end = arr.length - 1;
//        while(start < end){
//            int mid = (start + end) / 2 ;
//            if(arr[mid] > arr[mid + 1]) {
//                end = mid ; }
//            else {
//                start = mid + 1 ; }
//        }
//        return start ;
//    }
//    static int OrderAgnostic(int[]arr , int target , int start , int end){
//        boolean Order = arr[start] < arr[end];
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(arr[mid] == target){
//                return mid ;
//            }
//            if(Order){
//                if(target < arr[mid]){
//                    end = mid - 1;
//                }
//                else{
//                    start = mid +1;
//                }
//            }
//            else{
//                if(target < arr[mid] ){
//                    start = mid +1;
//                }
//                else{
//                    end = mid -1;
//                }
//            }
//        }
//        return - 1;
//    }
//}




    //find element in a rotated sorted array with distinct values :
//    int [] arr  = { 6,7,1,2,3,4,5} ;
//    int target = 6 ;
//        System.out.println(findtarget(arr, target ));
//}
//    static int findtarget( int[] nums , int target ){
//        int pivotis = pivot(nums);
//        if(pivotis == -1){
//            return binarysearchf(nums , target  , 0 , nums.length - 1);
//        }
//        if( nums[pivotis] == target ){
//            return pivotis ;
//        }
//        if(nums[0] == target){
//            return 0 ;
//        }
//        if(nums[0] < target ) {
//            return binarysearchf( nums , target , 0 , pivotis - 1  );
//        }
//
//        return binarysearchf(nums ,target , pivotis + 1 , nums.length - 1 );
//    }
//
//    static int binarysearchf(int[] ar2 , int target , int start , int end ) {
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(target < ar2[mid]){
//                end = mid - 1 ;
//            }
//            else if (target > ar2[mid]){
//                start= mid+ 1;
//            }
//            else
//                return mid;
//        }
//        return -1;
//    }
//
//
//
//    static int pivot(int[] array  ){
//        int start = 0 ;
//        int end = array.length -1 ;
//        while(start <= end) {
//            int mid = start + (end - start ) / 2 ;
//            //4 cases to find pivot
//            if( mid < end && array[mid ] > array[mid + 1]){
//                return mid ;
//            }
//
//            if( mid > start && array[mid] < array[mid - 1] ){
//                return mid - 1;
//            }
//            if(array[mid] <= start){
//                end = mid - 1;
//            }
//            else {
//                start = mid + 1 ;
//            }
//
//        }
//        return - 1 ;
//
//    }

    //no of rotations in a rotated array :
//    int[] arr = {4,5,6,7,0,1,2,3};
//        System.out.println(noofrot(arr));
//}
//
//    static int noofrot(int[] arr){
//        int pivotisat = findpivot(arr);
//        return pivotisat + 1 ;
//    }
//    static int findpivot(int[] arr){
//        int start = 0 ;
//        int end = arr.length- 1 ;
//        while(start <= end){
//            int mid = (start + end) / 2 ;
//            if( mid < end && arr[mid] > arr[mid + 1]){
//                return mid ;
//            }
//            if(mid > start && arr[mid]  < arr[mid -1]){
//                return mid-1 ;
//            }
//            if(arr[start] >= arr[mid]){
//                end = mid -1 ;
//            }
//            else {
//                start = mid + 1 ; }
//
//        }
//        return - 1;
//    }