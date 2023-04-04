import java.util.Optional;
import java.util.StringTokenizer;

public class Exercise_9 {
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
    
    public static void main(String[] args) {
        String text = "Today is a rainy day.";
        String prefix1 = "rai";
        String prefix2 = "Rai";
        String prefix3 = "sun";
    
        System.out.println("Word with prefix \"" + prefix1 + "\": " + findWordWithPrefix(text, prefix1));
        System.out.println("Word with prefix \"" + prefix2 + "\": " + findWordWithPrefix(text, prefix2));
        System.out.println("Word with prefix \"" + prefix3 + "\": " + findWordWithPrefix(text, prefix3));
    }
}