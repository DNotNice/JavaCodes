package com.company.linkedlist;

public class DLL {
   private Node head ;
    Node tail;
    int size ;

  public void FirstInsert(int val){
   Node node = new Node(val);
   node.next = head ;
   node.prev = null;
   if(head != null){
   head.prev = node; }

   head  = node;
  }
  public void LastInsert(int val){
      Node last = head ;
      Node node = new Node(val);
      node.next = null;
      if(head == null){
          head = node ;
          node.prev = null ;
      }
      while(last.next != null){
          last= last.next ;
      }
      last.next = node ;
      node.prev = last ;
  }

  public Node find(int val){
      Node temp = head ;
      while(temp != null){
          if(temp.val == val){
              return temp ;
          }
          temp  = temp.next;
      }
      return null;
  }
    public int  deleteAtBeginning() {
        int val = 0;
        if (head == null) return -1;
        if (head == tail) {
             val  = head.val;
            head = null;
            tail = null;
            return val;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return temp.val;
    }
    public int deleteAtEnd() {
        int val = 0;
        if (tail == null) return -1;
        if (head == tail) {
            val = head.val;
            head = null;
            tail = null;
            return val;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        return temp.val;
  }

  public void display(){
      Node node = head ;
      Node last = null ;

      while(node != null){
          last = node ;
          System.out.print(node.val +"->");
          node = node.next;
      }
      System.out.println("END");
      System.out.println("PRINT IN REVERSE");
      while(last != null){
          System.out.print(last.val + "->");
          last = last.prev ;
      }
      System.out.println("START");
  }

    private  class Node {

        private int val ;
        private  Node next ;
        private  Node prev ;

    public  Node(int val){
        this.val = val ;
    }
     public Node(int val , Node next , Node prev){
        this.val = val ;
        this.next = next ;
        this.prev = prev;
    }
    }
}
