import java.util.Optional;
import java.util.StringTokenizer;

public class OptionalDemo {

    public static Optional<String> findWordWithPrefix(String text, String prefix) {

        text = text.trim();

        StringTokenizer tokenizer = new StringTokenizer(text, " ");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.startsWith(prefix)) {

                return Optional.of(word);
            }
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        String text = "Today is a rainy day .";
        String prefix1 = "rai";
        String prefix2 = "Rai";
        String prefix3 = "sun";

        Optional<String> result1 = findWordWithPrefix(text, prefix1);
        System.out.println(result1);

        Optional<String> result2 = findWordWithPrefix(text, prefix2);
        System.out.println(result2);

        Optional<String> result3 = findWordWithPrefix(text, prefix3);
        System.out.println(result3);
    }
}