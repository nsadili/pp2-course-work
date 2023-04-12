package Week07.ex05;


import javax.management.relation.RoleList;

public class CustomUserGeneration {
    public static void main(String[] args) {
        try {
            createUser("user", "1234", new RoleList());
        } catch (InvalidUsernameException | InvalidPasswordException | InvalidRoleListException e) {
            e.printStackTrace();
        }
    }

    public static void createUser(String username, String password, RoleList listOfRoles)
            throws InvalidUsernameException, InvalidPasswordException, InvalidRoleListException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");
        else if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username must start with alphabetical character");
        else if (listOfRoles == null || listOfRoles.isEmpty())
            throw new InvalidRoleListException("List of Roles cannot be empty");
        else if (password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");
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