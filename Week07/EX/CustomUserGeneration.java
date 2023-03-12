public class CustomUserGeneration {
    public static void main(String[] args) {

        try {
            createUser("demo_user", "982847967", new String[] {});
        } catch (InvalidUsernameException e) {
            e.printStackTrace();
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        } catch (InvalidRoleListException e) {
            e.printStackTrace();
        }

    }

    public static void createUser(String username, String password, String[] roles)
            throws InvalidUsernameException, InvalidPasswordException, InvalidRoleListException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");

        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");

        if (password == null || password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");

        if (roles == null || roles.length == 0) {
            throw new InvalidRoleListException("Array should not be null or empty");
        }

        System.out.println("Succesfully Created");
    }
}