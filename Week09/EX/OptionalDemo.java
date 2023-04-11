import java.util.Optional;
import java.util.StringTokenizer;

public class OptionalDemo {
    public static Optional<String> findWordWithPrefix(String text, String prefix) {
        StringTokenizer tokenizer = new StringTokenizer(text);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.toLowerCase().startsWith(prefix.toLowerCase())) {
                return Optional.of(word);
            }
        }
        return Optional.empty();
    }
}
