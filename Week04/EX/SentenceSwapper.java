public class SentenceSwapper {
    public static void main(String[] args) {
        String sentence = "This is PP2 Fall 2021";
        String swappedSentence = swapFirstAndLastChars(sentence);
        System.out.println(swappedSentence);
    }

    public static String swapFirstAndLastChars(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 1) {
                result.append(word);
            } else {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                result.append(lastChar).append(middle).append(firstChar);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}
