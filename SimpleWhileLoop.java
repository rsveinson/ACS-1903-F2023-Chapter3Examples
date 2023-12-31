
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Simple event control while loop
 * 
 * Description: A really simple event controlled while loop
 **********************************************************************/

// import statements go here
import java.util.Scanner;

public class SimpleWhileLoop {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
    
       int n = 0;       // this will act as the control variable of the loop
       
       // counting and suminbg
       int count = 0;
       int sum = 0;
        
        Scanner scanner = new Scanner(System.in);

    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Simple Event Loop");
        System.out.println("****************************\n");
  
    // ***** Processing *****
    
        // pre loop
        count = 0;
        sum = 0;
        
        System.out.println("enter an int, 0 to end.");
        n = scanner.nextInt();
        
        while(n != 0){
            System.out.println("number = " + n);
            
            count++;    // increment count
            sum += n;   // sum n
            
            // we have to updat the control variable to avoid 
            // the dreaded INFINITE LOOP
            System.out.println("enter an int, 0 to end.");
            n = scanner.nextInt(); 
            
            // count++;    // increment count
            // sum += n;   // sum n
        } // end while
        
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
  
        
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
