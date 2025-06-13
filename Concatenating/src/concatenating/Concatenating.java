package concatenating;

public class Concatenating {

    public static void main(String[] args) {
       
        //Declare a variable
        int date = 5;
        //Without Concatenating
        System.out.println("-----No Concatenating-----");
        System.out.print("Bills are sent on day ");
        System.out.print(date);
        System.out.println(" of the month");
        System.out.print("Next bill: October ");
        System.out.println(date);
        
        //with concatenating
        System.out.println("-----Concatenating-----");
        System.out.println("Bills are sent on day " + date + " of the month");
        System.out.println("Next bill: October " + date);
    }
    
}
