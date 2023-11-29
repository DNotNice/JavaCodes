package com.company.SegTree;

public class segTreeClient {
    public static void main(String[] args) {
        int[] arr = {3, 8, 7, 6, -2, -8, 4, 9};
        segtree st = new segtree(arr);
//        st.display();
//        System.out.println("****");
//        System.out.println("sum is" + st.query( 2,6)) ;
        st.update(3,14);
        st.display();
        System.out.println("****");
        System.out.println("sum is " + st.query( 2,6)) ;

    }

}
