package com.company.basics;

import java.util.Scanner;

public class mathsforDsa {
    public static void main(String[] args) {
        //finding square root of a perfect square number ;
        //System.out.println(squareroot(36));

        // find square root of any number
        int n = 10 ;
        int  p = 3 ; // find upto 3 precision points;
        System.out.printf("%.3f \n",sqroot(n,p));
        System.out.printf("%.3f",nrm(10));

    }
    //newton rhapson method ;
    static double nrm(double n){
        double x = n ;
        double root ;
        while(true){
            root = (x+ n/x)/2 ;
            if(Math.abs(root - x) < 0.5){ // lower the condition , more steps will be taken ;
                break;
            }
            x  = root ;
        }
        return root ;
    }




    // time complexity = log(n);
    static double sqroot( int n , int p){
        int start = 0 ;
        int end = n ;
        double  root= 0.0;
        while(start <= end){
            int mid = (start + end) / 2;
            if(mid * mid == n)
                return mid ;
            if(mid*mid > n)
                end = mid -1  ;
            else{
                start  = mid + 1;}
            root = end ;

        }

        double inc = 0.1 ;
        for(int i = 0 ; i < p ; i++ ){
            while(root * root <= n){
                root += inc;

            }
            root-=inc;
            inc/=10;
        }

        return root ;
    }



    static int squareroot(int n){
        int start = 0 ;
        int end = n ;
        while(start <= end){
            int mid = (start + end) / 2 ;
            if(mid * mid > n)
                end  = mid -1;
            else if ( mid * mid == n ){
                return mid ;
            }
            else
                start = mid+ 1;
        }
        return -1;
    }


    //Sieve of eratosthenes
//        int n = 40 ;
//        boolean[] arr = new boolean[n+1];
//        sieve(n,arr);
//        }
//        static void sieve(int n , boolean[] arr){
//         for(int i = 2 ; i * i <= n  ; i++){
//             if(!arr[i]){
//                 for(int j = 2* i ; j <= n ; j+=i){
//                     arr[j] = true ;
//                 }
//             }
//         }
//         for(int i = 2 ; i <= n ; i++){
//             if(!arr[i]){
//                 System.out.print(i+" ");
//             }
//         }
//        }


}
