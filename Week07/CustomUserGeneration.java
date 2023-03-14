package Week07;


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
    
    if (username == null || username.isEmpty()) {
        throw new InvalidUsernameException("Username cannot be null or empty");
    }
    
    if (password == null || password.isEmpty()) {
        throw new InvalidPasswordException("Password cannot be null or empty");
    }
    
    if (roles == null || roles.length == 0) {
        throw new IllegalArgumentException("Roles cannot be null or empty");
    }
    
    
    
}

}