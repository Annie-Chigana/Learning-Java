//Filename QuartsToGallons.Java
//Written by Annie
//Written on 22/06/2025
package quartatogallons;

import java.util.Scanner;

public class QuartaToGallons {

    public static void main(String[] args) {
        
        float quartsInGallon = 4;
        //float quartsNeeded = 18;
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of quarts needed: ");
        float quartsNeeded = userInput.nextFloat();
        
        float gallons;
        float gallonsRemainder;
        
        gallons = quartsNeeded/quartsInGallon;
        gallonsRemainder = quartsNeeded%quartsInGallon;
        
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallons and " + gallonsRemainder + " quarts");
        
        
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
