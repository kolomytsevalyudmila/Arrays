
package arrayunic;

import java.util.Arrays;

public class ArrayUnic {

    
    public static void main(String[] args) {
        int[] myArray = {1,2,3,3,4,5};
        
        System.out.println("Количество неповторяющихся элементов: " + (unicArr(myArray)));
     }

    private static int unicArr(int[] myArray) {
        
        int counter = 1;
        for (int i = 0; i < myArray.length-1; i++) {
            if(myArray[i] != myArray[i+1]) counter++;
            myArray[i] = myArray[i+1];
        }
        return counter;
    }

    
}
