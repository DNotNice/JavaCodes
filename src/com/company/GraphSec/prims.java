package com.company.GraphSec;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair implements Comparable<Pair>{
    int weight;
    int node;
     int parent;
     Pair( int weight, int node, int distance){
         this.weight = weight;
         this.node = node;
         this.parent = distance;
     }

    @Override
    public int compareTo(Pair o) {
        return this.weight  - o.weight;
    }
}
class Pir{
    int node;
    int weight ;
    Pir(int node , int weight){
        this.node = node ;
        this.weight = weight;
    }
}
public class prims {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt() ;
        int  n = sc.nextInt();
        ArrayList<ArrayList<Pir>> arr = new ArrayList<>();
        for(int i = 0 ; i <= n ; i++){
            arr.add(new ArrayList<>());
        }
        for(int i = 0 ; i < n ;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
           Pir ne = new Pir(v , w);
           Pir wn = new Pir(u, w);
            arr.get(u).add(ne);
            arr.get(v).add(wn);
        }
        PriorityQueue<Pair> pr = new PriorityQueue<Pair>();
         pr.add(new Pair(-1, 0 , -1));
         boolean[] vis = new boolean[m+1];
         while(pr.size() > 0){
              Pair rem  = pr.remove();
              if(vis[rem.node]) continue;
              else {
                  vis[rem.node] = true;
                  if(rem.weight != -1) System.out.println("["+rem.node+"-"+ rem.parent+"@"+ rem.weight+"]");
              }
              for( Pir  i : arr.get(rem.node)){
                 if(!vis[i.node])pr.add(new Pair(i.weight, i.node, rem.node ));
              }
         }
    }
}
