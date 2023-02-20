public class MixedStrings {
    public static String swapFirstAndLast(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String middleChars = word.substring(1, word.length() - 1);
                String newWord = lastChar + middleChars + firstChar;
                res.append(newWord).append(" ");
            } else
            {
                res.append(word).append(" ");
            }
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "This is PP2 Fall 2021";
        String res = swapFirstAndLast(sentence);
        System.out.println(res);
    }
}