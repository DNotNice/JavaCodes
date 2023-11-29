package com.company.basics;

import java.util.Scanner;

public class loop_questions {
    public static void main(String[] args) {
   int usu = 0 ;
   for(int i = 1 ; i <= 5; i++) usu+=i;
        System.out.println(usu);
    }


    }




//        Benjamin Bulbs :
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i*i<=n;i++){
//            System.out.print(i*i+" ");
//        }


//        program to take 3 inputs from user and check whether it forms pythagorean triplet or not :
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int max =Math.max(a,Math.max(b,c));
//        boolean sta;
//        if(max==a){
//             sta=((b*b+c*c)==(a*a));
//            System.out.println(sta);
//        }
//       else if(max==b){
//            sta=((a*a+c*c)==(b*b));
//            System.out.println(sta);
//        }
//        else {
//            sta=((a*a+b*b)==(c*c));
//            System.out.println(sta);
//        }



//        program to print prime factorisation of a number:
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=2;i*i<=n;i++){
//            while(n%i==0){
//                System.out.print(i+" ");
//                n=n/i;
//
//            }
//        }
//        if(n!=1){
//            System.out.println(n);
//        }


// program to find GCD and LCM of two numbers:
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int n1=a;
//    int n2=b;
//    while(a%b!=0){
//        int r = a%b;
//        a=b;
//        b=r;
//    }
//    int gcd = b;
//    int lcm = (n1*n2)/gcd;
//        System.out.println( gcd);
//        System.out.println( lcm );



//        program to print reverse of a number :
//        int a = sc.nextInt();
//        int rot = sc.nextInt();
//        int p=a;
//        int d=1,count=0,c=1;
//        while(p!=0){
//            b = p%10;
//            count++;
//            p=p/10;
//        }
//        rot=rot%count;
//        if(rot<0){
//            rot=rot+count;
//        }
//        for(int i =1;i<=count;i++){
//            if(i<=rot){
//                d=(int)(Math.pow(10,i));
//            }
//            else{
//                c=(int)(Math.pow(10,i-rot));
//            }
//        }
//            int e = a%d;
//            e=e*c;
//            int s = a/d;
//            e=e+s;
//        System.out.print(e);



//        Reverse a number(0 should not be there)
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int k=sc.nextInt();
//        double l=(double)k;
//        int count=0,p=a,g,m,t,z;
//        while(p!=0) {
//            int c = p%10;
//            count++;
//            p=p/10;
//        }
//        if(k>=1&&k<=count) {
//            m = (int) (a % Math.pow(10, l));
//            z = (int) (a / Math.pow(10, l));
//            int e = (int) (m * Math.pow(10, count - k));
//            t = e + z;
//            System.out.print(t);
//        }
//        else if(k>count)
//        {
//            int q = k-count;
//            m = (int) (a % Math.pow(10, q));
//            z = (int) (a / Math.pow(10, q));
//            int e = (int) (m * Math.pow(10, count - q));
//            t = e + z;
//            System.out.print(t);
//        }
//        else if(k<0){
//            int v=k+count;
//            m = (int) (a % Math.pow(10, v));
//            z = (int) (a / Math.pow(10, v));
//            int e = (int) (m * Math.pow(10, count - v));
//            t = e + z;
//            System.out.print(t);
//        }


//program to print inverse of a number :
//        Scanner sc=new Scanner (System.in);
//        int a = sc.nextInt();
//        int p = a;
//        int d;
//        double i=1,n=0;
//        while(a!=0) {
//                    int c = a%10;
//                    a=a/10;
//               if(c>=1){
//
//                n=n+i*Math.pow(10,c-1);
//                i++;
//               }
//
//            }
//         int s = (int) n;
//
//        System.out.println(s+" is the inverse of "+p);


//        Program to print digits of a number left to right
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int d=a;
//        int b,count=0;
//        while(a!=0) {
//            b = a%10;
//            count++;
//            a=a/10;
//        }
//        int div=(int)(Math.pow(10,count-1));
//        while(d!=0) {
//            int c =d/div;
//            System.out.println(c);
//            d=d%div;
//            div=div/10;
//        }


//        Total digits in a number:
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b,count=0;
//     while(a!=0)
//     {
//         b = a%10;
//         count++;
//         a=a/10;
//     }
//        System.out.println("Total digits in the entered number is : "+count);
//


//    Power in java:
//    Scanner  sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int m= sc.nextInt();
//        System.out.println(n+" raised to the power "+m+" is : "+Math.pow(n,m));


//program to take average of n numbers entered by user:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the total number of terms :");
//        int n = sc.nextInt();
//        int re=0;
//        System.out.print("enter "+n+" terms:");
//        for(int i=1;i<=n;i++){
//            int m = sc.nextInt();
//             re = re + m ;
//        }
//        re = re/n;
//        System.out.println("the average is : "+ re);

// program to print factorial of a number :
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number you want to find the factorial : ");
//        int a=sc.nextInt();
//        int fact = 1;
//
//        for(int i = a;i>=1;i--) {
//            fact = fact * i ;
//        }
//        System.out.println("The factorial of the number is : "+fact);


//program to print difference of prod and sum of a number :
//       Scanner sp = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int n = sp.nextInt();
//       int a = n;
//       int prod=1,c,b,sum=0;
//       while(n!=0)
//       {
//           c=n%10;
//           prod=prod*c;
//           n=n/10;
//       }
//       while(a!=0)
//       {
//            b=a%10;
//            sum=sum+b;
//            a=a/10;
//       }
//        System.out.println("THE DIFFERENCE IS : "+(prod-sum));


        //program to print all prime numbers till N;
//        Scanner sd = new Scanner(System.in);
//        int a = sd.nextInt();
//        int b = sd.nextInt();
//
//        for(int i = a ; i<=b ; i++) {
//            int count=0;
//            for(int m=2;m*m<=i;m++) {
//                if(i%m==0) {
//                   count++;
//                   break;
//                           }
//                }
//                if(count==0) {
//                System.out.print(i+" ");
//              }
//           }



//program to check whether the number is prime or not :
//      Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number you want to check it is prime or not : ");
//        int a = sc.nextInt();
//        int i = 2;
//        int count = 0;
//
//        while(i<a)
//        {
//          if(a%i==0)
//          {
//              count++;
//          }
//          i++;
//        }
//        if(count==0)
//        {
//            System.out.println(a+" is a prime number ");
//        }
//        else
//        {
//            System.out.println("sorry it is not a prime number ");
//        }

