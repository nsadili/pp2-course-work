import customuser.*;

public class CustomUserGeneration {
    public static void main(String[] args) {

        try {
            createUser("demo_user", "12345789", new String[] {});
        } catch (InvalidUsernameException e) {
            e.printStackTrace();
        } catch (InvalidPasswordException e) {
            e.getStackTrace();
        } catch (InvalidRoleException e) {
            e.getStackTrace();
        }

    }

    public static void createUser(String username, String password, String[] roles)
            throws InvalidUsernameException, InvalidPasswordException, InvalidRoleException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");

        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");

        if (password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");

        // TODO: roles CANNOT BE null or an empty array
        if(roles == null || roles.length==0) 
            throw new InvalidRoleException("The role field cannot be empty.");

        // PROCESS OF USER CREATION - WE DO NOT CARE ABOUT IT HERE!!!
    }
}

