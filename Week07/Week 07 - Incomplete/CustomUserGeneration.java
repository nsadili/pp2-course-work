
public class CustomUserGeneration {
    public static void main(String[] args) {

        try {
            createUser("er", "12345abc", new String[] {});
            createUser("demo_user", "12345abc", new String[] {});
            //createUser("demo_user", null, new String[] {});

        } catch (InvalidUsernameException e) {
            e.printStackTrace();
            System.out.println("Please, provide a valid username.");
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
            System.out.println("Please, provide a valid password.");
        } catch (InvalidRolesException e) {
            e.printStackTrace();
            System.out.println("Please, do not leave the roles empty.");
        }

    }

    public static void createUser(String username, String password, String[] roles)
            throws InvalidUsernameException, InvalidPasswordException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");

        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");

        if (password==null || password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");

        System.out.println("User created successfully.");

        if (roles==null || roles.length==0){
            throw new InvalidRolesException("The roles cannot be empty.");
        }

    }
}
