package com.company.basics;

public class searching {
    public static void main(String[] args) {
        int[] arr = {23,12,34,53,66,86,87,23,22,11};
        int n = 86;
        boolean ans = linearSearch3(arr,n);
        System.out.println(ans);

//        //FOR A STRING :
//        String srr = "DEVANSH";
//        char target = 'p';
//        System.out.println(SearcinString(srr, target));



    }


    //to search for a character in a String :
    static boolean SearcinString(String asr , char target){
        if(asr.length()==0)
        return false;
        for(char value : asr.toCharArray()){
            if(value == target)
                return true ;
        }
        return false;
    }
    //to search the element and print the index :
    static int  linearSearch(int[]arr , int target){
        if(arr.length == 0)
            return -1 ;
        for(int i = 0 ; i<arr.length;i++){
            int element = arr[i] ;
            if(target == element)
                return i ;
        }
        return Integer.MIN_VALUE;
    }
    //to search the element and print the value of the target if its exists in the array:
    static int  linearSearch2(int[]arr , int target){
        if(arr.length == 0)
            return -1 ;
        for(int element : arr){
            if(target == element)
                return target ;
        }
        return Integer.MAX_VALUE;
    }
    //to search for the element in the array and return true/false :
    static boolean linearSearch3(int[] num , int target){
        if(num.length==0)
            return  false ;
        for(int element : num){
            if(element == target)
                return true ;}
        return false ;
    }
}
