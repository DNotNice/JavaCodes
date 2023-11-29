package com.company.linkedlist;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
//    LL list = new LL(); //size becomes 0 ; , size is initialised ;
//        list.firstinsert(23);
//        list.firstinsert(22);
//        list.firstinsert(21);
//        list.lastInsert(99);
//        list.insert(94,3);
//        list.inssert(2,88);



        DLL list = new DLL(); //size becomes 0 ; , size is initialised ;
        list.FirstInsert(23);
        list.FirstInsert(22);
        list.FirstInsert(21);
        list.LastInsert(99);
        list.LastInsert(19);
        list.deleteAtBeginning();
        list.display();
    }

    // reversing a linked list ;

}
