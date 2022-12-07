
package array;
import java.util.Arrays;
import java.util.Random;

public class Array {

    
    public static void main(String[] args) {
      
        int[] m = {1, 2, 3, 4, 5};
        
        System.out.println(Arrays.toString(m));//кеш
        
        int[] m2 = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < m2.length; i++){
            m2[i] = rnd.nextInt(10);
            
            System.out.println(Arrays.toString(m2));
            
            Arrays.sort(m2);
            System.out.println(Arrays.toString(m2));
            
        }
    }
    
}
