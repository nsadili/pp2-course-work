import java.util.List;

public class User {
    private String username;
    private String passwordString;
    private List<String> roles;
    
    public User(String username, String passwordString, List<String> roles) {
        this.username = username;
        this.passwordString = passwordString;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordString() {
        return passwordString;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordString(String passwordString) {
        this.passwordString = passwordString;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}
