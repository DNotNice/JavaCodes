package com.company.Collections.Hashmaps.GenericHashMap;

public class liknedlis<T>  {
    private node head;
    private node tail;
    int size;
    private class node {

        private T val; //private since we dont want anyone to access them directly
        private node next;

        public node(T val) {
            this.val = val;
        }

        public node(T val, node next) {
            this.val = val;
            this.next = next;
        }
    }

       public liknedlis() {
            this.size = 0;
        }

        public void firstinsert(T val) {
            node Node = new node(val);
            Node.next = head;
            head = Node;
            if (tail == null) {
                tail = head;
            }
            size++;

        }

        public void lastInsert(T val) {
            if (tail == null) {
                firstinsert(val);
                return;
            }
            node Node = new node(val);
            tail.next = Node;
            tail = Node;
            size++;
        }

        public void insert(T val, int index) {
            if (index == 0) {
                firstinsert(val);
                return;
            }
            if (index == size) {
                lastInsert(val);
                return;
            }
            node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            node Node = new node(val, temp.next);
            temp.next = Node;
            size++;
        }

        public T FirstDeletion() {
            T val = head.val;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return val;
        }

        public T LastDelete() {
            if (size <= 1) {
                return FirstDeletion();
            }
            node SecondLast = get(size - 2);
            T val = tail.val;
            tail = SecondLast;
            tail.next = null;
            return val;
        }

        public T delete(int index) {
            if (index == 0) {
                return FirstDeletion();
            }
            if (index == size - 1) {
                return LastDelete();
            }
            node prev = get(index - 1);
            T val = prev.next.val;
            prev.next = prev.next.next;
            return val;
        }

        public  node get(int index) {
            node Node = head;
            for (int i = 0; i < index; i++) {
                Node = Node.next;
            }
            return Node;
        }
        public T getAt(int index){
        node Node = head;
        for(int i = 0 ; i < index ; i++){
            Node = Node.next;
        }
        T ans = Node.val ;
        return ans ;
        }

        public node findnode(T val) {
            node Node = head;
            while (Node != null) {
                if (Node.val == val) {
                    return Node;
                }
                Node = Node.next;
            }
            return null;
        }
       public int find(T data){
        int index = 0 ;
        for(node temp = head ; temp!= null ; temp = temp.next){
            if(temp.val.equals(data)){
                return index ;
            }
            index++;
        }
        return -1 ;
       }
        public boolean isEmpty(){
        return this.size == 0 ;
        }
        public void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            System.out.println("END");
        }

}
