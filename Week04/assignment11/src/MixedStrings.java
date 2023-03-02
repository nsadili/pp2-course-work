public class MixedStrings {
    public static void main(String[] args) {
        String sentence = "This is PP2 Fall 2021";
        String mixedSentence = mixWords(sentence);
        System.out.println(mixedSentence);
    }

    public static String mixWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder mixedSentence = new StringBuilder();
        for (String word : words) {
            if (word.length() <= 1) {
                mixedSentence.append(word).append(" ");
            } else {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String middleChars = word.substring(1, word.length() - 1);
                mixedSentence.append(lastChar).append(middleChars).append(firstChar).append(" ");
            }
        }
        return mixedSentence.toString().trim();
    }
}
