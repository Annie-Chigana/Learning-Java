//Filename ParadiseInfo2.Java
//Written by Annie
//Written on 24/06/2025
package paradiseinfo;

import java.util.Scanner;

public class ParadiseInfo2 {

    public static void main(String[] args) {
       
        //The minimun price allowed for discount
        double price;
        //Discount rate
        double discount;
        //Munimun savings
        double savings;
        //Scanner object used for user input
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt user for minimum discount price
        System.out.print("Enter cutoff price for discount >> ");
        price = keyboard.nextDouble();
        
        //Prompt user for discount rate\
        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();
        
        //Insert a call to computeDiscountInfo()
        //price and discount values are passed to th method
        //The methods returns the minimum saved that will be stored in savings
        savings = computeDiscountInfo(price, discount);
        
        //Display the savings information
        displayInfo();
        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of  " + discount + " percent");
        System.out.println("That's a saving of at least $ " + savings);
    }
    
    public static void displayInfo()
    {
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }
    //computeDiscountInfo method that accepts two doubles and returns a double
    public static double computeDiscountInfo(double price, double discountRate)
    {
        
        double savings;
        savings = price + discountRate/100;
        return savings;
    }
    
}
