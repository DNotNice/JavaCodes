import java.util.HashMap;
import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashMap<Character, Integer> hmap = new HashMap<>();
        String s=  sc.nextLine();
        int start  = 0;
        hmap.put(s.charAt(start) , 1);
        int count = 1;
        for(int i = 1 ; i < s.length(); ++i){
            if(s.charAt(i) == s.charAt(start)){
                count++;
                if(count > hmap.get(s.charAt(start))) hmap.put(s.charAt(start) , count);
            }
            else{
                count = 1;
                start = i;
                if(!hmap.containsKey(s.charAt(start))) hmap.put(s.charAt(i), count);
            }
        }
        int maxVal = Integer.MIN_VALUE;

        for( int val : hmap.values()) maxVal = Math.max(maxVal , val);
        System.out.println(maxVal);
    }
}
