package Week07;

public class CustomUserGeneration {

    public static void createUser(String username, String password, String[] roleList)
            throws InvalidUsernameException, InvalidPasswordException, InvalidRoleListException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");
        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");
        if (password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");
        if (roleList == null || roleList.length == 0)
            throw new InvalidRoleListException("roleList is not correct");
    }
}
