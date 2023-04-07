package EX;

import java.util.Optional;
import java.util.StringTokenizer;

public class PrefixFinder {
    
    public Optional<String> searchForPrefix(String text, String prefix) {
        StringTokenizer tokenizer = new StringTokenizer(text, " .");
        


        while (tokenizer.hasMoreTokens()) {


            String word = tokenizer.nextToken();
            if (word.toLowerCase().startsWith(prefix.toLowerCase())) {
                return Optional.of(word);

            }


        }
        
        
        return Optional.empty();


    }
    
}
