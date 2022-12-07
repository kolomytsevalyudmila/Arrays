
package arrayunicum;

import java.util.ArrayList;


public class ArrayUnicum {

    
    public static void main(String[] args) {
        int[] myArray = {3,9,2,8,7,9,7,6,4,77,9,7,4};
        
        System.out.print("Уникальных значений в массиве: ");
        for (Integer integer : unicArray(myArray)) {
            System.out.print(" " + integer);
        }
        System.out.println("");
    }

    private static ArrayList<Integer> unicArray(int[] myArray) {
        
        ArrayList<Integer> clon = new ArrayList<>() ;
        
        
        for (int i = 0, j; i < myArray.length; i++) {
            for ( j = i + 1; j < myArray.length; j++) {
                if(myArray[i] == myArray[j]){
                    break;
                }
            }
            
            if(j == myArray.length){
                clon.add(myArray[i]);
            }
        }
        return clon;
    
    }
    
}
