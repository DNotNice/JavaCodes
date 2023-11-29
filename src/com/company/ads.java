package com.company;

import java.util.*;
import java.io.*;

class Programmer {}
class Mathematician {}

class main {
    public static void count(ArrayList listOfObjects) {
        int count1 = 0, count2 = 0;
        System.out.println("listOfObjects.size() = " + listOfObjects.size());
        for (int i = 0; i < listOfObjects.size(); ++i) {
            if (listOfObjects.get(i) instanceof Programmer) {
                System.out.println("Programmer: " + count1);
                ++count1;
            } else if (listOfObjects.get(i) instanceof Mathematician) {
                System.out.println("Mathematician: " + count2);
                ++count2;
            }
        }

        System.out.println("Programmer: " + count1);
        System.out.println("Mathematician: " + count2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Object> listOfObjects = new ArrayList();

        System.out.println("listOfObjects.size() = " + listOfObjects.size());
        for (int i = 0; i < n; i++) {
            String objectType = input.nextLine();

            if (objectType.equals("Programmer")) {
                  Programmer pro = new Programmer();
                listOfObjects.add(pro);
            } else if (objectType.equals("Mathematician")) {
                Mathematician mat = new Mathematician();
                listOfObjects.add(mat);
            }

            System.out.println("listOfObjects.size() = " + listOfObjects.size());
        }

        count(listOfObjects);
    }
}
