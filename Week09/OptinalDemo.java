import java.util.Optional;
import java.util.StringTokenizer;

public class OptinalDemo {
    public static void main(String[] args) {
        
        String text = "Hello World  Welcome to Java PP2 course";
        String prefix = "ja";

        System.out.println(
            wordWithPrefix(text, prefix).isPresent() == true ?  wordWithPrefix(text, prefix).get() : 
            "No word start with <" + prefix + ">" 
            );



    }

    static Optional<String> wordWithPrefix(String text, String prefix){

        StringTokenizer words = new StringTokenizer(text);
        Optional<String> result = Optional.empty();

    //    while(s.hasMoreTokens()){
    //     System.out.println(s.nextToken());
    //    }

        while(words.hasMoreTokens()){
            var token = words.nextToken();
            if(token.toLowerCase().startsWith(prefix.toLowerCase())){
                    return Optional.of(token);
            }
        }

        return result;
    
    
    }
}
