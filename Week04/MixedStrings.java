package Week04.Array;

public class MixedStrings {
    public static String swapFirstAndLast(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() <= 1) {
                // words with length <= 1 don't need to be swapped
                result.append(word).append(" ");
            } else {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                result.append(last).append(middle).append(first).append(" ");
            }
        }
        // Remove the trailing space and return the new sentence
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "This is PP2 Fall 2021";
        String mixedSentence = swapFirstAndLast(sentence);
        System.out.println(mixedSentence);
        // Output: shiT si 2PP llaF 1022
    }
}
