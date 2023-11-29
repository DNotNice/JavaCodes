package com.company.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Strngs {
    public static void main(String[] args) {
        String s = "Uo";
        s.toLowerCase(); // it is ignored because the original string is not changed because strings are immutable
        // to convert it into lower case assign variable to it
        s = s.toLowerCase();

        System.out.println(s);
    }
}
//        if(s.length() == 0){
//            return true;
//        }

//        sr.toLowerCase();
//        for(int i = 0 ; i <= sr.length()/2 ; i++){
//            char start = sr.charAt(i) ;
//            char end = sr.charAt(sr.length() - 1 - i);
//            if(start != end){
//                return false ;
//            }
//        }
//        return true ;
//
//
//    }
//    static String compression1(String sr){
//        String ar = sr.substring(0,1);
//        for(int i = 1 ; i < sr.length() ; i++){
//            if(sr.charAt(i) != sr.charAt(i-1)){
//                ar+=sr.charAt(i);
//            }
//        }
//        return ar;
//    }
//    static String compression2(String sr){
//        String ar =sr.charAt(0) + ""; //can also be used to add a character to a declared String :
//        int count = 1;
//        for(int i = 1 ; i<sr.length(); i++) {
//            if (sr.charAt(i) == sr.charAt(i - 1)) {
//                count++;
//            } else {
//                if (count > 1) {
//                    ar += count;
//                    count = 1;
//                }
//                ar += sr.charAt(i);
//            }
//        }
//            if(count > 1){
//                ar += count;
//            }
//
//
//        return ar;
//    }
//}
//    static boolean palind(String str){
//        if(str.length() == 0){
//            return true ;
//        }
//       str.toLowerCase();
//        for(int i = 0 ; i <= str.length()/2 ; i++){
//            char start = str.charAt(i) ;
//            char end = str.charAt(str.length() - 1 - i);
//            if(start != end){
//                return false ;
//            }
//        }
//        return true ;
//    }


// String basics :

//        String a = "Devansh";
//        String b = "Devansh";
//        // checks if both the reference variables points to the same object or not ;
//        System.out.println(a==b);
//        String c = new String("Devansh");
//        String d = new String("Devansh");
//        //checks if the value of both the reference variables is equal or not :
//        System.out.println(c.equals(d));



//        // String concatenation :
//        System.out.println("a" + 1);
//        System.out.println("Devansh" + 'a');
//        System.out.println((char)('c' + 1));
//        System.out.println("Devansh" + Arrays.toString(new int[]{1}));
//        //here java calls toString() to covnert Arraylist into String :
//        System.out.println("Devansh" + new ArrayList<>());
//        //here java calls toString() to covnert Integer into String :
//        System.out.println("Devansh" + new Integer(56));


//        String st = "";
//        for(int i = 0 ; i < 26 ; i++){
//            char ch = (char) ('a' + i);
//            st+= ch ;
//        }
//        System.out.println(st);

    //String Builder :
//    StringBuilder builder = new StringBuilder();
//        for(int i = 0 ; i <26 ; i++){
//        char ch = (char)('a' + i);
//        builder.append(ch);
//        }
//        System.out.println(builder); // can also use sout(builder.toString())
//CHECK STRINGBUILDER METHODS :