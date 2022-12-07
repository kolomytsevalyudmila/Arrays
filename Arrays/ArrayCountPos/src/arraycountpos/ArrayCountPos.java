
package arraycountpos;


public class ArrayCountPos {

    
    public static void main(String[] args) {
       int x = 3;
       int[] myArray = {1,5,3,7,8,3,9,3,4,3};
       
        System.out.println("Заданное число встречается " + CountArr(myArray, x) + " раз");
    }

    private static int CountArr(int[] myArray, int x) {
        
        int counter = 0;
        
        for (int i = 0; i < myArray.length; i++) {
            
            if(myArray[i] == x) counter++;
            
            
        }
        return counter;
    }
    
}
