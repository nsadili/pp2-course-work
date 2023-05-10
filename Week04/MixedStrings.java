import java.util.*;

public class MixedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String mixedSentence = swapFirstAndLastChars(sentence);
        System.out.println("Mixed sentence: " + mixedSentence);
    }

    public static String swapFirstAndLastChars(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder mixedSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() == 1) {
                mixedSentence.append(word);
            } else {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String middleChars = word.substring(1, word.length() - 1);
                mixedSentence.append(lastChar).append(middleChars).append(firstChar);
            }
            mixedSentence.append(" ");
        }

        return mixedSentence.toString().trim();
    }
}