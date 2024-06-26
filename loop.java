
package javaproject;

import java.util.Scanner;


public class loop {
    
    
    public static void main(String []args){       
       
         Scanner input = new Scanner(System.in);
        int a = 0, b = 1, result = 0, nth;
        System.out.print("nth of fibonacci number = ");
        nth = input.nextInt();
        System.out.print(a+ " ");
        for (int i = 1; i < nth; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        System.out.println();
        System.out.println("And the " +nth + "th " + "fibonacci number is = "+result);
    }
}