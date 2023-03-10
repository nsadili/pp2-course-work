import java.util.List;
public class CustomUserGeneration {
    public static void main(String[] args) throws InvalidUsernameException, InvalidPasswordException {

        createUser("demo_user", "12345", new String[] {});

    }

    private static void createUser(String username, String password, String[] strings) {
	}

	public static void createUser(String username, String password, List<String> roles)
            throws InvalidUsernameException, InvalidPasswordException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");

        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");

        if (password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");
        
        if (roles == null || roles.isEmpty()){
            throw new IllegalArgumentException("Roles assigned to the user can not be empty");
        }
        User user = new User(username, password, roles);
        // TODO: roles CANNOT BE null or an empty array

        // PROCESS OF USER CREATION - WE DO NOT CARE ABOUT IT HERE!!!
    }
}
