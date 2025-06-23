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
        
        System.out.println(userNum == random);
        System.out.println("The random number is: " + random + " You entered " + userNum);
        
        int dif = userNum - random;
        
        System.out.println("The difference between your number and the random number is " + dif);
    }
    
}
