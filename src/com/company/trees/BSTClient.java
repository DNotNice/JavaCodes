package com.company.trees;

public class BSTClient {
    public static void main(String[] args) {
        int[] arr = {10,20,30 ,40,50 ,60 ,70};
        BST bst = new BST(arr);
//        bst.display();
//System.out.println(bst.find(40));
//        System.out.println(bst.max());
        bst.add(55);
        bst.display();
        System.out.println();
        bst.remove(20);
        bst.display();
    }

}
