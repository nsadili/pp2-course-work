import java.util.Optional;
import java.util.StringTokenizer;

public class OptionalDemo {
    public static void main(String[] args) {
        
        String text= "Today is a rainy day.";
        Optional<String> r1= findWord(text, "rai");
        System.out.println(r1);

        Optional<String> r2= findWord(text, "Rai");
        System.out.println(r2);

        Optional<String> r3= findWord(text, "sun");
        System.out.println(r3);
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

