package com.company.GraphSec;
import java.util.*;
public class dfs {
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
        int[] vis = new int[m+1];
        vis[0] = 1 ;
        ArrayList<Integer> ans =  new ArrayList<>();
       dfsG(0 , vis , ans ,arr);
        System.out.println(ans);
    }
    static public void dfsG(int node , int[] vis  ,ArrayList<Integer> ans , ArrayList<ArrayList<Integer>> arr){
            ans.add(node);
            vis[node] = 1;
            for (int  i : arr.get(node)) if(vis[i]==0) dfsG(i , vis , ans , arr);
    }
}
