package com.company.Graph;
import com.company.Heaps.GenericHeap;
import com.company.trees.BinaryTree;

import java.util.*;

public class Graph {
    private class Vertex {
            HashMap<String , Integer > nbrs = new HashMap<>();
    }
    HashMap<String , Vertex> vertices ;
    Graph(){
        vertices = new HashMap<>();
    }
    public int noOfVertex(){
        return this.vertices.size();
    }
    public boolean containsVertex(String vname){
        return this.vertices.containsKey(vname);
    }
    public void addVertex(String vname){
        Vertex vtx = new Vertex();
        vertices.put(vname,vtx);
    }
    public int numEdges(){
        int count = 0 ;
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());
       for(String key : keys){
           Vertex vtx = vertices.get(key);
           count+=vtx.nbrs.size();
       }
       return count/2 ;
    }
    public boolean containsEdge(String vname1 , String vname2){
        Vertex vx1 = vertices.get(vname1);
        Vertex vx2 = vertices.get(vname2);
        return vx1 != null && vx2 != null && vx1.nbrs.containsKey(vname2);
    }
    public void addEdge(String vname1, String vname2, int cost){
        Vertex vx1 = vertices.get(vname1);
        Vertex vx2 = vertices.get(vname2);
        if(vx1== null || vx2 == null || vx1.nbrs.containsKey(vname2)) return;
            vx1.nbrs.put(vname2,cost);
             vx2.nbrs.put(vname1,cost);
    }
    public void removeEdge(String vname1, String vname2){
        Vertex vx1 = vertices.get(vname1);
        Vertex vx2 = vertices.get(vname2);
        if(vx1== null || vx2 == null || !vx1.nbrs.containsKey(vname2)) return;
        vx1.nbrs.remove(vname2);
        vx2.nbrs.remove(vname1);

    }
    public void removeVertex(String vname){
         Vertex vtx = vertices.get(vname);
         ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
         for(String key : keys){
             Vertex nbrvtx = vertices.get(key);
             nbrvtx.nbrs.remove(vname);
         }
         vertices.remove(vname);
    }
    public void display(){
        ArrayList<String>   keys = new ArrayList<>(vertices.keySet());
        for(String key : keys){
          Vertex vtx = vertices.get(key);
            System.out.println(key + ":" + vtx.nbrs);
        }
    }
    public boolean hasPath(String vname1, String vname2 , HashMap<String , Boolean> map){
        map.put(vname1 , true );
        if( containsEdge(vname1,vname2) )return true ;
        Vertex vtx = vertices.get(vname1);
        ArrayList<String> arr = new ArrayList<>(vtx.nbrs.keySet());
        for(String nbr : arr){
         if( !map.containsKey(nbr ) && hasPath(nbr, vname2 , map)) return true;
        }
        return false;
    }
    private class Pair{
        String name ;
        String pathSofar;
        Pair(){

        }
        Pair( String name , String pathsofar){
                this.name   = name ;
                this.pathSofar = pathsofar;
        }
    }
    public boolean BFS(String source , String dest){
        HashMap<String , Boolean> map = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();
       Pair start = new Pair();
       start.name = source;
       start.pathSofar = source;
        queue.addLast(start);
        while(!queue.isEmpty()){
            Pair rp = queue.removeFirst();
            if(map.containsKey(rp.name)) continue;
            map.put(rp.name , true);
            if(containsEdge(rp.name ,dest)){
                System.out.println(rp.pathSofar+dest);
                return  true;
            }
            Vertex vtx = vertices.get(rp.name);
            ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
            for(String key : nbrs){
                if(!map.containsKey(key)){
                    Pair np = new Pair();
                    np.name = key ;
                    np.pathSofar = rp.pathSofar+key;
                    queue.addLast(np);
                }
            }
        }
    return false;
    }
    public boolean DFS(String source , String dest){
        HashMap<String , Boolean> map = new HashMap<>();
        LinkedList<Pair> stack = new LinkedList<>();
        Pair start = new Pair();
        start.name = source;
        start.pathSofar = source;
        stack.addFirst(start);
        while(!stack.isEmpty()){
            Pair rp = stack.removeFirst();
            if(map.containsKey(rp.name)) continue;
            map.put(rp.name , true);
            if(containsEdge(rp.name ,dest)){
                System.out.println(rp.pathSofar+dest);
                return  true;
            }
            Vertex vtx = vertices.get(rp.name);
            ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
            for(String key : nbrs){
                if(!map.containsKey(key)){
                    Pair np = new Pair();
                    np.name = key ;
                    np.pathSofar = rp.pathSofar+key;
                    stack.addFirst(np);
                }
            }
        }
        return false;
    }
    public boolean TopoSort(String source , String target){
        HashMap<String , Boolean> map = new HashMap<>();
        Stack<String> stack = new Stack<>();
        Pair start = new Pair();
        start.name = source;
        start.pathSofar=source;
         topoUtil(start  , map , stack);
        System.out.println(stack);
        return true;
    }

    private void topoUtil(Pair start, HashMap<String, Boolean> map, Stack<String> stack) {
            Pair curr = start;
             map.put(curr.name,true);
             Vertex vtx = vertices.get(curr.name);
             ArrayList<String> arr = new ArrayList<>(vtx.nbrs.keySet());
             for(String key : arr){
                 if(!map.containsKey(key)){
                     topoUtil(new Pair(key , curr.pathSofar+key) , map , stack);
                 }
             }
             stack.push(curr.name);


    }

    public void BFT(){
        HashMap<String , Boolean> map = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();
       ArrayList<String> keys = new ArrayList<>(vertices.keySet());
       for(String key : keys) {
           if(map.containsKey(key)) continue;
           Pair start = new Pair();
           start.name = key;
           start.pathSofar = key;
           queue.addLast(start);
           while (!queue.isEmpty()) {
               Pair rp = queue.removeFirst();
               if (map.containsKey(rp.name)) continue;
               map.put(rp.name, true);
               System.out.println(rp.name +": "+rp.pathSofar);
               Vertex vtx = vertices.get(rp.name);
               ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
               for (String val : nbrs) {
                   if (!map.containsKey(val)) {
                       Pair np = new Pair();
                       np.name = val;
                       np.pathSofar = rp.pathSofar + val;
                       queue.addLast(np);
                   }
               }
           }
       }
    }
    public void DFT(){
        HashMap<String , Boolean> map = new HashMap<>();
        LinkedList<Pair> stack = new LinkedList<>();
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());
        for(String key : keys) {
            //this will only run second time if there are 2 separate graphs present
            if(map.containsKey(key)) continue;
            Pair start = new Pair();
            start.name = key;
            start.pathSofar = key;
            stack.addFirst(start);
            while (!stack.isEmpty()) {
                Pair rp = stack.removeFirst();
                if (map.containsKey(rp.name)) continue;
                map.put(rp.name, true);
                System.out.println(rp.name +": "+rp.pathSofar);
                Vertex vtx = vertices.get(rp.name);
                ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
                for (String val : nbrs) {
                    if (!map.containsKey(val)) {
                        Pair np = new Pair();
                        np.name = val;
                        np.pathSofar = rp.pathSofar + val;
                        stack.addFirst(np);
                    }
                }
            }
        }
    }
    public boolean isCyclic(){
        HashMap<String , Boolean> map = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());
        for(String key : keys) {
            if(map.containsKey(key)) continue;
            Pair start = new Pair();
            start.name = key;
            start.pathSofar = key;
            queue.addLast(start);
            while (!queue.isEmpty()) {
                Pair rp = queue.removeFirst();
                if (map.containsKey(rp.name))return true;
                map.put(rp.name, true);
                Vertex vtx = vertices.get(rp.name);
                ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
                for (String val : nbrs) {
                    if (!map.containsKey(val)) {
                        Pair np = new Pair();
                        np.name = val;
                        np.pathSofar = rp.pathSofar + val;
                        queue.addLast(np);
                    }
                }
            }
        }
        return false ;
    }

    public boolean isConnected(){
        int flag = 0;
        HashMap<String , Boolean> map = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());
        for(String key : keys) {
            if(map.containsKey(key)) continue;
            flag++;
            if(flag>1) return false ;
            Pair start = new Pair();
            start.name = key;
            start.pathSofar = key;
            queue.addLast(start);
            while (!queue.isEmpty()) {
                Pair rp = queue.removeFirst();
                if (map.containsKey(rp.name)) continue;
                map.put(rp.name, true);
                Vertex vtx = vertices.get(rp.name);
                ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
                for (String val : nbrs) {
                    if (!map.containsKey(val)) {
                        Pair np = new Pair();
                        np.name = val;
                        np.pathSofar = rp.pathSofar + val;
                        queue.addLast(np);
                    }
                }
            }
        }
        return true;
    }

    public boolean isTree(){
        return !isCyclic() && isConnected();
    }

    public ArrayList<ArrayList<String>> getConnectedCompononent(){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        HashMap<String , Boolean> map = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());
        for(String key : keys) {
            if(map.containsKey(key)) continue;
            ArrayList<String> arr  = new ArrayList<>();
            Pair start = new Pair();
            start.name = key;
            start.pathSofar = key;
            queue.addLast(start);
            while (!queue.isEmpty()) {
                Pair rp = queue.removeFirst();
                if (map.containsKey(rp.name)) continue;
                map.put(rp.name, true);
               arr.add(rp.name);
                Vertex vtx = vertices.get(rp.name);
                ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
                for (String val : nbrs) {
                    if (!map.containsKey(val)) {
                        Pair np = new Pair();
                        np.name = val;
                        np.pathSofar = rp.pathSofar + val;
                        queue.addLast(np);
                    }
                }
            }
            ans.add(arr);
        }
        return ans ;
    }

    private class PrimsPair implements Comparable<PrimsPair> {
       String vname ;
       String acqvname ;
       int cost ;

        @Override
        public int compareTo(PrimsPair o) {
            return o.cost - this.cost ;
        }
    }
    public Graph prims(){
       Graph mst = new Graph();
       HashMap<String , PrimsPair> map = new HashMap<>();
        GenericHeap<PrimsPair> heap = new GenericHeap<>();
        for(String key : vertices.keySet()){
            PrimsPair np = new PrimsPair();
            np.vname = key ;
                np.acqvname = null;
                np.cost = Integer.MAX_VALUE;
            map.put(key , np );
            heap.add(np);
        }
        while(!heap.isEmpty()){
            //remove a pair
            PrimsPair rp = heap.remove();
            map.remove(rp.vname);

            //add to graph mst
            if(rp.acqvname == null){
                mst.addVertex(rp.vname);
            }
            else{
                mst.addVertex(rp.vname);
                mst.addEdge(rp.vname , rp.acqvname , rp.cost);
            }

            // move to its neighbours
            for(String nbr : vertices.get(rp.vname).nbrs.keySet()){
                if(map.containsKey(nbr)){
                    int oc = map.get(nbr).cost;
                    int nc = vertices.get(rp.vname).nbrs.get(nbr);
                    if(nc < oc){
                        PrimsPair tg = map.get(nbr);
                        tg.acqvname = rp.vname;
                        tg.cost = nc ;

                        heap.updatePriority(tg);
                    }
                }
            }
        }
       return mst ;
    }
    private class DijkstraPair implements  Comparable<DijkstraPair> {
     String name ;
        String Psf ; // path so far
        int cost ;
        @Override
        public int compareTo(DijkstraPair o) {
            return o.cost - this.cost;
        }
    }
    public HashMap<String  , Integer> dijkstra(String src ){
        HashMap<String , Integer> ans = new HashMap<>();
        HashMap<String , DijkstraPair> map = new HashMap<>();
        GenericHeap<DijkstraPair> heap = new GenericHeap<>();
        for(String key : vertices.keySet()){
       DijkstraPair np = new DijkstraPair();
            np.name = key;
            np.Psf="";
            np.cost = Integer.MAX_VALUE;
            if(key.equals(src)) {
                np.cost = 0 ;
                np.Psf = key ;
            }
            map.put(key , np );
            heap.add(np);
        }
        while(!heap.isEmpty()){
            //remove a pair
         DijkstraPair rp = heap.remove();
            map.remove(rp.name);
            //add to ans ;
            ans.put(rp.name ,rp.cost);

       //     System.out.println(rp.Psf);

            // move to its neighbours
            for(String nbr : vertices.get(rp.name).nbrs.keySet()){
                if(map.containsKey(nbr)){
                    int oc = map.get(nbr).cost;
                    int nc = rp.cost + vertices.get(rp.name).nbrs.get(nbr);
                    if(nc < oc){
                        DijkstraPair tg = map.get(nbr );
                        tg.Psf = rp.Psf + nbr ;
                        tg.cost = nc ;

                        heap.updatePriority(tg);
                    }
                }
            }
        }
        return ans ;
    }

    private class DisjointSet {
        HashMap<String , Node> map = new HashMap<>();
       private class Node {
           String data;
           Node parent;
           int rank;
       }
        public void createSet(String val) {
          Node nn = new Node();
          nn.data = val;
          nn.parent = nn;
          nn.rank = 0 ;
          map.put(val , nn);
        }

        public void union(String vname1, String vname2) {
         Node n1 = map.get(vname1);
         Node n2 = map.get(vname2);

         Node re1 = find(n1);
         Node re2 = find(n2);
         if(re1.data.equals(re2.data)) return ;
         else {
             if(re1.rank == re2.rank){
                 re2.parent = re1;
                 re1.rank = re1.rank + 1;
             }else if(re1.rank > re2.rank){
                 re2.parent = re1;
             }
             else {
                 re1.parent = re2;
             }
         }
        }
        public String find(String vname) {
           return  find(map.get(vname)).data;
        }
        private Node find(Node node){
          if(node == node.parent) return node ;
           Node rr = find(node.parent);
           node.parent = rr ;  //path compression
           return rr;
        }
    }
    public class EdgePair implements Comparable<EdgePair>{
        String vname1 ;
        String vname2 ;
        int cost ;

        @Override
        public int compareTo(EdgePair o) {
            return this.cost  - o.cost;
        }
        public String toString(){
            return vname1 + " "+ vname2 + "  "+ cost ;
        }
    }
    public ArrayList<EdgePair> getAllEdges(){
       EdgePair ee = new EdgePair();

        ArrayList<EdgePair> edges = new ArrayList<>();
        for(String key : vertices.keySet()){
            Vertex vtx = vertices.get(key);
            for(String nbr : vtx.nbrs.keySet()){
             EdgePair ep = new EdgePair();
             ep.vname1 = key;
             ep.vname2 = nbr ;
             ep.cost = vtx.nbrs.get(nbr);
             edges.add(ep);
            }
        }
        return edges ;
    }
   public void kruskal(){
       //sort the edges in increasing order of weight ;
        ArrayList<EdgePair> edges = getAllEdges();
       Collections.sort(edges);
       DisjointSet set  =new DisjointSet();

       //create vertices no of sets
        for(String vname  : vertices.keySet()){
            set.createSet(vname);
        }
        //traverse over the edges
        for(EdgePair edge : edges){
            String re1 = set.find(edge.vname1);
            String re2 = set.find(edge.vname2);
            if(re1.equals(re2)) continue;
            else {
                System.out.println(edge);
                set.union(re1 ,re2 );
            }
        }
   }
   public HashMap<String , Integer> Bellman(String src) throws  Exception{
        ArrayList<EdgePair> ans = getAllEdges();
        HashMap<String , Integer> map = new HashMap<>();
        for(String key : vertices.keySet()){
            map.put(key , 100000);
            if(src.equals(key)) map.put(key , 0);
        }
     //relax every edge v-1 times ;
       int v= vertices.size();
        for(int i = 1; i<= v ; i++){
            for(EdgePair edge : ans){
                int oc = map.get(edge.vname2);
                int nc = map.get(edge.vname1)+ edge.cost;
                if( nc < oc){
                    if(i < v) map.put(edge.vname2 , nc);
                    else throw new Exception("-ve EDGE CYCLE DETECTED");
                }

            }
        }
        return map ;
   }
}
