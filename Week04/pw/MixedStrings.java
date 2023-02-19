public class MixedStrings {
    public static String swapFirstAndLast(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                sb.append(last).append(middle).append(first);
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
        
    }
    public static void main(String[] args) {
        String sentence = "This is PP2 Fall 2021";
        System.out.println(swapFirstAndLast(sentence)); // shiT si 2PP llaF 1022
    }
}
