package com.company.linkedlist;

public class LL {
    private node head ;
    private node tail ;
     int size ;
     public LL(){
         this.size = 0 ;
     }
     public void firstinsert(int val){
         node Node = new node(val);
         Node.next = head;
         head = Node ;
         if(tail == null){
             tail = head;
         }
         size++;

     }
     public void lastInsert(int val){
         if(tail == null){
             firstinsert(val);
             return ;
         }
         node Node = new node(val);
         tail.next = Node;
         tail = Node;
         size++;
     }
     public void insert(int val , int index){
         if(index == 0){
             firstinsert(val);
             return;
         }
         if(index == size){
             lastInsert(val);
             return ;
         }
         node temp = head;
         for(int i = 1  ; i < index ; i++){
             temp = temp.next;
         }
         node Node = new node(val , temp.next);
         temp.next = Node ;
         size++;
     }
     public int  FirstDeletion(){
         int val = head.val;
         head  = head.next;
         if(head == null){
             tail = null ;
         }
         size--;
         return val;
     }
     public int LastDelete(){
         if(size<= 1){
             return FirstDeletion();
         }
         node SecondLast = get(size - 2);
         int val = tail.val;
         tail = SecondLast;
         tail.next = null;
         return val;
     }
     public int delete(int index){
         if(index == 0){
             return FirstDeletion();
         }
         if(index == size - 1){
             return LastDelete();
         }
         node prev = get(index - 1);
         int val = prev.next.val;
         prev.next = prev.next.next;
         return val;
     }
     public node get(int index){
         node Node = head;
         for(int i = 0 ; i < index ; i++){
             Node = Node.next;
         }
         return Node;
     }
     public node findnode(int val){
         node Node = head;
         while(Node != null){
             if(Node.val == val){
                 return Node;
             }
             Node  = Node.next;
         }
         return null;
     }

     public void display(){
         node temp = head;
         while(temp != null){
             System.out.print(temp.val+"->");
             temp = temp.next ;
         }
         System.out.println("END");
     }
     //insert using recursion
    public void inssert(int index , int val){
       head = insertrecur(index , val ,head);
    }
    private node insertrecur(int index , int val , node Node){
         if(index == 0){
             node temp = new node(val , Node);
             size++;
             return temp;
         }
         Node.next = insertrecur(index-1 , val , Node.next);
         return Node;
    }

 //questions :
    //find length of the cycle ;
    public int cyclelen(node head){
         node slow = head ;
         node fast = head;
        int length = 0;
         while(fast!= null && fast.next != null){
             fast.next = fast.next.next;
             slow = slow.next;
             if(slow == fast){
                 node temp = slow ;
                 do {
                     slow = slow.next;
                     length++;
                 }  while(fast != slow);
                 return length;
             }
         }
         return 0 ;

    }
    public int lengthc(node s){
         node temp = s ;
         int length = 0;
         do{
             temp = temp.next;
             length++;

         }while(temp != s);
         return length ;
    }
    public node startcyc(node Node){
         node slow = head;
         int length = 0;
         node fast = head;
         while(fast != null && fast.next != null){
             fast = fast.next.next;
             slow = slow.next;
             if(fast == slow){
                 length = lengthc(slow);
                 break;
             }
         }
         node f = head;
         node s = head;
         while(length >0){
             s = s.next;
             length--;
         }
         while( f != s){
             f=f.next ;
             s=s.next ;
         }
         return s ;

    }
   //reversing a linked list ;
    public void reverse(node Node){
         if(Node == tail){
             head = tail;
             return;
         }
         reverse(Node.next );
         tail.next = Node;
         tail = Node;
         tail.next = null;
    }

    //inplace reversal
    public void inplacerev(){
         node pres = head;
         node prev = null;
         node next = head.next ;
         while(pres != null ){
             pres.next = prev;
             prev = pres ;
             pres = next ;
             if(next != null){
                 next = next.next ;
             }
          head = prev;

         }
    }
    //reverse linked list || ;
    public node reverselinkedlist(node head , int left , int right ){
         if(left == right){
             return head ;
         }
         node curr= head ;
         node prev = null ;
         for(int i = 0 ;curr != null && i < left - 1  ; i++){
             prev = curr;
             curr = curr.next;
         }
         node last = prev;
         node newEnd = curr;
         node next= curr.next ;
         for(int i = 0 ;  curr != null && i < right - left + 1; i++){
             curr.next = prev;
             prev = curr ;
             curr = next ;
             if(next != null){
                 next = next.next ;
             }

         }
        if(last != null){
            last.next = prev;
        }else
            head = prev ;
        newEnd.next = curr ;
        return head ;
    }

    public node reverselin(node head){
         node pres = head ;
        node prev = null;
        node next = head.next ;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = pres.next ;
            if(next != null){
                next = next.next ;
            }
        }
        return pres;
    }
  //palindrome linked list
    public void palindrome (node head) {
         node slow = head;
         node fast = head ;
         while(fast!= null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next ;
         }
         node mid = slow ;
         node reverseHead = reverselin(mid);
         node rereversin = reverseHead;
    // here we will compare from our heads ;
       while(head != null && reverseHead != null){
           if(head.val != reverseHead.val){
               break;

           }
           else {
               head = head.next;
               reverseHead =reverseHead.next;
           }
           reverselin(reverseHead);
       }
       reverselin(rereversin);
     }

    private class node{

        private int val ; //private since we dont want anyone to access them directly
        private node next ;
        public node(int val){
            this.val = val ;
        }
        public node(int val , node next){
            this.val = val ;
            this.next = next ;
        }
    }
}
