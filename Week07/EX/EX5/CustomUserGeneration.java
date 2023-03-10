package EX.EX5;
public class CustomUserGeneration {
    public static void main(String[] args) {

        try {
            createUser("demo_user", null, new String[] {});
        } catch (InvalidUsernameException e) {
            e.printStackTrace();
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        } catch (InvalidRoleListExeption e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("An inevitable part of the process...");
        }

        System.out.println("The rest of the program...");
    }

    public static void createUser(String username, String password, String[] roles)
            throws Exception {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");

        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");

        if (password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");

        // roles CANNOT BE null or an empty array
        if(roles == null || roles.length == 0){
            throw new InvalidRoleListExeption();
        }

        // PROCESS OF USER CREATION - WE DO NOT CARE ABOUT IT HERE!!!
        System.out.println("SUCCESSFULLY CREATED THE USER");
    }
}
