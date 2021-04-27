
package Assignments;


import java.util.Scanner;

/**
 *
 * @author markosea ycheh
 */
public class passward {

   
    public static void main(String[] args) {
        
     // Creating scanner
        Scanner inPut = new Scanner(System.in);
        
        
        StrengthChecker checker = new StrengthChecker();
        
         System.out.println("Requirements for the password:");
                System.out.println("* Minimum of 8 characters;");
                System.out.println("* At least one special character;");
                System.out.println("* At least one digit;");
                System.out.println("* At least one lowercase;");
                System.out.println("* At least one uppercase;");
                System.out.println("* No spaces.");
        
        // Ask user to input password
        System.out.println("Enter Password: ");
        // Get the password
        String password = inPut.nextLine();
        
        // Check the password
        if (checker.checkForPassword(password)){
            System.out.println("Perfect!!!");
        }
        else {
            int check = 1;
            while (check == 1){
                
                System.out.print("Try again: ");
                // Get the password
                password = inPut.nextLine();
                if (checker.checkForPassword(password)){
                    check = 0;
                    System.out.println("Perfect! ");
                }//close if
            }//close while
        }//close else
    }//close main class
}//close  class
 
    

