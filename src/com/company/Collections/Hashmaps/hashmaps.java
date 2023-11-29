package com.company.Collections.Hashmaps;


import java.util.*;

public class hashmaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while(t -- > 0) {
            int n = sc.nextInt();
                HashMap<Integer, Integer> hs1 = new HashMap<Integer, Integer>();
            int[] asar = new int[n];
            for(int i = 0  ; i < n ; i++ ){
                asar[i] = sc.nextInt();
            }
            for (int i = 0; i < asar.length; i++) {
                if (hs1.containsKey(asar[i])) {
                    hs1.put(asar[i], hs1.get(asar[i]) + 1);
                } else
                    hs1.put(asar[i], 1);
            }
            int max = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> e : hs1.entrySet()) {

                int s = (e.getKey() + e.getValue() - 1);
                max = Math.max(max, s);
            }
            System.out.println(max);
        }
    }
}
