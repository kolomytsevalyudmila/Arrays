
package com.mycompany.symmetryarray;


public class SymmetryArray {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 6, 3, 2, 1};
        
        if (symmetry(myArray)) System.out.println("Симметричны");
        else System.out.println("Не симметричны");
    }

    private static boolean symmetry(int[] myArray) {
        
        for (int j = 0; j < (myArray.length)/2; j++) {
            if (myArray[j] != myArray[myArray.length-1-j]) 
                return false;  
        }  
        return true;
    }
}
