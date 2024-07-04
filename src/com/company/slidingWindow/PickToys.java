package com.company.slidingWindow;
/*
 John is at a toy store help him pick maximum number of toys.
 He can only select in a continuous manner and  can select only
 two types of toys.
*/

import java.util.HashMap;

public class PickToys {
    public static void main(String[] args) {
        String a = "abaccab";
        int start = 0  , end = 0 , ans = 0 ;
        HashMap<Character ,Integer> hmap = new HashMap<>();
        while(end < a.length()){
            char temp = a.charAt(end);
            hmap.put(temp , hmap.getOrDefault(temp,0)+1);
            if(hmap.size() > 2){
                while(hmap.size() > 2){
                    hmap.put(a.charAt(start),hmap.get(a.charAt(start))-1);
                    if(hmap.get(a.charAt(start))==0) hmap.remove(a.charAt(start++));
                }
            }
            ans = Math.max(ans , hmap.size());
            end++;
        }
        System.out.println(ans);
    }
}
