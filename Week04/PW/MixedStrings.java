public class MixedStrings {
    
    public static String swapFirstAndLastChar(String sentence) {
        StringBuilder result = new StringBuilder();

        String[] words = sentence.split("\\s");
        for (String word : words) {
            if (word.length() < 2) {
                result.append(word).append(" ");
                continue;
            }
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            String middle = word.substring(1, word.length() - 1);
            String newWord = lastChar + middle + firstChar;
            result.append(newWord).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "This is PP2 Fall 2021";
        String result = swapFirstAndLastChar(input);
        System.out.println(result); 
    }
}
