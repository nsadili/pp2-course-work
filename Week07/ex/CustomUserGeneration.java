import java.util.List;
import java.util.Random;

public class CustomUserGeneration {
    
    private static final String[] FIRST_NAMES = {"Gulnar", "Leyla"};
    private static final String[] LAST_NAMES = {"Hasanli", "Khudiyeva"};
    private static final String[] ROLES = {"admin", "user"};
    
    private List<String> roles;
    
    public CustomUserGeneration(List<String> roles) {
        if (roles == null || roles.isEmpty()) {
            throw new IllegalArgumentException("Roles cannot be null or empty.");
        }
        this.roles = roles;
    }
    
    public String generateUser() {
        Random random = new Random();
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        String role = roles.get(random.nextInt(roles.size()));
        return firstName + "." + lastName + "@" + role + ".com";
    }
}
