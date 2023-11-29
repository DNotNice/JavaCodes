package com.company.Collections.Hashmaps.GenericHashMap;
public class hashTable<K,V> {
    private class HTpair{
       K key ;
       V value;
       HTpair(K key , V value){
           this.key = key ;
            this.value = value;
       }

       public boolean equals(Object other){
           HTpair pb =(HTpair) other ;
           return this.key.equals(pb.key);
       }
       public String toString(){
           return "{ "+ this.key + "-" + this.value + " }";
       }
    }
    public static final  int DEFAULT_CAPACITY = 10 ;
    private liknedlis<HTpair>[] ArrayBucket ;
    private int size = 0 ;
    public hashTable(){
        this(DEFAULT_CAPACITY);
    }
    public hashTable(int capacity) {
        this.ArrayBucket =(liknedlis<HTpair>[]) new liknedlis[capacity];
        this.size = 0 ;
    }
    public void put(K key , V value) throws  Exception{
        int bi = hashFunction(key);
         liknedlis<HTpair> bucket = this.ArrayBucket[bi];
           HTpair pta = new HTpair(key,value);
            if(bucket == null) {
            bucket = new liknedlis<>();
            bucket.lastInsert(pta);
            this.ArrayBucket[bi] = bucket;
            this.size++;
            }
            else {
                int findAt  =   bucket.find(pta);
                if(findAt == -1) {
                    bucket.lastInsert(pta);
                    this.size++;
                }
                else{
                   HTpair pat = bucket.getAt(findAt); //made another func because that get has return type as node;
                    pat.value = value;
                }
            }
            double lambda = (this.size  * 1.0)/this.ArrayBucket.length;
            if(lambda > 2)rehash();

    }
    private void rehash()throws Exception {
        liknedlis<HTpair>[] oba  = this.ArrayBucket;
        this.ArrayBucket = (liknedlis<HTpair>[]) new liknedlis[2*oba.length];
        this.size = 0 ;
        for(liknedlis<HTpair> obo : oba){
            while(obo !=null && !obo.isEmpty()){
                HTpair pair = obo.FirstDeletion();
                this.put(pair.key , pair.value);
            }
        }
    }
    public void display() throws  Exception{
        for(liknedlis<HTpair>  bucket : this.ArrayBucket){
            if( bucket!=null  && !bucket.isEmpty()){
                bucket.display();
            }
            else {
                System.out.println("NULL");
            }
        }
        System.out.println();
    }
    public V get(K key) throws  Exception{
        int bi = hashFunction(key);
         liknedlis<HTpair> bucket = this.ArrayBucket[bi];
         HTpair tbs = new HTpair(key, null);
         if(bucket == null) return null ;
         else{
             int ind = bucket.find(tbs);
             if(ind == -1) return null;
             else {
                 HTpair ans = bucket.getAt(ind);
                 return ans.value;
             }
         }
    }
    public V remove (K key) throws  Exception{
        int bi = hashFunction(key);
        liknedlis<HTpair> bucket = this.ArrayBucket[bi];
        HTpair tbs = new HTpair(key, null);
        if(bucket == null) return null ;
        else{
            int ind = bucket.find(tbs);
            if(ind == -1) return null;
            else {
                HTpair ans = bucket.getAt(ind);
                bucket.delete(ind);
                this.size-- ;
                return ans.value;
            }
        }
    }

    private int hashFunction(K key) {
      int hc = key.hashCode();
      hc= Math.abs(hc);
      int bi = hc%ArrayBucket.length;
      return bi ;
    }


}
