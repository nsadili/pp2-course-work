public class MixedStrings {
    public static String swapCharacters(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {

            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);

            sb.append(lastChar);
            sb.append(word.substring(1, word.length() - 1));
            sb.append(firstChar);
            sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String sentence = "This is PP2 Fall 2021";
        System.out.println(swapCharacters(sentence));
    }
}