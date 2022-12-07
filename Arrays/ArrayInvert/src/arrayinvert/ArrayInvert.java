
package arrayinvert;

import java.util.Arrays;


public class ArrayInvert {

    
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        
        
        System.out.println("Инвертированный массив: " + Arrays.toString(invertAr(myArray)));
}

private static int[] invertAr(int[] myArray){
        int tmp;
        for (int i = 0; i < myArray.length/2; i++) {
            tmp = myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = tmp;
        
        }
    
        return myArray;
    
    }
}