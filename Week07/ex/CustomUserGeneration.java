package ex;

import java.util.List;
import java.util.Random;

public class CustomUserGeneration {
    
    private static final String CHARACTERS = "EDYWEDBHJWwkjdnkwqjbd376372";
    private static final int USER_ID_LENGTH = 8;
    
    public static User createUser(List<String> roles) {
        if (roles == null || roles.isEmpty()) {
            throw new IllegalArgumentException("Roles cannot be null or empty.");
        }
        
        String userId = generateUserId();
        String username = generateUsername();
        String password = generatePassword();
        User user = new User(userId, username, password, roles);
        return user;
    }
    
    private static String generateUserId() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < USER_ID_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            char c = CHARACTERS.charAt(index);
            sb.append(c);
        }
        return sb.toString();
    }
    
    private static String generateUsername() {
        String[] usernames = {"john", "jane", "mike", "lisa", "tom"};
        Random random = new Random();
        int index = random.nextInt(usernames.length);
        return usernames[index];
    }
    
    private static String generatePassword() {
        Random random = new Random();
        int passwordLength = random.nextInt(6) + 6;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(CHARACTERS.length());
            char c = CHARACTERS.charAt(index);
            sb.append(c);
        }
        return sb.toString();
    }
}
