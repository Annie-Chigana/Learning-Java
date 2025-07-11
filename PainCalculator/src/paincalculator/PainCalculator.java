// Filename: PaintCalculator.java
// Written by Annie
// Written on 08/07/2025
/*
***A gallon covers 350 square feet of wall space
1. Main method prompts user for length, width, and height of rectengular room
2. Pass the values to a method that:
- Calculate the wall area for a room
- Passes the calculated area to another method, returns the of gallons of paint needed
- Display the number of gallons needed
- Computes the price based on a paint price of $32 per gallon
- Return the price to the main method
- Main method displays the final price
*/
package paincalculator;

import java.util.Scanner;
//PaintCalculator
public class PainCalculator {

    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the lenght of the rectengular room: ");
       double length = input.nextDouble();
       
       System.out.println("Enter the Width of the rectengular room: ");
       double width = input.nextDouble();
       
       System.out.println("Enter the height of the rectengular room: ");
       double height = input.nextDouble();
       
       calculateArea(length, width, height);
    }
    
    public static void calculateArea(double legnth, double width, double height) {
        
    }
    
}
