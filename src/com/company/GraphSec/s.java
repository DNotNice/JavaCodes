package com.company.GraphSec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class s implements Comparable<s> {
    private static int idCounter = 0;
    public int id;


    public s parent = null;

    public List<Edge> neighbors;

    public double f = Double.MAX_VALUE;
    public double g = Double.MAX_VALUE;

    public double h;

    s(double h){
        this.h = h;
        this.id = idCounter++;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public int compareTo(s n) {
        return Double.compare(this.f, n.f);
    }

    public static class Edge {
        Edge(int weight, s node){
            this.weight = weight;
            this.node = node;
        }

        public int weight;
        public s node;
    }

    public void addBranch(int weight, s node){
        Edge newEdge = new Edge(weight, node);
        neighbors.add(newEdge);
    }

    public double calculateHeuristic(s target){
        return this.h;
    }
    public static s aStar(s start, s target){
        PriorityQueue<s> closedList = new PriorityQueue<>();
        PriorityQueue<s> openList = new PriorityQueue<>();

        start.f = start.g + start.calculateHeuristic(target);
        openList.add(start);

        while(!openList.isEmpty()){
            s n = openList.peek();
            if(n == target){
                return n;
            }

            for(s.Edge edge : n.neighbors){
                s m = edge.node;
                double totalWeight = n.g + edge.weight;

                if(!openList.contains(m) && !closedList.contains(m)){
                    m.parent = n;
                    m.g = totalWeight;
                    m.f = m.g + m.calculateHeuristic(target);
                    openList.add(m);
                } else {
                    if(totalWeight < m.g){
                        m.parent = n;
                        m.g = totalWeight;
                        m.f = m.g + m.calculateHeuristic(target);

                        if(closedList.contains(m)){
                            closedList.remove(m);
                            openList.add(m);
                        }
                    }
                }
            }

            openList.remove(n);
            closedList.add(n);
        }
        return null;
    }

    public static void printPath(s target){
        s n = target;

        if(n==null)
            return;

        List<Integer> ids = new ArrayList<>();

        while(n.parent != null){
            ids.add(n.id);
            n = n.parent;
        }
        ids.add(n.id);
        Collections.reverse(ids);

        for(int id : ids){
            System.out.print(id + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        s head = new s(3);
        head.g = 0;

        s n1 = new s(2);
        s n2 = new s(2);
        s n3 = new s(2);

        head.addBranch(1, n1);
        head.addBranch(5, n2);
        head.addBranch(2, n3);
        n3.addBranch(1, n2);

        s n4 = new s(1);
        s n5 = new s(1);
        s target = new s(0);

        n1.addBranch(7, n4);
        n2.addBranch(4, n5);
        n3.addBranch(6, n4);

        n4.addBranch(3, target);
        n5.addBranch(1, n4);
        n5.addBranch(3, target);

        s res = aStar(head, target);
        printPath(res);
    }
}
