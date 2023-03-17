package Week07;
import java.util.Scanner;

public class CustomUserGeneration {
    public static void main( String [] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        try
        {
            username(username);
        }
        catch (InvalidUsernameException exp){
            System.out.println("Error: "+ exp.getMessage());
            exp.printStackTrace();
        }
        
        try
        {
            password(password);
        }
        catch (InvalidPasswordException exp) {
            System.out.println("Error: "+ exp.getMessage());
            exp.printStackTrace();
        }
    }
    public static void username(String inputusername)
        throws InvalidUsernameException{
            if (inputusername == null){
                throw new InvalidUsernameException("Username can not be empty");
            }
            if (!Character.isAlphabetic(inputusername.charAt(0)))
            {
                throw new InvalidUsernameException("In username the first character can not be non-alphabetical character.");
            }

        }
        public static void password(String inputpassword)
        throws  InvalidPasswordException{
            if (inputpassword.length() < 8){
                throw new InvalidPasswordException("Password can not be less than 8");
            }
            if (inputpassword ==  null ){
                throw new InvalidPasswordException("Password can not be empty");
            }
    }
    
    
}