package com.company.slidingWindow;

import java.util.HashMap;

public class LongestSubarrayWithKUniqueChars {
    public static void main(String[] args) {
        String a = "aabacbebebe";
        int k = 3 , start = 0  , end = 0 , ans = 0 ;
        HashMap<Character , Integer> hmap = new HashMap<>();
        while(end < a.length()){
            char temp = a.charAt(end);
            hmap.put(temp, hmap.getOrDefault(temp,0)+1);
            if(hmap.size() > k){
                while(hmap.size() > k){
                    char c = a.charAt(start++);
                    hmap.put(c , hmap.get(c)-1);
                    if(hmap.get(c) ==0) hmap.remove(c);
                }
            }
            if(hmap.size() == k ){
                ans = Math.max(ans, end-start+1);
            }
            end++;

        }
        System.out.println(ans);
    }
}
