package com.company.Collections.Hashmaps.GenericHashMap;

public class genLLclient {
    public static void main(String[] args) throws  Exception {
            hashTable< String , Integer>  map = new hashTable<>(5);
            map.put("UK",175);
            map.put("INDIA", 101);
            map.put("USA",112);
            map.put("CHINA",333);
            map.display();
           map.put("SWEDEN", 100);
           map.display();
          map.put("INDIA",111);
          map.display();
    }
}
