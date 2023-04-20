
public class Customer {
    private String name;
    private int age;
    private String email;
    private String address;

    public Customer(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return name;
    }
}

class CustomUserGeneration {
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

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

class InvalidUsernameException extends Exception {

    public InvalidUsernameException() {
        super();
    }

    public InvalidUsernameException(String message) {
        super(message);
    }
}