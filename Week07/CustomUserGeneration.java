public class CustomUserGeneration {
    public static void main(String[] args) {

        try {
            createUser("demo_user", "12345", new String[] {});
        } catch (InvalidUsernameException e) {
            e.printStackTrace();
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        }

    }

    public static void createUser(String username, String password, String[] roles)
            throws InvalidUsernameException, InvalidPasswordException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");

        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");

        if (password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");

            if(roles == null || roles.length == 0) {
                throw new InvalidRoleListException();
            }

        // PROCESS OF USER CREATION - WE DO NOT CARE ABOUT IT HERE!!!
    }
}