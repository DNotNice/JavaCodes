package com.company.trees;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bree = new BinaryTree();
        bree.display();
        int height  = bree.height();
     //   System.out.println(height);
    //    bree.preOrderTraversal();

//        bree.InOrderTraversal();
//
//        bree.PostOrderTraversal();
//
//        bree.LevelOrderTraversal();
        System.out.println(bree.isBST());
        int sum = bree.SumLeaf();
        System.out.println(sum);
//        System.out.println(bree.diameter());
        System.out.println(bree.diaBetter());
    }
}
// 50 true 25 false true 28 true 85 false false false true 38 false true 45 true 65 false false false