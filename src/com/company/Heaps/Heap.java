package com.company.Heaps;

import java.util.ArrayList;

public class Heap {
     ArrayList<Integer> data =  new ArrayList<>();

  public void add(int item ){
      data.add(item);
      upheapify(data.size() - 1);
  }

    private void upheapify(int childIndex) {
        int parentInd = (childIndex - 1)/ 2;
      if(data.get(childIndex) < data.get(parentInd)){
          swap( parentInd , childIndex);
          upheapify(parentInd);
      }
    }
    public void swap(int i , int j ){
      int ith = data.get(i);
      int jth= data.get(j);
      data.set(i , jth);
      data.set(j , ith);
    }
    //it is called priority queue because element with higher priority get removed first ;
    public int remove(){
      swap(0 , data.size() - 1);
      int rv = this.data.remove(this.data.size()-1);
      downheapifxy(0);

      return rv;
    }

    private void downheapifxy(int ind) {
      int lc = 2*ind+1;
      int rc = 2*ind+2;
      int mini = ind ;
      if( lc < data.size() && data.get(lc) < data.get(mini)) mini = lc ;
      if( rc < data.size() && data.get(rc) < data.get(mini)) mini = rc ;
      if(mini != ind) {
          swap(ind , mini);
          downheapifxy(mini);
      }
    }
    public int get(){
      return this.data.get(0);
    }

    public void display(){
        System.out.println(data);
    }
    public int size(){
      return this.data.size();
    }
    public boolean isEmpty(){
      return this.size() == 0 ;
    }
}
