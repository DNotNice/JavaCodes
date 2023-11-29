//package com.company.Extrass.CesesProb;

import java.util.HashMap;
import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 1)System.out.print(1);
        else  if(n==4) System.out.print("3 1 4 2");
        else if(n  < 4 ) System.out.print("NO SOLUTION");
        else{
            for(long i = 1; i<=n ;i+=2) System.out.print(i+" ");
            for(long i = 2; i <=n ;i+=2) System.out.print(i+" ");
        }
            System.out.println();
        }
    }

