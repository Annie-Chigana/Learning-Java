// Filename: Blocks.java
// Written by Annie
// Written on 04/07/2025
package blocks;

public class Blocks {

    public static void main(String[] args) {
        int aNumber = 10;
        System.out.println("In outer block, aNumber is " + aNumber);
        
        
        {//Starting an inner bloack
            int anotherNumber = 512;//variable declared in inner block
            System.out.println("In inner block, aNumber is " + aNumber + " and another number is  " + anotherNumber);
            
        }//end of inner block
        
        //anotherNumber is out of scope
        System.out.println("In outer block, aNumber is " + aNumber);
    }
    
}
