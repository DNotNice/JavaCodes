package com.company.SegTree;
public class segtree {
    private class Node {
        int data ;
        int si ; // start interval
        int ei ;  // end interval;
        Node left ;
        Node right ;
    }
    Node root ;
    public segtree(int[] arr){
        this.root = constructTree(arr,0 , arr.length - 1);
    }

    private Node constructTree(int[] arr , int startInt , int EndInt) {
        if(startInt == EndInt){
            Node leaf = new Node();
            leaf.data = arr[startInt];
            leaf.si =startInt;
            leaf.ei = EndInt;
            return leaf ;
        }

         Node node = new Node();
         node.si = startInt;
         node.ei = EndInt;
         int mid = (startInt+ EndInt)/2;
         node.left = constructTree(arr, startInt,mid);
         node.right = constructTree(arr, mid+1 ,EndInt);
          node.data = node.left.data + node.right.data ; //we are using sum between intervals..thats why we are adding here
        return node;
    }
    public void display(){
     this.display(this.root);
    }
    private void display(Node node){
        String str = "";
        if(node.left!=null)
            str += "Interval ["+node.left.si+"-"+node.left.ei+"] and Data is ="+node.left.data+"=>" ;
        else str+= "NO Left Child => ";
       str += "Interval ["+node.si+"-"+node.ei+"] and data ="+node.data;
        if(node.right != null) str += "<= and Data is "+node.right.data+" Interval  ["+node.right.si+"-"+node.right.ei+"]";
        else str+=" <= NO Right Child";
        System.out.println(str);
        if(node.left != null) this.display(node.left);
        if(node.right != null) this.display(node.right);
    }
    public int query (int qsi , int qei){
        return this.query(this.root , qsi , qei);
    }
    private int query(Node node , int qsi , int qei){
        //node is completely inside query22222
        if(node.si >= qsi && node.ei <= qei ) return node.data;
       //this is completely outside
        else if (node.si > qei || node.ei < qsi) return 0 ; // return default value of query
        else {
            //overlapping case
            int leftans =query(node.left , qsi , qei);
            int rightans = query(node.right , qsi ,qei);
            return leftans + rightans;
        }
    }
    public void update(int ind , int val){
   this.root.data = update(this.root , ind , val);
    }
    private int update(Node node , int ind ,int val){
      if(ind >= node.si && ind <= node.ei ){
          if(ind == node.si && ind == node.ei){
            node.data = val;
          }
          else {
              int leftVal = this.update(node.left , ind ,  val);
              int rightVal = this.update(node.right , ind ,val);
              node.data = leftVal+ rightVal;

          }

      }
      return node.data;
    }


}
