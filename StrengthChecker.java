
package Assignments;



/**
 *
 * @author Markose Aycheh
 */
public class StrengthChecker { 
    

 public boolean checkForPassword(String password){
        
        return passLength(password) && checkForSpaces(password) && digitCheck(password) && upperCaseCheck(password) &&
                lowerCaseCheck(password) && checkForSpecChar(password);
        
    } // close method
    
    public boolean checkForSpecChar(String password){
        String req = ".*[$%^&*#@!].*";
        if (password.matches(req)){
            
            return true;
        } else {
            System.out.println("At least one Special charactor such as (!@#$%^&*) are required!\n");          
            return false;
        }//close else
    }//close checkForSpacChar
    
    public boolean checkForSpaces(String password){
        String req = ".*\\s.*";
        if (password.matches(req)){
            System.out.println("No Spaces allowed!\n");    
            return false;
        } else {
            return true;
        }//close else
    }//close checkForSpaces
    
    public boolean upperCaseCheck(String password){
        
        String req = ".*\\p{Upper}.*";
        if(password.matches(req)){
            return true;
        } else {
            System.out.println("must include at least 1 uppercase!\n");
            return false;
        }
    }
    
    public boolean lowerCaseCheck(String password){
        
        String req = ".*\\p{Lower}.*";
        if(password.matches(req)){
            return true;
        } else {
            System.out.println("Must include at least 1 lowercase!\n");
            return false;
        }//close else
    }//close lowerCaseCheck
    
    public boolean digitCheck(String password){
        
        String req = ".*\\d.*";
        
        if(password.matches(req)){
            return true;
        } else {
            System.out.println("Must include at least 1 digit!\n");
            return false;
        }//close else
    }//close digitChecker
    
    public boolean passLength(String password){
        //Check password length.
        if (password.length() > 8){
            return true;
        } else {
            System.out.println("To short!!\nHas to be at least 9 characters!\n");
            return false;
        }//close else
    }//close passLength
    
} // close class
