import java.util.Optional;
import java.util.StringTokenizer;

public class OptionalDemo {

    public static Optional<String> findWordWithPrefix(String prefix, String text) {
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
        
        System.out.println(findWordWithPrefix("d", "salam menim adim Nerimandir"));
    }
}
