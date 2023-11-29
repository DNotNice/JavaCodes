package com.company.basics;

import java.util.Scanner;

public class inputting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String myStr = input.next();
        float Mystr = input.nextFloat();
        System.out.println(a);
        System.out.println(myStr);
        System.out.println(Mystr);

        input.close();


    }
}
