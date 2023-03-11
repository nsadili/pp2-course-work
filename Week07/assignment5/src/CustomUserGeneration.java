import java.util.List;
import java.util.Random;

public class CustomUserGeneration {

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static void main(String[] args) {
        List<String> roles = List.of("admin", "user", "guest");

        User user = createUser(roles);
        System.out.println(user);
    }

    public static User createUser(List<String> roles) {
        if (roles == null || roles.isEmpty()) {
            throw new IllegalArgumentException("Roles list must not be null or empty.");
        }

        String username = generateRandomString(10);
        String password = generateRandomString(12);

        return new User(username, password, roles);
    }

    private static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALPHA_NUMERIC_STRING.length());
            sb.append(ALPHA_NUMERIC_STRING.charAt(index));
        }

        return sb.toString();
    }

    private static class User {
        private String username;
        private String password;
        private List<String> roles;

        public User(String username, String password, List<String> roles) {
            this.username = username;
            this.password = password;
            this.roles = roles;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", roles=" + roles +
                    '}';
        }
    }
}
