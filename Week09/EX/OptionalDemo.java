package Week09.EX;

import java.util.Optional;
import java.util.StringTokenizer;

public class OptionalDemo {
    public static void main(String[] args) {
        
        String text = "Today is a rainy day.";
        String prefix1 = "rai";
        String prefix2 = "Rai";
        String prefix3 = "sun";
        
        Optional<String> result1 = OptionalDemo.searchWordWithPrefix(text, prefix1);
        Optional<String> result2 = OptionalDemo.searchWordWithPrefix(text, prefix2);
        Optional<String> result3 = OptionalDemo.searchWordWithPrefix(text, prefix3);
        
        System.out.println(result1); // Optional[rainy]
        System.out.println(result2); // Optional[rainy]
        System.out.println(result3); // Optional.empty
        
    }


    private static Optional<String> searchWordWithPrefix(String text, String prefix1) {
        return null;
    }


    public static Optional<String> findWord(String text, String prefix){
        StringTokenizer t= new StringTokenizer(text);
        while(t.hasMoreTokens()){
            String word= t.nextToken();
            if(word.toLowerCase().startsWith(prefix.toLowerCase())){
                return Optional.of(word);
            }
        }
        return Optional.empty();
    }
    
}