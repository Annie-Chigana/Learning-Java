// Filename: InchConversion.java
// Written by Annie
// Written on 08/07/2025
/*
- 12 inches in a foot
- 3 feet in a yard
1. Create a class named InchConversion
2. Main method accepts a value in inches from a user and passes the value to two methods
3. One method converts the value from inches to feet
4. the other from inches to yards
*/
package inchconversion;

import java.util.Scanner; 

public class InchConversion {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number in inches: ");
        double num = input.nextDouble();
        
        System.out.println(num + " inches in feet is " + convertToFeet(num));
        System.out.println(num + " inches in yards is " + convertToYard(num));
    }
    public static double convertToFeet(double num){
        return num/12;
        }
    public static double convertToYard(double num){
       return (num/12)/3;
    }
    
}
