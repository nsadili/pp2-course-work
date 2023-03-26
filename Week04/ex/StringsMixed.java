import java.util.Scanner;

public class StringsMixed {
    static final String SPACE = " ";

    static String mixWord(String word) {
        if (word.length() == 1) {
            return word;
        } else {
            return word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);
        }
    }

    static String mixSentence(String sentence) {
        String[] parts = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : parts) {
            result.append(mixWord(word)).append(SPACE);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        System.out.println(mixSentence(sentence));
        scan.close();
    }
}