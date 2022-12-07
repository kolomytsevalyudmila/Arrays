
package arrayunicnumb;


public class ArrayUnicNumb {

    
    public static void main(String[] args) {
        
        int[] myArray = {3,4,6,5,7,5,4,9,2};
        
        System.out.println("неповторяющихся чисел в массиве " + UnicNumb(myArray));
    }

    private static int UnicNumb(int[] myArray) {
        int counter = 1;
        
        for (int i = 0; i < myArray.length - 1; i++) {
            
            if(myArray[i] == myArray[i+1]) 
            {
                myArray[i] = myArray[i+1];
            }
            
            else if(myArray[i] != myArray[i+1])
            { 
                counter++;
            }
            
        }
        return counter;
    }
    
}
