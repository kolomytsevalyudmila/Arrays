
package arraycollremains;

import java.util.ArrayList;
import java.util.Random;


public class ArrayCollRemains {

    
    public static void main(String[] args) {
        
        ArrayList<Integer> coll = new ArrayList<>();
        fillColl(coll, 10);
        for (Integer integer : coll) {
            System.out.println(integer);
        }
        int x = 3;
        remainsColl(coll, x);
        System.out.println("============");
        for (Integer integer : coll) {
            System.out.println(integer);
        }
    }

    private static void fillColl(ArrayList<Integer> coll, int n) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            coll.add(rnd.nextInt(10));
            
        }
    
    }

    private static void remainsColl(ArrayList<Integer> coll, int x) {
        for (int i = 0; i < coll.size(); i++) {
            if(coll.get(i) % x == 0){
                coll.remove(i);
                i--;
            }
            
        }
    
    }
    
}
