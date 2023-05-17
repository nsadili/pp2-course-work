public class MixedStrings {
    public static void main(String[] args) {
        String sentence = "This is PP2 Fall 2021";
        String modifiedSentence = swapFirstAndLastCharacter(sentence);
        System.out.println("Modified sentence: " + modifiedSentence);
    }

    public static String swapFirstAndLastCharacter(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder modifiedSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);

                modifiedSentence.append(lastChar).append(word.substring(1, word.length() - 1)).append(firstChar);
            } else {
                modifiedSentence.append(word);
            }

            modifiedSentence.append(" ");
        }

        return modifiedSentence.toString().trim();
    }
}
