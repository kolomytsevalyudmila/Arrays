
package arraybubbles;

import java.util.Arrays;


public class ArrayBubbles {

    
    public static void main(String[] args) {
        int[] myArray = {5,3,8,2,9,4,1};
        
        System.out.println(Arrays.toString(myArray));
        System.out.println("Отсортированный массив: " + Arrays.toString(bubbleSort(myArray)));
    }

    private static int[] bubbleSort(int[] myArray) {
        int tmp;
        for (int i = 0; i < myArray.length; i++) {
            
            for (int j = 0; j < myArray.length-1; j++) {
                if((myArray[j]) > myArray[j+1]){
                    tmp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = tmp;
                }
                
            }
            
        }
        return myArray;
    } 
}
