
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  process words
 * 
 * Description: process words i.e. print each char
 *  until stop is entered
 **********************************************************************/

// import statements go here
// comment them out when you don't need them
 import java.util.Scanner;
 import javax.swing.JOptionPane;

 // after you duplicate the project don't forget to change the name of the 
 // puboic class
public class ACS1903ProcessWords {
    public static void main(String[] args) {
    // ****** Constants *****
    
    // ***** Variables *****
                   
        Scanner scanner = new Scanner(System.in);
        String word = "";
        char ch = ' ';
    
    // ***** get some input from the keyboard *****
      
    // ***** Processing *****
    
        System.out.println("enter words, stop to quit");
        word = scanner.next();
        
        while(!word.equalsIgnoreCase("stop")){
            //System.out.println(word);
            
            for(int i = 0; i < word.length(); i++){
                ch = word.charAt(i);
                System.out.println(ch);
                
                /* any sort of processing can go
                 * here
                 */
            }//end for int i
            
            System.out.println("end of processing for " + word);
            
            word = scanner.next();
        }// end word not stop

           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
