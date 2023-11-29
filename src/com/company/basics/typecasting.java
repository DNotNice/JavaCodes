package com.company.basics;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        byte d = (byte) c;
        System.out.println(d);
        float a = sc.nextFloat();
        int b = (int) a;
        System.out.println(b);
        double s = (4*1.2) - (234+2) ;
        System.out.println(s);

    }
}
