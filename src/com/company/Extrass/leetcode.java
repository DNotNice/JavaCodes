package com.company.Extrass;
import java.util.*;

public class leetcode {
    public static void main(String[] args) {
    String s = "aab";
        System.out.println(reorganizeString(s));

    }

    private static String reorganizeString(String s) {
        HashMap<Character , Integer> hashMap = new HashMap<>();
        for(int i =  0 ;i <s.length();i++) hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        ArrayList<Integer> arr = new ArrayList<>(hashMap.values());
        arr.sort(Collections.reverseOrder());
        return null;
    }

    public static int[] sumOfDistance(int[] nums){
        HashMap<Integer,List<Integer>> j = new HashMap<>();
        for(int i =0 ;i<nums.length ;i++) {
            if(!j.containsKey(nums[i])) {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                j.put(nums[i],l);
            }
            else {
                List<Integer>list = j.get(nums[i]);
                list.add(i);
            }
        }
        int[] arr= new int[nums.length];
        if(j.size() == nums.length) return arr;
        else {
            for(  Map.Entry<Integer, List<Integer>>  map: j.entrySet()) {
                List<Integer> temp = map.getValue();
                if (temp.size() == 1) arr[temp.get(0)] = 0;
                else {

                    for(int i = 0 ; i<temp.size();i++){
                        int val = temp.get(i);
                        for(int js = 0 ; js < temp.size();js++){
                            if( i !=js ) arr[val]+= Math.abs(val-temp.get(js));
                        }
                    }
                }
            }
        }
        return arr;

    }
    public static void primeInDiagonal(int[][] nums){
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0; j < nums[0].length ; j++){
                if(i==j || j==nums.length-i-1) System.out.println(i+" "+j+"  "+ nums[i][j]);
            }
        }
    }
    public static int OptimalPartitionofString(String s ){
        int count = 1;
        HashMap<Character , Integer> hmap = new HashMap<>();
        hmap.put(s.charAt(0),1);
        for(int i = 1 ; i < s.length() ; i ++){
            if(hmap.containsKey(s.charAt(i))){
                count++;
                hmap.clear();
                hmap.put(s.charAt(i),1);
            }
            else hmap.put(s.charAt(i),1);
        }
        return count;
    }


    public  static  List<String> wordSubsets(String[] words1, String[] words2) {


        List<String> res= new ArrayList<>();
        for(String word : words1){
            if(justCheck(word.toCharArray(),  words2))res.add(word);
        }
        return res ;

    }
   static boolean justCheck(char[] word ,   String[] words2){
        HashMap<Character , Integer> map = new HashMap<>();
        HashMap<Character ,Boolean> lap = new HashMap<>();
       for(String wordp : words2){
           char[] wod = wordp.toCharArray();
           for(Character cp : wod){
               if(!map.containsKey(cp)){
                   lap.put(cp, true);
                   map.put(cp , 1);

               }
           }
       }
      int val = 0 ;
        for(char cp : word){
            if(map.containsKey(cp) && lap.get(cp)){
               val++;
                lap.put(cp , false);
            }
        }
       return val == map.size();

   }

    static int primenos(int left , int right ){
        int prime = 0;
        for(int i = left ; i <= right ; i++){
            int  count = Integer.bitCount(i);
            if(count == 2 || count == 3 || count == 5 || count == 7 || count == 11 || count == 13 || count ==23|| count ==17
            || count ==19){
                prime++ ;
            }
           // boolean ans = isprime(i);
//            if(ans){
//                prime++;
//            }

        }
        return prime ;


    }
    static boolean isprime(int n){
        for(int i = 2 ; i * i <= n ;i++ ){
            if(n%i == 0 ){
                return false ;
            }
        }
        return true;
    }

    static void nocomple(int n){
        int m  = (int) ((Math.log(n)/Math.log(2))+1);
        int x =(int) (Math.pow(2,m)- 1); // creating a mask of 1's ;
        System.out.println(x ^ n);
    }
    static  int hammingdistance(int x, int y ){
        int t = Math.max(x , y) ;
        int count = 0  ;
        while( t > 0){
            if((x & 1) != (y & 1)  ){
                count ++ ;
            }
            x>>=1;
            y>>= 1;
            t>>= 1;

        }
       return count ;
    }
     static void countingibts ( int n) {
         int [] arr = new int[n+1];
         arr[0] = 0 ;
         int j = 0 ;
         int c = 0 ;
         for(int i = 1;i <= n  ; i++){
             c++ ;
             if(i == (int) Math.pow(2 , j)){
                 j++;
                 c = 0 ;
             }
             arr[i] = arr[c] + 1;

         }
         System.out.println(Arrays.toString(arr));
    }
}
