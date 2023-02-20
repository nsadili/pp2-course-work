public class MixedStrings {
    
}
public static String swapFirstAndLastCharacters(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
        if (word.length() > 1) {
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            result.append(lastChar).append(word.substring(1, word.length() - 1)).append(firstChar);
        } else {
            result.append(word);
        }
        result.append(" ");
    }

    return result.toString().trim();
}