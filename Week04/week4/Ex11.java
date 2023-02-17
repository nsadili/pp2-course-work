package pp2.week4;

public class Ex11 {
    public static String swapFirstAndLastCharacters(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            if (words[i].length() <= 1) {
                sb.append(words[i]);
            } else {
                char first = words[i].charAt(0);
                char last = words[i].charAt(words[i].length() - 1);
                String middle = words[i].substring(1, words[i].length() - 1);
                sb.append(last).append(middle).append(first);
            }
        }
        return sb.toString();
    }
}
