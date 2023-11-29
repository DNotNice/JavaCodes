package com.company.basics;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        int a =0;
        int b=1;
        int c;
        System.out.print("Enter the range till where you want to find the FIBONACCI series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c = a+b;
        System.out.print("THE FIBONACCI SERIES IS : ");
        if(n==1)
        {
            System.out.println(0);
        }
        else if(n==2)
        {
            System.out.print(0+" "+1);


        }
        else {
            System.out.print(0+" "+1);

            for (int i = 3; i <= n; i++) {

                c = a + b;
                System.out.print(" "+c+" ");


                a = b;
                b = c;

            }
        }


    }
}
