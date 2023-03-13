public class User {
    private String username;
    private List<String> roles;

    public User(String username, List<String> roles) {
        if (roles == null || roles.isEmpty()) {
            throw new IllegalArgumentException("Role list cannot be null or empty");
        }
        this.username = username;
        this.roles = roles;
    }
}