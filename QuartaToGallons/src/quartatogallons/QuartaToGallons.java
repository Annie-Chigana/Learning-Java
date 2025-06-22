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
        
        gallons = quartsNeeded/quartsInGallon;
        
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallons");
        
        
    }
    
}
