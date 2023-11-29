package com.company.Extrass;
import java.io.*;
import java.util.*;
import java.util.stream.Collector;

public class extras {
    public static void main(String[] args ) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            /// long a = sc.nextLong();
            //  long b   = sc.nextLong() ;;

        }}
//    static int gcd (int x , int y ){
//        int m = Math.min(x, y);
//        int n = Math.max(x , y);
//        while(n % m != 0){
//            int s = n % m ;
//            n = m ;
//            m = s ;
//        }
//        return m ;
//    }


        static int codecheflong ( int a){
            if (a % 4 == 0)
                return a;
            if (a % 4 == 1)
                return 1;
            if (a % 4 == 2)
                return a + 1;

            return 0;
        }
        static int n = 0;
        static int bitweek3 (String p, String arr){
            if (p.length() == 3) {
                return 1;
            }
            int count = 0;
            if (p.length() == 0) {
                p += arr.charAt(0);
            }
            for (int i = 0; i < arr.length(); i++) {

                if (p.charAt(p.length() - 1) != arr.charAt(0)) {
                    p += arr.charAt(0);
                }

                count = count + bitweek3(p, arr.substring(1));
            }
            return count;
        }


        static int bitweek1 ( int start, int goal ){
            int count = 0;
            for (int i = 0; i < 32; i++) {
                int s = start & 1;
                int d = goal & 1;
                if (s != d) {
                    count++;
                }
                start >>= 1;
                goal >>= 1;
            }
            return count;
        }

        static int bitweek2 ( int[] arr){
            int s = arr.length;
            if (s == 1) {
                return arr[0];
            } else {
                while (s != 1) {
                    for (int i = 0; i < s - 1; i++) {
                        arr[i] = (arr[i] + arr[i + 1]) % 10;
                    }
                    s--;
                }
            }
            return arr[0];


        }


        static void codecj ( int x, int y, int z){
            int n1 = y;
            int n2 = z;
            while (n1 % n2 != 0) {
                int r = n1 % n2;
                n1 = n2;
                n2 = r;
            }
            int gcd = n2;
            int lcm = (y * z) / gcd;
            lcm += y;
            int count = x + 1;
            for (int i = x + 1; i <= lcm; i++) {
                if (lcm == z || gcd == z) {
                    System.out.println(-1);
                    break;

                } else if (i % y == 0 && i % z != 0) {
                    System.out.println(i);
                    break;
                } else
                    count++;

            }

        }


        static void codechef ( int n, int x){
            if (x == 0)
                x = 0;
            else if (x % 4 == 0)
                x = 4;
            else
                x = x % 4;
            int m = n;
            int fin = 0;
            int count = (int) (Math.log(m) / Math.log(10));
            //   System.out.println(count);
            int q = (int) (Math.pow(10, count));

            while (q != 0) {
                int s = n / q;
                int p = (int) (Math.pow(s, x));
                p = p % 10;
//         System.out.println(p);
                fin += p;
                fin *= 10;
                n = n % q;
                q /= 10;
            }
            fin /= 10;
            int lib = 0;
            while (fin != 0) {
                int lis = fin % 10;
                lib += lis;
                lib *= 10;
                fin /= 10;

            }
            lib /= 10;
            System.out.println(lib);

            if (lib % 7 == 0)
                System.out.println("Yes");

            else
                System.out.println("No");
        }
        static void gifshp ( int n, int k, int[] a ){
            int sum = 0;
            int l = 0;
            // a = Arrays.sort(a);
            for (int i = 0; i < n; i++) {

                sum += a[i];
                if (sum <= k) {
                    l++;
                }

                if (sum > k) {
                    l--;
                    double temp = (double) Math.ceil(a[i] / 2);
                    if (temp + sum <= k) {
                        System.out.println(++l);
                        break;
                    } else
                        System.out.println(l);
                }
            }

        }
        static void chefswap ( int n, String s){
            char[] a = s.toCharArray();

            int cont = 0;
            if (a[0] <= a[n - 1]) {
                System.out.println("Yes");
            } else {
                for (int i = 0; i < n / 2; i++) {
                    char temp = a[i];
                    a[i] = a[n - 1 - i];
                    a[n - 1 - i] = temp;
                }
                System.out.println(Arrays.toString(a));


                for (int i = 0; i < n - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        System.out.println("NO");
                        break;
                    } else {
                        cont++;
                    }
                }
                if (cont == n - 1) {
                    System.out.println("Yes");
                }
            }
        }
        static void stringrev ( int n, String s){
            char[] r = s.toCharArray();
            Arrays.sort(r);
            System.out.println(String.valueOf(r));
        }


        static String addbin (String a, String b){
            StringBuilder sr = new StringBuilder();
            int j = b.length() - 1;
            int count = 0;
            int l = 0;
            for (int i = a.length() - 1; i >= 0; i--) {
                l = a.charAt(i) - '0';
                if (j >= 0) {
                    l += b.charAt(j) - '0';
                    j--;
                }
                l += count;
                count = l / 2;
                l = l % 2;
                sr.append(l);

            }

            if (count != 0) {
                sr.append(count);
            }

            return sr.reverse().toString();
        }


        static String cApsLock (String n){
            String a = "";
            int upcase = 0;
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) < 97) {
                    upcase++;
                }

            }
            if (upcase == n.length()) {
                n = n.toLowerCase();
                return n;
            } else if (upcase == n.length() - 1 && n.charAt(0) >= 97) {
                a = Character.toUpperCase(n.charAt(0)) + n.substring(1, n.length()).toLowerCase();
                return a;
            }
            return n;
        }
        static int min ( int limit1, int limit2){
            int w = Math.min(limit1, limit2);
            return w;
        }

        // int[] arr = {2,6};
        //  int n = 2;
        //   int ans = operations(arr, n);
        //   System.out.println(ans);


        static int operations ( int[] arr, int n){
            int max = 0;
            int op = 0;
            if (n == 2) {
                return op + 1;
            }

            int m = n;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, arr[i]);
            }

            for (int i = 0; i < m; i++) {
                if (arr[i] != max && arr[i + 1] != max) {
                    arr[i] = arr[i] + arr[i + 1];
                    if (arr[i] == max) {
                        op++;
                    }
                    int x = i;
                    while (x + 1 < m - 1) {
                        arr[x + 1] = arr[x + 2];
                        x++;
                    }
                    m--;
                }

            }

            return op;
        }


        static int[] twosum ( int[] arr, int target){
            int start = 0;
            int end = arr.length - 1;
            if (arr.length == 2 && arr[0] + arr[1] == target) {
                return arr;
            }
            while (start < end) {
                int mid = start + end / 2;
                if (start + end > target) {
                    end++;

                } else if (start + end < target) {
                    start++;
                } else
                    return new int[]{start, end};
            }
            return null;
        }

    }












//        Scanner sc = new Scanner(System.in);
//        int j =0;
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        int c =arr.length;
//        for( int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        int [] arw = new int [2*c];
//        for(int element : arr){
//        arw[j] = element ;
//        j++;
//        }
//        for(int element : arr){
//            arw[j] = element ;
//            j++;
//        }
       // System.out.print(Arrays.toString(arw));

//        while(i!=2*n){
//            if(i<n){
//                System.out.print(arr[i]+" ");
//            }
//            else {
//                i=i-n;
//                System.out.print(arr[i]+" ");
//                i=i+n;
//            }
//            i++;



//   CODE CHEF 158A
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        long count =0;
//        long [] arr = new long [n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0;i<n;i++){
//            if (arr[k] <= arr[i] && arr[i]>0 ){
//                    count++;
//            }
//        }
//        System.out.println(count);
