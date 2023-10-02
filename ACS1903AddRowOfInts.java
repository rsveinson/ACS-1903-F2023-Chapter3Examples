
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  add rows of ints
 * 
 * Description: add a bunch of rows of ints
 *              keep going until quit is chosen
 **********************************************************************/

// import statements go here
// comment them out when you don't need them
 import java.util.Scanner;
 import javax.swing.JOptionPane;

 // after you duplicate the project don't forget to change the name of the 
 // puboic class
public class ACS1903AddRowOfInts {
    public static void main(String[] args) {
    // ****** Constants *****
    
    // ***** Variables *****
                   
        Scanner scanner = new Scanner(System.in); 
        
        char yesNo = ' ';
        int n = 0;              // entered
        int sum = 0;            // sum of a row of ints
    
    // ***** get some input from the keyboard *****
      
    // ***** Processing *****
    
        
        
        System.out.println("Add up a list of numbers? y/n");
        yesNo = scanner.next().charAt(0);
        //System.out.println(yesNo);

        while(yesNo == 'y' || yesNo == 'Y'){
            
            // pre loop stuff 
            sum = 0;
            
            System.out.println("enter the numbers, 0 to end");
            n = scanner.nextInt();
            //System.out.println(n);

            while(n != 0){
                sum += n;
                
                n = scanner.nextInt();
            }// end while n !=0
            
            System.out.println(sum);
          
            System.out.println("Add up another list of numbers? y/n");
            yesNo = scanner.next().charAt(0);
        }// end while
           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
