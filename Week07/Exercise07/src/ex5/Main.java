package ex5;

public class Main {
    public static void main(String[] args) {
        try {
            createUser("demo_user", "12345678", "");
        } catch (InvalidUsernameException e) {
            e.printStackTrace();
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        } catch (InvalidRoleException e) {
            e.printStackTrace();
        }
    }

    public static void createUser(String username, String password, String role) throws InvalidUsernameException, InvalidPasswordException, InvalidRoleException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");
        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");
        if (password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");
        if (role == null || role.length() < 1)
            throw new InvalidRoleException("Role not assigned.");
    }
}