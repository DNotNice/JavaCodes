package com.company.Extrass;

import java.util.Scanner;

public class cses_all {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int x= 0,max=0;
        int min = k;
        int [] ar1 = new int[n];
        int [] ar2 = new int[n];
        for(int i = 0 ;i<n;i++){
            ar1[i] = sc.nextInt();
        }
        for(int i = 0 ;i<n;i++){
            ar2[i]=sc.nextInt();
            max=max+ar2[i];
        }
        while (x!=n) {
            for (int i = 0; i < n; i++) {
                if (min >= ar1[i]) {
                    int m = i;
                    min = min + ar2[m];
                    ar1[i] = max+1;
                }
            }
            x++;
        }
        System.out.println(min);
    }
}


//CSES-1;
//        long n = sc.nextInt();
//        System.out.print(n+" ");
//        while(n!=1){
//            if(n%2==0){
//                n=n/2;
//                System.out.print(n+" ");
//            }
//            else {
//                n=(n*3)+1;
//                System.out.print(n+" ");
//            }
//        }

// Cses 2;
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextInt();
//        int m = (int) n;
//        long x=0,y=0;
//        long[] ar = new long[m-1];
//        for(int i =0;i<m-1;i++){
//             ar[i]=sc.nextInt();
//             x+=ar[i];
//        }
//        y=(n*(n+1))/2;
//        long z = y - x;
//        System.out.print(z);
