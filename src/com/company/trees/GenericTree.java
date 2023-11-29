package com.company.trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
    private  class Node {
        int data;
        ArrayList<Node> children;

        public Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    public Node root;
    public int size;


    GenericTree() {
        Scanner sc = new Scanner(System.in);
        this.root = takeInput(sc,   null,0);
    }

    // to take input for generic tree
    private Node takeInput(Scanner sc, Node parent, int ithchild) {
        if(parent == null){
            System.out.println("Enter the data for the root node");
        }else {
            System.out.println("Enter the data for"+ithchild+"th child of"+parent.data);
        }
       int nodedata = sc.nextInt();
        Node node  = new Node(nodedata);
        this.size++;
        System.out.println("Enter the no of children for "+node.data);
        int children = sc.nextInt();
        for(int i  = 0 ; i < children ;i++){
            Node child = this.takeInput(sc,node,i);
            node.children.add(child);
        }
        return node;
    }
    public  void display(){
        this.display(this.root);
    }
    private  void display(Node node){
      String str = node.data + "-->";
      for(int i = 0 ; i < node.children.size() ;i++){
          str += node.children.get(i).data+" , ";
      }
      str += "END";
        System.out.println(str);
      //display for all nodes
        for(int i = 0 ; i < node.children.size() ;i++){
           display(node.children.get(i));
        }

    }
}