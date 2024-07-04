package com.company.slidingWindow;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3 ;
        int start = 0, end =0 , ans = 0;
        List<Integer> list = new ArrayList<>();
        int max = Arrays.stream(nums).max().orElse(-1);
        Deque<Integer> d = new ArrayDeque<>();
        if(k > nums.length) {
            System.out.println(max);
            return;
        }
        while(end < nums.length ){
            while(!d.isEmpty() && d.peekLast() < nums[end]){d.removeLast();}
            d.addLast(nums[end]);
            if(end-start + 1 == k){
                list.add(d.peekFirst());
                if(!d.isEmpty() && d.peekFirst() == nums[start]) d.pollFirst();
                start++;
            }
            end++;
        }
        System.out.println(list);
    }
}
