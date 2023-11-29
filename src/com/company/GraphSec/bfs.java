package com.company.GraphSec;
import java.util.*;
public class bfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt() ;
        int  n = sc.nextInt();
         ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
         for(int i = 0 ; i <= n ; i++)arr.add(new ArrayList<>());
         for(int i = 0 ; i < n ;i++){
             int u = sc.nextInt();
             int v = sc.nextInt();
             arr.get(u).add(v);
             arr.get(v).add(u);
         }
         ArrayList<Integer> fiin =  new ArrayList<>();
         int[] vis = new int[m+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(q.size() > 0){
            int cur = q.poll();
            if(vis[cur] != 1) {
                vis[cur] = 1;
                fiin.add(cur);
                for(int i : arr.get(cur))if(vis[i] == 0)q.add(i);
            }
        }
        System.out.println(fiin);
    }
}
