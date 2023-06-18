package Week09;
import java.util.Optional;
import java.util.StringTokenizer;


public class OptionalDemo {
    public static void main(String[] args) {
        String text = "Today is a rainy day .";
        
        Optional<String> word1 = OptionalDemo.searchWordWithPrefix(text, "rai");
        System.out.println(word1); 
        
        Optional<String> word2 = OptionalDemo.searchWordWithPrefix(text, "Rai");
        System.out.println(word2); 
        
        Optional<String> word3 = OptionalDemo.searchWordWithPrefix(text, "sun");
        System.out.println(word3); 
    }
    
    
    public static Optional<String> searchWordWithPrefix(String text, String prefix) {
            StringTokenizer st = new StringTokenizer(text, " ");
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                if (word.toLowerCase().startsWith(prefix.toLowerCase())) {
                    return Optional.of(word);
                }
            }
            return Optional.empty();
        }
    }
    
