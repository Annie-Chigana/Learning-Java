//Filename RandomNumbers.Java
//Written by Annie
//Written on 22/06/2025
package randomnumbers;

import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        
        int userNum;
        int Min = 1;
        int Max = 5;
        
        int random = Min + (int)(Math.random()*Max);
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a random number between 1 to 5: ");
        
        userNum = userInput.nextInt();
        
        System.out.println("The random number is: " + random + " You entered " + userNum);
        
        //Miles conversion
        float inches = 63360;
        float feet = 5280;
        float yards = 1760;
        
        float miles;
        
        float mileInInch;
        float mileInFeet;
        float mileInYard;
        
        Scanner input2 = new Scanner(System.in);
        System.out.println ("Enter number of miles: ");
        
        miles = input2.nextFloat();
        
        mileInInch = inches * miles;
        mileInFeet = feet * miles;
        mileInYard = yards * miles;
        
        System.out.println(miles + " Miles in inches is: " + mileInInch);
        System.out.println(miles + " Miles in feet is:" + mileInFeet);
        System.out.println(miles + " Miles in yards is:" + mileInYard);
        
    }
    
}
