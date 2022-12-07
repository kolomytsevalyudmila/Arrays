
package arraystepbystep;

import java.util.Arrays;


public class ArrayStepByStep {

    
    public static void main(String[] args) {
        int[] myArray = {5,3,8,9,6,5,4,8,9};
        
        System.out.println("отсортированный массив методом перестановки: " + Arrays.toString(stepArray(myArray)));
    }

    private static int[] stepArray(int[] myArray) {
        
        
        for (int min = 0; min < myArray.length; min++) {
            int tmp = min;
            for (int i = min + 1; i < myArray.length; i++) {
                if(myArray[i] < myArray[tmp]) tmp = i;
            }
            int per = myArray[min];
            myArray[min] = myArray[tmp];
            myArray[tmp] = per;
            
        }
    
    
        return myArray;
    
    
    }
    
}
