package Main;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "Hello, World! How are you today?";
        String delimiter = " ,!?";

        StringTokenizer tokenizer = new StringTokenizer(text, delimiter);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

    }
}
