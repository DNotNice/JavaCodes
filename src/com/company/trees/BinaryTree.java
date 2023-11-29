package com.company.trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    int size;

    BinaryTree() {
        Scanner sc = new Scanner(System.in);
        this.root = takeInput(sc, null, false);
    }

    private Node takeInput(Scanner sc, Node parent, boolean isLeftorRight) { //if left node pass true else false
        if (parent == null) System.out.println("Enter the data for root node");
        else {
            if (isLeftorRight) System.out.println("Enter the data for left child of " + parent.data);
            else System.out.println("Enter the data for right child of " + parent.data);
        }
        int data = sc.nextInt();
        Node node = new Node(data, null, null);
        this.size++;
        boolean child = false;
        System.out.println("do you have left child of " + node.data);
        boolean choice = sc.nextBoolean();
        if (choice) node.left = this.takeInput(sc, node, true);
        choice = false;
        System.out.println("Do you have right child of " + node.data);
        choice = sc.nextBoolean();
        if (choice) node.right = this.takeInput(sc, node, false);
        return node;
    }


    public void display() {
        this.display(this.root);
    }

    private void display(Node node) {
        String s = "";
        if (node.left != null) {
            s += node.left.data + "=>";
        } else s += "Null=>";
        s += node.data;
        if (node.right != null) s += "<=" + node.right.data;
        else s += "<=Null";
        System.out.println(s);
        if (node.left != null) display(node.left);
        if (node.right != null) display(node.right);
    }

    public int height() {
        int treeheight = height(this.root);
        return treeheight ;
    }
    private int height(Node node) {
        if (node == null) return -1;

        int lheight = this.height(node.left);
        int rheight = this.height(node.right);
        return Math.max(lheight , rheight) +1 ;
    }
    public void preOrderTraversal(){
        preOrderTraversal(this.root);
        System.out.println("END");
    }
    public void preOrderTraversal(Node node){
        if(node == null) return ;
        System.out.print(node.data+",");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }
    public void InOrderTraversal(){
        this.InOrderTraversal(this.root);
        System.out.println("END");
    }
    private void InOrderTraversal(Node node){
        if(node == null) return ;
        InOrderTraversal(node.left);
        System.out.print(node.data+",");
        InOrderTraversal(node.right);

    }
    public void PostOrderTraversal(){
      PostOrderTraversal(this.root);
        System.out.println("END");
    }
    private void PostOrderTraversal(Node node){
        if(node == null ) return ;
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.data+",");
    }
    public void LevelOrderTraversal(){
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()){
            Node rm = queue.removeFirst();
            System.out.print(rm.data+",");
            if(rm.left!= null) queue.add(rm.left);
            if(rm.right!= null) queue.add(rm.right);
        }
        System.out.println("END");
    }
    public boolean isBST(){
        return isBST(this.root , Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
    private boolean isBST(Node node , int min , int max){
        if(node == null) return true ;
        if(node.data < min || node.data > max) return false ;
        else if(!isBST(node.left ,min,node.data)) return false ;
        else if(!isBST(node.right,node.data , max)) return false ;
        else return true ;

    }
    public int SumLeaf(){
        return (SumLeaf(this.root));
    }
    private int SumLeaf(Node node){
        if(node == null) return 0 ;
        if(node.left == null && node.right == null) return node.data;
        int lsum = SumLeaf(node.left);
        int rsum = SumLeaf(node.right);
        return lsum+rsum;
    }

    public int diameter(){return diameter(this.root);};

    private int diameter(Node node){
        //diameter - max distance between any two nodes;
        //TIME COMPLEXITY - O(N^2)
    if(node == null)return 0 ;
        int case1 = height(node.left)+height(node.right) + 2; //when diameter passes through center ;
        int case2 = diameter(node.left);
        int case3 = diameter(node.right);
        int max = Math.max(case1,Math.max(case2,case3));
        return max ;
    }
    public int diaBetter(){
        return diaBetter(this.root).diameter ;

    }
    private diaPair diaBetter(Node node){
        if(node == null){
            diaPair negans  = new diaPair(-1,0);
            return negans;
        }
        diaPair left = diaBetter(node.left );
        diaPair right = diaBetter(node.right);
        diaPair myans = new diaPair();
        myans.height = Math.max(left.height , right.height) + 1;
        myans.diameter = Math.max(left.height + right.height + 2 ,Math.max (left.diameter  , right.diameter));
        return myans ;
    }


    private class diaPair{
        int height ;
        int diameter ;
        diaPair(){};
        diaPair(int height , int diameter){
            this.height = height;
            this.diameter = diameter ;
        }
    }
   public int maxLevelSum(){
        return maxLevelSum(this.root);
   }
   private  int maxLevelSum(Node node){
       if (node == null) return 0;
       Queue<Node> queue = new LinkedList<>();
       queue.add(node);

       int level = 0;
       int minLevel = 0, maxSum = Integer.MIN_VALUE;
       while (!queue.isEmpty()) {
           int size = queue.size();
           level++;
           int levelSum = 0;
           for (int i = 0; i < size; i++) {
               levelSum += queue.poll().data;
               if (node.left != null) queue.add(node.left);
               if (node.right != null) queue.add(node.right);
           }
           if (levelSum > maxSum) {
               maxSum = levelSum;
               minLevel = level;
           }
       }
       return minLevel;
   }
}