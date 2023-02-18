import java.util.Arrays;

public class MixedString {
    public static void main(String[] args) {
        System.out.println(mix("Hello World"));
    }

    public static String mix(String str) {
        StringBuilder result = new StringBuilder();
        String [] wordList = str.split(" ");
        for(String word : wordList) {
                if (word.length() > 1) {
                    char firstChar = word.charAt(0);
                    char lastChar = word.charAt(word.length() - 1);
                    String middle = word.substring(1, word.length() - 1);
                    result.append(lastChar).append(middle).append(firstChar).append(" ");
                } else {
                    result.append(word).append(" ");
                }       
        }
        return result.toString();
    }
}
