//Filename MadLib.Java
//Written by Annie
//Written on 22/06/2025
package madlib;

import java.util.Scanner;

public class MadLib {

    public static void main(String[] args) {
        
        
        Scanner nounInput1 = new Scanner(System.in);
        Scanner nounInput2 = new Scanner(System.in);
        Scanner nounInput3 = new Scanner(System.in);
        
        System.out.println("Enter a noun: ");
        String noun1 = nounInput1.nextLine();
        
        System.out.println("Enter a noun: ");
        String noun2 = nounInput2.nextLine();
        
        System.out.println("Enter a plural noun: ");
        String noun3 = nounInput3.nextLine();
        
        System.out.println("Baa baa black " + noun1);        
        System.out.println("Have you any " + noun2);        
        System.out.println("Yes sir, yes sir three " + noun3 + " full");

    }
    
}
