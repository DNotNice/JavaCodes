package com.company.basics;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);



    }
    static void pattern13(int n){
        for(int i = 1 ; i <= n ; i++){
            int spaces = (i<n) ? n - i : 0 ;
            for(int z = 0 ; z < spaces ; z++){
                System.out.print(" ");
            }
            int col = 0 ;

        }
    }
    static void pattern12 ( int n){
        for(int i = 1 ; i <= 2*n ; i++){
            int spaces = (i > n) ? 2*n - i : i- 1;
            for(int z = 0 ; z<spaces ; z++){
                System.out.print(" ");
            }
            int col =  (i > n) ? i-n : n+1-i ;
            for(int j = 0 ; j<col ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for(int i = 1 ; i <=n ;i++){
            int stars = n - i + 1;
            int spaces = i-1;
            for(int z = 1 ; z <= i ; z++){
                System.out.print(" ");
            }
            for(int j = stars; j>= 1 ;j-- ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int i = 0 ; i<n ; i++){
            int spaces = n - i +1 ;
            for(int z = 0 ; z<spaces ; z++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int i = 0 ; i< n ;i++){
            int star = 2*(n-i) - 1 ;
            for(int z = 0 ; z<i ; z++){
                System.out.print(" ");
            }
            for(int j = star ; j>= 1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n ){
        for(int i = 0 ; i<n ; i++){
          int spaces = n - i ;
          int star = 2*i+1;  ;
          for(int z = 1 ; z<= spaces ; z++){
              System.out.print(" ");
          }
          for(int j = 1 ; j<= star ;j++){
              System.out.print("*");
          }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        int m  = n;
        for (int i = 1; i <= n; i++) {
            for (int z = 1; z < i; z++) {
                System.out.print(" ");
            }
                for (int j = m; j >= 1; j--) {
                    System.out.print("*");

                }
                m--;
                System.out.println();
        }
    }


    static void pattern6(int n){
        for(int i = 1 ; i<= n ; i++){
            int spaces = n - i ;
            for(int z = 1 ; z<= spaces ; z++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern5(int n){
        for(int i = 1 ; i< 2*n ; i++){
            int col = i > n ? 2*n-i : i;
            for(int j = 1; j <= col ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void pattern4 ( int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void pattern2 (int n){
        for (int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

    static void pattern1(int n){
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }


    }

