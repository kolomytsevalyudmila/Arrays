
package arraycountmin;


public class ArrayCountMin {

   
    public static void main(String[] args) {
         int[] myArray = {1,3,3,4,4,5,6,7,9};
         
         System.out.println("Количество неповторяющихся элементов: " + countUnic(myArray));
    }

    private static int countUnic(int[] myArray) {
        int counter = 1;
        
        for (int i = 0; i < myArray.length-1; i++) {
            
            if(myArray[i] != myArray[i+1]) counter++;
            myArray[i] = myArray[i+1];
            
        }
    
        return counter;
    
    }
    
}
