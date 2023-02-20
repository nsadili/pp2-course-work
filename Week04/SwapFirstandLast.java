package Week04;

public class SwapFirstandLast {
    public static String swapFirstAndLast(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() <= 1) {
                sb.append(word);
            } else {
                sb.append(word.charAt(word.length() - 1))
                    .append(word.substring(1, word.length() - 1))
                    .append(word.charAt(0));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    
        public static void main(String[] args) {
            String sentence = "Hello, how are you?";
            String result = swapFirstAndLast(sentence);
            System.out.println(result);
        }
    
    
}
