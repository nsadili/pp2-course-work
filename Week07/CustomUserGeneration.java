package Week07;

import java.util.List;
import java.util.Random;

public class CustomUserGeneration {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final int NAME_LENGTH = 10;
    private static final int PASSWORD_LENGTH = 12;
    private static final int ID_LENGTH = 6;

    public static Account createUser(List<String> roles) {
        if (roles == null || roles.isEmpty()) {
            throw new IllegalArgumentException("Role list cannot be null or empty.");
        }
        String name = generateName();
        String password = generatePassword();
        String id = generateID();
        return new Account(name, password, id, roles);
    }

    private static String generateName() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < NAME_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            builder.append(CHARACTERS.charAt(index));
        }
        return builder.toString();
    }

    private static String generatePassword() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            builder.append(CHARACTERS.charAt(index));
        }
        return builder.toString();
    }

    private static String generateID() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ID_LENGTH; i++) {
            int digit = random.nextInt(10);
            builder.append(digit);
        }
        return builder.toString();
    }
}

