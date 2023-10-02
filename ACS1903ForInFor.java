
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  for in for
 * 
 * Description: for loop nested in a for loop
 **********************************************************************/

// import statements go here
// comment them out when you don't need them
 import java.util.Scanner;
 import javax.swing.JOptionPane;

 // after you duplicate the project don't forget to change the name of the 
 // puboic class
public class ACS1903ForInFor {
    public static void main(String[] args) {
    // ****** Constants *****
    
    // ***** Variables *****
                   
        Scanner scanner = new Scanner(System.in);        
    
    // ***** get some input from the keyboard *****
      
    // ***** Processing *****
    
        for(int i = 0; i < 10; i++){
            System.out.println("outer interations " + i);
            
            for(int j = 0; j < 4; j++){
                System.out.println("\tinner iteration " + j);
            }// end for j
        }// end for i

           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
