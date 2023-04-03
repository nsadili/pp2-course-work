import java.util.Optional;
import java.util.Scanner;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String prefix = sc.nextLine();

        Optional<String> result = findWordWithPrefix(text, prefix);
        System.out.println(result.orElse("No word found"));
    }
}