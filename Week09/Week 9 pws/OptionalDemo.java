import java.util.Optional;
import java.util.StringTokenizer;

public class OptionalDemo {
    public static void main(String[] args) {
        
        String text = "Welcome home";
        String prefix = "we";

        System.out.println(
            wordWithPrefix(text, prefix).isPresent() == true ?  wordWithPrefix(text, prefix).get() : 
            "No word start with <" + prefix + ">" 
            );



    }

    static Optional<String> wordWithPrefix(String text, String prefix){

        StringTokenizer words = new StringTokenizer(text);
        Optional<String> result = Optional.empty();

   

        while(words.hasMoreTokens()){
            var token = words.nextToken();
            if(token.toLowerCase().startsWith(prefix.toLowerCase())){
                    return Optional.of(token);
            }
        }

        return result;
    
    
    }
}