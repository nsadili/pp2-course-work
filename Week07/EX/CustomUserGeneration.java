package Week07.EX;

import java.io.InvalidClassException;

import javax.management.InvalidAttributeValueException;

public class CustomUserGeneration {
    public static void main(String[] args) {

        try {
            createUser("demo_user", null, new String[] {});
        } catch (InvalidAttributeValueException e) {
            e.printStackTrace();
        } catch (InvalidClassException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    
    public static void createUser(String username, String password, String[] roles)
            throws Exception {
        if (username == null || username.length() < 3)
            throw new Exception("Username can not contain less than 3 symbols");

        if (!Character.isAlphabetic(username.charAt(0)))
            throw new Exception("Username cannot start with non-alphabetical character");

        if (password.length() < 8)
            throw new Exception("The length of the password cannot be less than 8.");

       
        if(roles==null || roles.length==0){
            throw new InvalidAttributeValueException();
        }
        System.out.println("Succesfully Created");

        // PROCESS OF USER CREATION - WE DO NOT CARE ABOUT IT HERE!!!
        System.out.println("SUCCESSFULLY CREATED THE USER");
    }
}
