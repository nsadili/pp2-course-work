package Week07.ex;

public class CustomUserGeneration {
    public static void main(String[] args) {
        try {
            // InvalidUsernameException
            // createUser("_demo_user", "1234", null);
            // InvalidPasswordException
            // createUser("demo_user", "1234", null);
            // InvalidRolesException
            // createUser("demo_user", "12345678", null);
            createUser("demo_user", "12345678", new String[] { "Software engineer" }); // OK
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createUser(String username, String password, String[] roles)
        throws InvalidUsernameException, InvalidPasswordException, InvalidRolesException {
            if (username == null || username.length() < 3)
                throw new InvalidUsernameException("Username cannot contain less than 3 symbols");
            
            if (!Character.isAlphabetic(username.charAt(0)))
                throw new InvalidUsernameException("Username cannot start with a non-alphabetical character");
            
            if (password == null || password.length() < 8)
                throw new InvalidPasswordException("The length of the password cannot be less than 8");

            if (roles == null || roles.length == 0)
                throw new InvalidRolesException("The number of roles cannot be less than 1");
    }
}
