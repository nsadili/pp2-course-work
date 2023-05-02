package Week07;

import javax.management.relation.RoleList;
import java.util.ArrayList;

public class CustomUserGeneration {
    public static void main(String[] args) {
        try {
            createUser("demo_user", "12345678", new RoleList());
        } catch (InvalidUsernameException e) {
            e.printStackTrace();
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        } catch (InvalidRoleListException e) {
            e.printStackTrace();
        }
    }

    public static void createUser(String username, String password, RoleList listOfRoles)
            throws InvalidUsernameException, InvalidPasswordException, InvalidRoleListException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");
        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");
        if (password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");
        if (listOfRoles == null || listOfRoles.isEmpty())
            throw new InvalidRoleListException("List of Roles cannot be empty");
    }
}


class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

class InvalidRoleListException extends Exception {
    public InvalidRoleListException(String message) {
        super(message);
    }
}