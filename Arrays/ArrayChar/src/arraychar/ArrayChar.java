
package arraychar;

import java.util.Scanner;


public class ArrayChar {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(charNumber(n));
        
        String s =  Integer.toString(n);
        char[] myArray = s.toCharArray();
        for (char c : myArray) {
            System.out.println(c);
            
        }
    }

    private static String charNumber(int n) {
        
        int numb = 0;
        StringBuilder sb = new StringBuilder();
        
        while(n != 0){
            
            numb = n % 10;
            n /= 10;
            sb.append(numb);
            sb.append(',');
            
        }
        return sb.reverse().toString();
    }
    
}
