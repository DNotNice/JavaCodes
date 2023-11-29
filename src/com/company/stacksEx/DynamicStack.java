package com.company.stacksEx;

public class DynamicStack extends  stacK {
   public DynamicStack(){
       super(); // it will call default of custom Stack

   }
   public DynamicStack(int size){
       super(size); // it will call stacK(int size) ;
   }
   @Override
    public boolean push (int item ){
       if(this.isFull()){
           int[] temp = new int[data.length * 2];
            for(int i = 0 ; i < data.length ; i++)
            {
                temp[i] = data[i];
            }
            data =temp ;
       }
       //at this point array is not full;
       return super.push(item);
   }
}
