package com.company.slidingWindow;

import java.util.HashMap;

public class distinctCharactersInWindowOfSizeThree {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int i= 0 , j = 0 ,count = 0;
        HashMap<Character , Integer > hmap = new HashMap<>();
        while(j < s.length()){
             hmap.put(s.charAt(j), hmap.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1 == 3){
                if(hmap.size()==3) count++;
                if(hmap.get(s.charAt(i)) >1)hmap.put(s.charAt(i), hmap.get(s.charAt(i))-1);
                else hmap.remove(s.charAt(i));
                i++;
            }
            j++;
        }
        System.out.println(count);
    }
}
