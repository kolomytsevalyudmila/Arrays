
package arrayremains;

import java.util.Arrays;


public class ArrayRemains {

    
    public static void main(String[] args) {
        int[] myArray = {3,6,8,9,6,5,4,2,7,5,3,4};
        
        
        int n = remainsArray(myArray);
        for (int i = 0; i < n; i++) {
            System.out.print(myArray[i] + " ");
            
        }
    }

    private static int remainsArray(int[] myArray) {
        int x = 3;
        int n = myArray.length;
        
        for (int i = 0; i < myArray.length; i++) {
            
            
            if(myArray[i] % x == 0){
                for (int j = i; j < myArray.length-1; j++) {
                    myArray[j] = myArray[j+1];
                }
                i--;
                n--;
            }
            
        }
        return n;
    
    }
}
