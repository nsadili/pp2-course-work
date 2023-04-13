import java.util.List;

public class CustomUserGeneration {
    private String firstName;
    private String lastName;
    private List<String> roles;

    public CustomUserGeneration(String firstName, String lastName, List<String> roles) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty() || roles == null
                || roles.isEmpty()) {
            throw new IllegalArgumentException(
                    "Invalid input: firstName, lastName, and roles must not be null or empty.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        if (roles == null || roles.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: roles must not be null or empty.");
        }
        this.roles = roles;
    }

    public static void main(String[] args) {
        try {
            List<String> roles = List.of("admin", "user", "guest");
            CustomUserGeneration user = new CustomUserGeneration("Vasif", "Maharramli", roles);
            System.out.println(user.getFirstName() + " " + user.getLastName() + " has roles: " + user.getRoles());

            roles = List.of("user");
            user.setRoles(roles);
            System.out.println(user.getFirstName() + " " + user.getLastName() + " now has roles: " + user.getRoles());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}