package com.company.Heaps;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericHeap <T extends Comparable<T>>{
    HashMap<T , Integer> map = new HashMap<>();
    ArrayList<T> data =  new ArrayList<>();

    public void add(T item ){
        data.add(item);
        map.put(item , this.size()- 1);
        upheapify(data.size() - 1);
    }

    private void upheapify( int childIndex) {
        int parentInd = (childIndex - 1)/ 2;
        if(isLarger(data.get(childIndex) , data.get(parentInd)) > 0){
            swap( parentInd , childIndex);
            upheapify(parentInd);
        }
    }
    public void swap(int i , int j ){
        T ith = data.get(i);
        T jth= data.get(j);
        data.set(i , jth);
        data.set(j , ith);
        map.put(ith, j );
        map.put(jth , i );
    }
    //it is called priority queue because element with higher priority get removed first ;
    public T remove(){
        swap(0 , data.size() - 1);
        T rv = this.data.remove(this.data.size()-1);
        downheapifxy(0);
        map.remove(rv);
        return rv;
    }

    private void downheapifxy(int ind) {
        int lc = 2*ind+1;
        int rc = 2*ind+2;
        int mini = ind ;
        if( lc < data.size() && isLarger(data.get(lc) , data.get(mini) ) > 0) mini = lc ;
        if( rc < data.size() && isLarger(data.get(rc) , data.get(mini) ) > 0) mini = rc ;
        if(mini != ind) {
            swap(ind , mini);
            downheapifxy(mini);
        }
    }
    public T get(){
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

    // if t is having higher priority return positive value ;
    public int isLarger(T t,T o){
        return t.compareTo(o);
    }

    public void updatePriority(T pair){
        int index = map.get(pair);
        upheapify(index);
    }

}
