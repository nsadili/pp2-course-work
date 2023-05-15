import java.util.Optional;
import java.util.StringTokenizer;

public class OptionalDemo {

    public static Optional<String> findWord(String text, String prefix) {
        StringTokenizer tokenizer = new StringTokenizer(text);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.toLowerCase().startsWith(prefix.toLowerCase())) {
                return Optional.of(word);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        String text = "Today is a rainy day.";
        String prefix1 = "rai";
        String prefix2 = "Rai";
        String prefix3 = "sun";

        Optional<String> result1 = findWord(text, prefix1);
        Optional<String> result2 = findWord(text, prefix2);
        Optional<String> result3 = findWord(text, prefix3);

        System.out.println("Prefix: " + prefix1 + ", Result: " + result1.orElse("No word"));
        System.out.println("Prefix: " + prefix2 + ", Result: " + result2.orElse("No word"));
        System.out.println("Prefix: " + prefix3 + ", Result: " + result3.orElse("No word"));
    }
}