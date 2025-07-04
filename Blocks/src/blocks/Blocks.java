// Filename: Blocks.java
// Written by Annie
// Written on 04/07/2025
package blocks;

public class Blocks {

    public static void main(String[] args) {
        /*int aNumber = 10;
        System.out.println("In outer block, aNumber is " + aNumber);
        
        
        {//Starting an inner bloack
            int anotherNumber = 512;//variable declared in inner block
            System.out.println("In inner block, aNumber is " + aNumber + " and another number is  " + anotherNumber);
            
        }//end of inner block
        
        //anotherNumber is out of scope
        System.out.println("In outer block, aNumber is " + aNumber);
*/
        System.out.println("Demostrating block scope");
        
        int x = 1111;
        System.out.println("In first block x is " + x);
        
        {
            int y = 2222;
            System.out.println("In second block x is " + x);
            System.out.println("In second block y is " + y);
        }
        
        {
            int y = 3333;
            System.out.println("In third block x is " + x);
            System.out.println("In third block y is " + y);
            demoMethod();
            System.out.println("After method x is " + x);
            System.out.println("After method block y is " + x);
        }
        
        System.out.println("At the x is " + x);
        
    }
    
    public static void demoMethod()
    {
        int x = 8888, y = 9999;
        System.out.println("In demoMethod x is " + x);
        System.out.println("In demoMethod block y is " + y);
    }
    
}
