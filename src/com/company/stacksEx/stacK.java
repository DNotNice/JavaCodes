package com.company.stacksEx;

public class stacK {
    protected int[]data;
    private static final int DEFAULT_SIZE = 10;
    int ptr =  -1;
    public stacK () {

        this(DEFAULT_SIZE);
    }

    public stacK(int size){
       this.data = new int[size];
    }
    public boolean push (int item ){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item ;
        return true;
    }
    public int pop() throws StackExceptions{
        if(isEmpty()){
            throw new StackExceptions("Cant pop an element from an empty stack ");
        }
        int removed = data[ptr];
        ptr-- ;
        return removed ;
        // OR
        // return data[ptr--];
    }
    public int peek() throws  StackExceptions {
      if (isEmpty()){
          throw new StackExceptions("Cannot peek an element from empty stack ");
      }
      return data[ptr];
    }

    public boolean isFull() {
      return ptr == data.length - 1;
    }
    public  boolean isEmpty(){
        return ptr == - 1;
    }

}
