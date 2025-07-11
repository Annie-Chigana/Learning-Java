// Filename: SpaService.java
// Written by Annie
// Written on 08/07/2025
package spaservice;

import java.util.Scanner;

public class SpaService {
    
    private String serviceDescription;
    private double price;
    
    
    
    public void setServiceDescription(String service) {
        serviceDescription = service;
    }
    public void setPrice(double servicePrice) {
        price = servicePrice;
    }
    public String getServiceDescription() {
        return serviceDescription;
    }
    public double getPrice() {
        return price;
    }
    public class CreateSpaServices {
        public static void main(String[] args) {
            
        String service;
        double price;
         
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a service >> ");
        service = keyboard.nextLine();
        
        System.out.println("Enter a price >> ");
        price = keyboard.nextDouble();
        
        firstService.setServiceDescription(service);
        firstService.setPrice(price);
        
        keyboard.nextLine();
        System.out.println("Enter a service >> ");
        service = keyboard.nextLine();
        
        System.out.println("Enter a price >> ");
        price = keyboard.nextDouble();
        
        secondService.setServiceDescription(service);
        secondService.setPrice(price);
        
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
 
        }
    }
    
}
