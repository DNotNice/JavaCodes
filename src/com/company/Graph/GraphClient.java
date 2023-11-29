package com.company.Graph;

public class GraphClient {
    public static void main(String[] args) throws Exception {
        Graph client = new Graph();
        client.addVertex("A");
        client.addVertex("B");
        client.addVertex("C");
        client.addVertex("D");
        client.addVertex("E");
        client.addVertex("F");
    //    client.addVertex("F");
    //    client.addVertex("G");
        client.addEdge("A", "B" ,6);
        client.addEdge("A", "D", 4);
        client.addEdge("B","C",5);
        client.addEdge("B", "E", 2);
        client.addEdge("C", "F", 4);
        client.addEdge("C", "D", 3);
        client.addEdge("D","E" , 6);
        client.addEdge("E", "F", 5);

        // client.addEdge("E","F",5);
       // client.addEdge("E","G",6);
       // client.addEdge("F","G",4);
//        client.removeEdge("B","C");
//        client.removeEdge("F","G");
      client.display();
        System.out.println();
//        System.out.println(client.containsVertex("G"));
//        System.out.println(client.containsEdge("A","B"));
       // System.out.println(client.hasPath("A","C" , new HashMap<>()));
       // System.out.println(client.BFS("A","F"));
       // client.DFT();
       // System.out.println(client.isCyclic());
        //System.out.println(client.isConnected());
        //System.out.println(client.isTree());
         //  System.out.println(client.getConnectedCompononent());
    //    client.prims().display();
       // System.out.println(client.dijkstra("A"));
        //  client.kruskal();
      //  System.out.println(client.Bellman("A"));
        client.TopoSort("A","F");
    }

}
