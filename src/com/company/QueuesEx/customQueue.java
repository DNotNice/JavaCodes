package com.company.QueuesEx;

public class customQueue {
    private int[] arr ;
    int front ;
    public  static final int DEFAULT_VAL = 10 ;
    int size  ;
public  customQueue() {
    this(DEFAULT_VAL);
}

     public customQueue(int cap){
     this.arr = new int[cap] ;
     front = 0 ;
     size = 0 ;
    }
    public boolean add(int elem){
         if(size == arr.length ) {
             System.out.println("Data overflow");
             return false ;
         }
             int pos = (front + size)%arr.length ;
             arr[pos] = elem ;
             size++;
             return true ;
    }

    public int remove () throws QueueExceptions {
     if(size == 0) {
         throw new QueueExceptions("cannot remove from an empty array");
     }
         int val = arr[front];
         front = (front + 1 ) % arr.length ;
         size--;
      return val;
    }

    public  int size() {
    return size ;
    }


    public int peek() throws  QueueExceptions{
    if(size == 0) throw  new QueueExceptions("cannot peek from an empty queeue");
    return arr[front] ;
    }
    public void display() {
        System.out.print("[");
    for(int i = 0 ; i  < arr.length ;  i++){
        int index = (front + i) % arr.length ;
        if(index != arr.length -1) System.out.print(arr[index] + ",");
        else System.out.print(arr[index] );
        }
        System.out.print("]");
    }

}
