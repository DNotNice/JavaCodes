package com.company.Extrass;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        System.out.println(lcm(4,8));
    }
    static int lcm(int a , int b){
        return (a*b / gcd(a,b));
    }


  //Eculidean Algorithm
    static int gcd(int a , int b){
        if(a== 0) {
            return b ; }
        return gcd(b%a , a);
    }



    //here both time and complexity will change
    static void factorop2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i*i <= n ; i ++){
            if(n%i == 0) {
                if(n/i == i){
                    System.out.print(i+" "); }
                else{
                    System.out.print(i + " " );
                   list.add(n/i); }
            }
        }

        for(int i = list.size() - 1 ; i >= 0 ; i --)
            System.out.print(list.get(i)+ " ");
    }


    //only time complexity will change
    static void factorop(int n){
        for(int i = 1; i*i <= n ; i ++){
            if(n%i == 0) {
                 if(n/i == i)
                     System.out.print(i);
                 else
                System.out.print(i + " " + n / i + " ");
            }
        }
    }

    static void factor(int n){
        for(int i = 1; i <= n ; i ++){
            if(n%i == 0)
                System.out.print(i+" ");
        }
    }
}
