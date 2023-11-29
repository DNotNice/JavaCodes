package com.company.trees;

import java.util.HashMap;

public class BST {
    private class Node {
        int data;
        Node left;
        Node right;

    }

    private Node root;

    BST(int[] arr) {
        this.root = TakeInput(arr, 0, arr.length - 1);
    }

    private Node TakeInput(int[] arr, int low, int high){

         if(low > high) return null;
        int mid = (low+high)/2;
        Node node = new Node();
        node.data = arr[mid];
        node.left = TakeInput(arr,low,mid-1);
        node.right = TakeInput(arr, mid+1, high);
        return node;

    }
    public void display(){
     display(this.root);
    }
    private void display(Node node){
        if(node == null)return ;
        String sr = "";
        if(node.left== null) sr+=".";
        else sr+=node.left.data;
        sr+="->"+node.data+"<-";
        if(node.right == null) sr+=".";
        else sr+=node.right.data;
        System.out.println(sr);
        display(node.left);
        display(node.right);
    }
    public boolean find(int target ){
       return find(this.root , target);
    }
    public boolean find(Node node ,int target){
        if(node == null) return false;
       if(target < node.data) return find(node.left , target);
       else if(target > node.data )  return find(node.right,target);
       else return  true;
    }
    public int max(){
        return max(this.root);
    }
    private int max(Node node){
        if(node.right == null) return node.data;
             return max(node.right);
    }
    public void add(int data){
         add(this.root , data);
    }
    private void add(Node node, int data){
        if(data <= node.data){
            if(node.left == null) {
                node.left  = new Node();
                node.left.data= data;
            }
            else add(node.left ,data);
        }
        else{
            if(node.right == null){
                node.right = new Node();
                node.right.data = data;
            }
            else add(node.right ,data);
        }
    }
    public void remove(int data){
        remove(this.root, data , null , false);
    }

    public void remove(Node node, int data , Node parent , boolean isLeftChild){
        if(data > node.data) remove(node.right ,data,node,false);
        else if(data < node.data) remove(node.left ,data,node,true);
        else {
            if(node.left == null && node.right == null) {
                if (isLeftChild) parent.left = null;
                else parent.right = null;
            }
             else if(node.left == null && node.right != null){
                if(isLeftChild) parent.left = node.right;
                else parent.right = node.right;

            }
             else if(node.left != null && node.right == null){
                if(isLeftChild) parent.left = node.left ;
                else parent.right = node.left;
            }
            else{
               int max = max(node.left);
               node.data = max;
               remove(node.left ,max,node,true);
            }
        }
    }
    public void findMode(){
        HashMap<Integer , Integer> hashmap = new HashMap<Integer , Integer>();
        findMode( hashmap , this.root);
    }
    private void findMode(HashMap hashMap ,Node node){
        if(node == null)return ;
        else {
            if(hashMap.containsKey(node.data)){
                hashMap.put(node.data, (int)hashMap.get(node.data)+1);
            }
            else hashMap.put(node.data, 1);
        }
        if(node.left != null) findMode(hashMap , node.left);
        if(node.right != null) findMode(hashMap, node.right);

    }

}