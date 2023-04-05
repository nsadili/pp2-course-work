package Week09;

import java.util.Optional;
import java.util.StringTokenizer;

public class OptionalDemo {
    
    public static Optional<String> findWordWithPrefix(String text, String prefix) {
        StringTokenizer tokenizer = new StringTokenizer(text, " .");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.toLowerCase().startsWith(prefix.toLowerCase())) {
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
        System.out.println(result1); // Optional[rainy]
        
        Optional<String> result2 = findWordWithPrefix(text, prefix2);
        System.out.println(result2); // Optional[rainy]
        
        Optional<String> result3 = findWordWithPrefix(text, prefix3);
        System.out.println(result3); // Optional.empty
    }
}
