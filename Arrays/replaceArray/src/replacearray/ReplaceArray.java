
package replacearray;

import java.util.Arrays;


public class ReplaceArray {

   
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reArray(myArray)));
        System.out.println(Arrays.toString(avArray(myArray)));
                
    }

    private static int[] reArray(int[] myArray) {
        int tmp = myArray[myArray.length-1];
        for (int i = myArray.length-2; i >= 0; i--) {
            myArray[i + 1] = myArray[i];
        }
        myArray[0] = tmp;
        return myArray;
    
    }

    private static double[] avArray(int[] myArray) {
        double[] rez = new double[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            rez[i] = myArray[i];
        }
        
        double tmp1, tmp2 = rez[0];
        for (int i = 1; i < rez.length-1; i++) {
            tmp1 = rez[i];
            rez[i] = (tmp2 + rez[i+1])/2.;
            tmp2 = tmp1;
        }
        return rez;
    }
    
}
