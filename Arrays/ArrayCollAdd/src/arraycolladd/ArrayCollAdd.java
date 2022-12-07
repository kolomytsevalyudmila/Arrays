
package arraycolladd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ArrayCollAdd {

    
    public static void main(String[] args) {
        System.out.print(" первая коллекция ");
        ArrayList<Integer> first = new ArrayList<>();
        firstColl(first, 5);
        for (Integer integer : first) {
            System.out.print(integer);
            
        }
        System.out.print(" вторая коллекция ");
        ArrayList<Integer> second = new ArrayList<>();
        secondColl(second, 5);
        for (Integer integer : second) {
            System.out.print(integer);
            
        }
        System.out.print(" объединение коллекций ");
        ArrayList<Integer> unification = new ArrayList<>(first);
        unification.addAll(second);
        Collections.sort(unification);
        for (Integer integer : unification) {
            System.out.print(integer);
            
        }
                
    }

    private static void firstColl(ArrayList<Integer> first, int i) {
        Random rnd = new Random();
        for (int j = 0; j < i; j++) {
            first.add(rnd.nextInt(5));
        }
    }

    private static void secondColl(ArrayList<Integer> second, int i) {
        Random rnd = new Random();
        for (int j = 0; j < i; j++) {
            second.add(rnd.nextInt(10));
        }
    }
    
}
