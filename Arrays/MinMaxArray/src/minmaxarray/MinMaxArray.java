
package minmaxarray;


public class MinMaxArray {

    
    public static void main(String[] args) {
        int[] myArray = {1,5,9,8,2,3,6,7,8};
        
        Result res = new Result();
        
        
        resultNumb(myArray, res);
        System.out.println("Максимальное значение: " + res.Max);
        System.out.println("Минимальное значение: " + res.Min);
    }

    private static int resultNumb(int[] myArray, Result res) {
        res.Min = res.Max = myArray[0];
        
        
        
        
        for (int i = 0; i < myArray.length-1; i++) {
            if(res.Min > myArray[i])
            {
                res.Min = myArray[i];
                
            }
            if(res.Max < myArray[i])
            {
                res.Max = myArray[i];
                
            }
            
        }
        return 0;
        
    }
}
    
    class Result{
        int Min;
        int Max;
    }

