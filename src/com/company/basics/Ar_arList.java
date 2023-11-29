package com.company.basics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Ar_arList {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //2D array list :
        ArrayList<ArrayList<Integer>> list =  new ArrayList<>(); //declared : it is empty right now

        //initialisation :
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>()); // here 3 spaces([],[],[]) are created inside arraylist.
        }
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
              //  list.get(i);means get the array which is at 0th index and .add allows us to enter the value
                // at that index , for loop is running for each row and column .
            }
        }
        System.out.print(list);
    }
}




        // Arraylist in java
   //     ArrayList<Integer> list = new ArrayList<>(10);
//            list.add(1); //            list.add(2);    //            list.add(3);      //            list.add(4);
//            list.add(5); //            list.add(6);    //            list.add(7);     //            list.add(8);
//            list.add(9); //            list.add(10);

        // inputting a list :
//        for(int i=0;i<5;i++){
  //          list.add(sc.nextInt())
        //     }
//        for(int i=0;i<5;i++){ // to print the list
//            System.out.print(list.get(i)+" ");
//        }
  //      System.out.println();

//        System.out.println(list);  2 method to print the  list :

//        System.out.print(list.get(3)); //to print a particular element

 //       System.out.println(list.contains(12));  //check whether the list has a particular element or not :

//       list.set(0,0);  // change an element :
//        System.out.println(list);

//        list.remove(0); // remove an element at particular index
//        System.out.println(list);




//  Using for each loop
//        Scanner sc = new Scanner(System.in);
//  int [][] arr = new int[2][2];
//    for(int i=0;i<arr.length;i++){
//        for(int j = 0 ; j<arr[i].length;j++){
//            arr[i][j]=sc.nextInt();
//        }
//    }
// FOR EACH LOOP
//    for(int[] a:arr){
//        System.out.println(Arrays.toString(a));
//    }
//
// using FOR EACH LOOP IN A DIFF WAY
//    for(int[] a : arr){
//        for(int b : a){
//            System.out.print(b+" ");
//        }
//        System.out.println();
//    }


//printing an array of variable column :
//    public static void main(String[] args) {
//   int [][] arr = {  {1,2,3},
//                     {4,5},
//                     {6,7,8,9}
//                   };
//   for(int row = 0;row<arr.length;row++){
//       for(int column = 0 ; column<arr[row].length;column++){
//           System.out.print(arr[row][column]+" ");
//       }
//       System.out.println();
//  }



// inputting and printing a 2D array :
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column < 3; column++) {
//                arr[row][column] = sc.nextInt();
//            }
//        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column < 3; column++) {
//                System.out.print(arr[row][column]+" ");
//            }
//            System.out.println();
//        }



//        Array passing in function
//    int a[] = {1,2,3};
//        System.out.println(Arrays.toString(a));
//    fund(a);
//        System.out.println(Arrays.toString(a));
//    }
//    static void fund(int b[]){
//        b[0] = 0;
//    }


//inputting and printing character array
//        Scanner sc = new Scanner(System.in);
//        String a[] = new String[5];
//        for(int i = 0;i<5;i++){
//            a[i]=sc.next();
//        }
//        System.out.println(Arrays.toString(a));


//inputting and printing an int array .
//        Scanner sc = new Scanner (System.in);
//        int ar[] = new int [5];
//        for(int i =0;i<5;i++){
//            ar[i]=sc.nextInt();
//        }
// System.out.println(Arrays.toString(ar));

// OR

//        for(int i = 0 ;i<5;i++){
//            System.out.print(ar[i]+" ");
//        }