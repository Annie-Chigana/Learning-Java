// Filename: BookStoreCredit.java
// Written by Annie
// Written on 04/07/2025
/*
1. A class that prompts a student for a name and grade point average
2. Pass the values to a method
3. Method displays a message, the message:
   - Uses the student name
   - Echos the grade point
   - computes and displays the credit
*/
package bookstorecredit;

import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter you name: ");
        String name = input.nextLine();
        
        System.out.println("Enter you grade point average: ");
        double grade = input.nextDouble();
        
        storeCredit(name, grade);
        
    }
    
    public static void storeCredit(String name, double grade) {
        
        System.out.println("Name:                " + name);
        System.out.println("Grade Point Average: " + grade);
        System.out.println("Book Store Credit:   " + (grade * 10));
    }
    
}
