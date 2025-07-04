// Filename: Percentages.java
// Written by Annie
// Written on 04/07/2025
/*
1. the main method holds two double variables
2. prompt the user for values
3. Pass values to a method called computePercent() that displays two values
4. The first number must be the percentage of the second one
5. Call the method the 2nd time and pass the values in reverse order
*/
package percentages;

import java.util.Scanner;

public class Percentages {

    public static void main(String[] args) {
        
        double num1, num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();
        
        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();
        
        computePercent(num1, num2);
        computePercent(num2, num1);
        
    }
    
    public static void computePercent(double num1, double num2) {
        
        System.out.println("The percentage is " + ((num1/num2)*100));
    }
    
}
