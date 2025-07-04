// Filename: NumbersDemo.java
// Written by Annie
// Written on 04/07/2025
/*
1. Main method holds two integer variables
2. Promp user for the values
3. Pass each value to methods named:
   - displayTwiceTheNumber()
   - displayNumberPlusFive()
   - displayNumberSquared()
4. Each method must perform the task the name implies
*/
package numbersdemo;

import java.util.Scanner;

public class NumbersDemo {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the first number: ");
        num1 = input.nextInt();
        
        System.out.println("Please enter the second number: ");
        num2 = input.nextInt();
        
      displayTwiceTheNumber(num1, num2);
      displayNumberPlusFive(num1, num2);
      displayNumberSquared(num1, num2);
    }
    
    public static void displayTwiceTheNumber(int num1, int num2) {
        
        System.out.println("Twice of the first number is: " + (num1*2));
        System.out.println("Twice of the second number is: " + (num2*2));
        
    }
    
    public static void displayNumberPlusFive(int num1, int num2) {
        
        System.out.println("The first number plus five is : " + (num1+5));
        System.out.println("The second number plus five is : " + (num2+5));
    }
    
    public static void displayNumberSquared(int num1, int num2) {
        System.out.println("The first number squared is: " + (Math.pow(num1, 2)));
        System.out.println("The second number squared is: " + (Math.pow(num2, 2)));
    }
}
