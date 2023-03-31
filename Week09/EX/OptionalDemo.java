package EX;

import java.util.StringTokenizer;

public class OptionalDemo {
    public static void main(String[] args) {
        long s = System.nanoTime();
        System.out.println(search("Rai", "This is a rainy day"));
        long e = System.nanoTime();
        System.out.println("time taken: " + (e - s));

        s = System.nanoTime();
        System.out.println(search2("Rai", "This is a rainy day"));
        e = System.nanoTime();
        System.out.println("time taken: " + (e - s));
    }

    // with string and char methods
    static String search(String word, String text) {
        String textLowered = text.toLowerCase();
        word = word.toLowerCase();
        String trimmedStr = "";

        int i1 = textLowered.indexOf(word);
        int i2 = textLowered.indexOf(" ", i1);
        trimmedStr = textLowered.substring(i1, i2).trim();
        return trimmedStr;
    }

    // with tokenizer
    static String search2(String word, String text) {
        StringTokenizer st = new StringTokenizer(text);
        word = word.toLowerCase();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.toLowerCase().contains(word)) {
                return token;
            }
        }
        return "";
    }
}
