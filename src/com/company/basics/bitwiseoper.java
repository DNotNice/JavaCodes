package com.company.basics;

import java.util.Scanner;

public class bitwiseoper {
    public static void main(String[] args) {
       // System.out.println(isEven(28));
        Scanner sc = new Scanner(System.in);
        //range xor for a , b ;
        int a = sc.nextInt();
        int b  = sc.nextInt();
        System.out.println(findxor(a - 1) ^ findxor(b));
        //int n = sc.nextInt();
   //     System.out.println(Integer.toBinaryString(n));
        //   int base = sc.nextInt();
        //  int power = sc.nextInt();
        //System.out.println(noofsetbits2(n));
      //  System.out.println(noofsetbits(n));
        //System.out.println(findvalue(base , power));
       // int n = sc.nextInt();
       //    System.out.println(powerof2(n)); Note : 0 gives true :
       // System.out.println(noofDig2(n));
      // System.out.println(imagicnumber(n));
    }
     static int findxor(int a) {
        // this is only for check , will give TLE for large numbers
//         int ans = 0 ;
//         for(int i = a ; i < = b ; i++){
//             ans ^= i ;
//         }
        if(a%4 == 0)
            return  a ;
        if(a%4 == 1)
            return 1;
        if(a%4 == 2)
            return a+1;

            return 0;
     }
    static int noofsetbits2(int n){
        int count = 0 ;
//        while (n > 0){
//            count++;
//            n -= (n&-n);
//        }
        while(n > 0){
            count++;
            n = n & (n-1);
        }
      return count;
    }
    static int noofsetbits(int n){
        int count = 0;
        while(n > 0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
            return count ;
    }
    static int findvalue(int base , int power ){
          int ans = 1 ;
        while(power > 0){
            if((power&1) == 1){
                ans *=  base ;

            }
            base = base * base ;
            power= power>>1;
        }
        return ans ;

    }
    static boolean powerof2(int n ){

      return (n & (n-1)) == 0;

    }
    static int noofDig2(int n){
        Scanner sc = new Scanner(System.in) ;
        int b = sc.nextInt();
        int m = (int)(Math.log(n)/Math.log(b)) + 1;
        return m  ;
    }
    static int noofDig(int n){
        int dig = 0 ;
        while(n>0){
            dig += 1 ;
            n =n>>1 ;

        }
        return dig;
    }
    static boolean isEven(int n){
        return(n & 1) == 1 ;
    }
    static int imagicnumber(int n){
        int base = 5 ;
        int sum  = 0 ;
        while (n >0){
           int d = n&1 ;
           sum += d* base ;
           n =  n >> 1 ;
           base = base * 5 ;
        }
        return sum ;
    }


}
