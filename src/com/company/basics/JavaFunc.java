package com.company.basics;

import com.sun.source.tree.ReturnTree;

import java.util.Arrays;
import java.util.Scanner;

public class JavaFunc {
    public static void main(String[] args) {

    }
}




//Write a function that returns the sum of first n natural numbers.
//  Scanner sc = new Scanner(System.in);
//  int a = sc.nextInt();
//        sum(a);
//    }
//    static void sum(int n){
//        System.out.println("Sum of natural numbers till "+n+" is : "+n*(n+1)/2);
//    }



// method to find prime numbers between two numbers :
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        Prime(a,b);
//    }
//    static void Prime(int x,int y){
//
//        for(int i = x ; i<=y;i++){
//            int count=0;
//            for(int k = 2 ;k*k<=i;k++){
//                if(i%k==0){
//                    count+=1 ;
//                }
//            }
//            if(count==0){
//            System.out.print(i+" ");
//            }
//        }
//    }



//        program to check whether the entered number is palindrome or not :
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        pal(a);
//    }
//    static void pal(int n){
//        int z,l=1,countm = 0;
//        z= n;
//        int count = 0;
//        while(n!=0){
//            int a = n%10;
//            count += 1;
//            n=n/10;
//        }
//        int tot = count/2;
//        for(int i =1;i<=tot;i++){
//            int j = 10;
//            int k = (int) Math.pow(10,count-l);
//            int p = z%j;
//            int q = z/k;
//            if(p==q){
//                 countm = countm + 1;
//            }
//            z=z%k;
//            z=z/10;
//            l=l+2;
//        }
//        if(countm == tot){
//            System.out.println("THE ENTERED NUMBER IS A PALINDROME ");
//        }
//        else{
//            System.out.println("THE ENTERED NUMBER IS NOT A PALINDROME ");
//        }


//program to printf grade of the student :
//            case 1:
//            case 0:
//        Scanner sc = new Scanner (System.in);
//        System.out.print("ENTER MARKS OUT OF : ");
//        int n = sc.nextInt();
//        result(n);
//    }
//    static void result(int a){
//        a=a/10;
//        switch (a){
//            case 10:
//            case 9:
//                System.out.println("AA");
//                break;
//            case 8:
//                System.out.println("AB");
//                break;
//            case 7:
//                System.out.println("BB");
//                break;
//            case 6:
//                System.out.println("BC");
//                break;
//            case 5:
//                System.out.println("CD");
//                break;
//            case 4:
//                System.out.println("DD");
//                break;
//            case 3:
//            case 2:
//                System.out.println("Fail");
//                break;
//            default:
//                System.out.println("MARKS INVALID");
//        }
//    }



//Method of fibonacci series till n :
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//          fibo(a);
//
//    }
//    static void  fibo(int n){
//        int d = 0,b=1,c=0;
//        System.out.print(d+" "+b+" ");
//            for (int i = 3; i <= n; i++) {
//
//                c = d + b;
//                System.out.print(c + " ");
//                d = b;
//                b = c;
//            }
//    }


//program to check whether a number is armstrong or not :
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        boolean ans = Armstrong(a);
//        System.out.println(ans);
//        }
//        static boolean Armstrong(int a){
//        int original = a;
//        int sum = 0;
//        while(a>0){
//            int c = a%10;
//            sum = sum+c*c*c;
//            a=a/10;
//        }
//        return original == sum;
//        }



//program to check whether a number is prime or not using functions :
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        boolean ans = prime(a);
//        System.out.println(ans);
//    }
//    static boolean prime(int a) {
//
//        if (a <= 1) {
//            return false;
//        }
//        int c = 2;
//        while (c * c <= a) {
//            if (a % c  == 0) {
//                return false;
//            }
//            c++;
//        }
//        if(c*c>a){
//            return  true ;
//        }
//        return false ;
//    }



//        // memory overloader
//        fun(4,5);
//    }
//    static void fun(int a){
//        System.out.println(a);
//    }
//    static  void fun(int a , int b ){
//        System.out.println(a+b);
//    }


//shadowing in java :
//    static int a = 0;
//
//    public static void main(String[] args) {
//        test(1);
//        System.out.println(a);
//        int a = 3;
//        System.out.println(a);// here a = 3 shadows global value of a  inside  main :
//        test2(2);
//        System.out.println(a);
//        test3(); // since now the global value of a is 2 , it will print 2
//
//    }
//
//    static void test(int a) {
//        System.out.println(a);
//    }
//
//    static void test2(int b) {
//        a = b; // here the value of global a changes from 0 to 2 ; so after that a becomes 2 globally
//        System.out.println(b);
//    }
//    static void test3(){
//        System.out.println(a);
//    }






//        int[] arr = {1, 2, 3, 4, 45, 6};
//        change(arr);
//        System.out.print(Arrays.toString(arr));
//    }
//
//    static void change(int[] num) {
//    num [4] = 5;
//    }



//  IN this value of originial arr will change
//        int[] arr={1,2,3,45,6};
//         change(arr);
//        System.out.println(Arrays.toString(arr));
//            }
//            static void change(int[] num){
//               num[3]=4; if you make a change in the object via this ref variable, same obj will be changed .
//        }



        //In this function value of string will not change
//        String a = "DEVANSH";
//        stringch(a);
//        System.out.print(a);
//    }
//    static void stringch(String a){
//         a = "ANKUR";
//    }




//       In this function value of a and b will not be changed
//        int a =10;
//      int b =20;
//      swap(a,b);
//        System.out.print(a+" "+b);
//    }
//        static void swap(int a,int b) {
//        int temp = a;
//        a=b;
//        b=a;
//        }



//        Scanner sc = new Scanner(System.in);
//        String naam = sc.next();
//        String mess = str3(naam);
//        System.out.print(mess);
//    }
//    static String str3(String name ){
//        String message = "HEllo " + name ;
//        return message;
//    }

//        Scanner sc = new Scanner ( System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int ans = sum4(a,b);
//        System.out.println("Sum is : "+ans);
//    }
//    static int sum4(int b,int c){
//        int sum = b+c;
//        return sum;
//    }


//        String ans = S4("Devansh" );
//        System.out.print(ans);
//    }
//    static String S4(String name){
//        String mess = "Hello "+name;
//        return mess;
//    }



//        int ans = sum3(10,15);
//        System.out.print(ans);
//    }
//    static int sum3(int a,int b){
//        int sum = a+b;
//        return sum;
//    }



//        String welc = welcome();
//        System.out.print(welc);
//    }
//    static String welcome(){
//        String greet = "Hi ! Welcome to Java Functions";
//        return greet;
//    }



//        int ans = sum2();
//        System.out.print(ans);
//    }
//    static int sum2(){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = a+b;
//        System.out.print("The Sum is : ");
//        return  c ;
//    }


//    static void sum(){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = a +b ;
//        System.out.println("THE SUM IS : "+c);
//    }