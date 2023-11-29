package com.company.BinarySearch;

import java.util.Arrays;

public class BinSear2D {
    public static void main(String[] args){
        int[][] arr= {  {1, 2, 3, 4},
                        {5 ,6 ,7 ,8},
                        {9,10,11,12},
                       {13,14,15,16}
                     };
        int[] ss = sortedmat(arr, 6);
        int[] mig = {-1,-1};
        System.out.println(mig.equals(ss));
//        System.out.println(Arrays.toString(sortedmat(arr,6)));

    }
    // search in the row provided between the columns provided ;
    static int[] binsearc(int[][] arr , int row , int colS , int colE , int target){
        while(colS <= colE){
            int mid = colS + (colE - colS)/2;
            if(target < arr[row][mid] ){
                colE = mid - 1;
            }
            else if (target > arr[row][mid]){
                colS = mid + 1 ;
            }
            else {
                return new int[]{row ,mid};
            }
        }
        return new int[]{-1,-1};
    }


    static int[] sortedmat(int[][] arr , int target){
        int row = arr.length ;
        int col = arr[0].length ; // be cautious , matrix may be empty ;
      if(row == 1 ){
          return binsearc(arr,0,0,col -1 ,target);
      }
      int rowStart = 0 ;
       int rowEnd = row - 1;
       int colMid = (col-1)/2;
       while(rowStart < (rowEnd - 1)){
           int mid = rowStart + (rowEnd - rowStart) / 2;
           if(arr[mid][colMid] == target ){
               return new int[]{mid , colMid};
           }
           if(arr[mid][colMid] < target){
               rowStart =mid; ;
           }
           if(arr[mid][mid] > target){
               rowEnd=mid;
           }
       }
       // now we have two rows ;
        //check whether the target is in middle colums of two rows :
        if(arr[rowStart][colMid] == target ){
            return new int[]{rowStart , colMid};
        }
        if(arr[rowStart + 1][colMid] == target ){
            return new int[]{rowStart + 1 , colMid};
        }
        // search in first half , second half , third half and fourth half ;
        // for first half :
        if(arr[rowStart][colMid-1] >= target ){
            return binsearc(arr,rowStart,0,colMid-1,target);
        }
        //for second half;
        if(arr[rowStart ][colMid + 1] <= target && target <= arr[rowStart][col - 1 ] ){
            return binsearc(arr,rowStart ,colMid+1 , col-1,target);
        }
        //for third half :
        if( target >= arr[rowStart + 1][colMid - 1]  ){
            return binsearc(arr , rowStart+1 ,0,colMid-1,target);
        }
        else{
            return binsearc(arr, rowStart+1 ,colMid+1 ,col -1 , target);
        }
    }

}

//    //Row Column Matrix :
//    int[][] arr = {
//            {10 , 20 ,30 ,40},
//            {15 , 25 ,35 ,45},
//            {28 , 29 ,37 ,49},
//            {35 , 34 ,38 ,50}
//    };
//        System.out.println(Arrays.toString(binary2D(arr,37)));
//
//}
//    static int[] binary2D(int[][] arr , int target){
//        int row =  0;
//        int col = arr.length-1 ;
//        while(row < arr.length && col >= 0 ) {
//            if (target == arr[row][col] ){
//                return new int[]{row , col};
//            }
//            else if(arr[row][col] < target){
//                row++;
//            }
//            else
//                col--;
//        }
//        return new int[]{-1,-1};
//    }
