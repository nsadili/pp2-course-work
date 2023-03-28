import java.util.Scanner;

public class StringsMixed {

    static final String SPACE = " ";

    static String mixSentence(String sentence) {

        String[] parts = sentence.split("\\s+"); 


        String result = "";

        for (String word : parts) {
            if (word.length() == 1)
                result += word;
            else
                result += word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);
            result += SPACE;
        }

        return result;
    }

    static String mixSentenceV2(String sentence) {

        String[] parts = sentence.split("\\s+"); 
        StringBuilder result = new StringBuilder();

        for (String word : parts) {
            if (word.length() == 1)
                result.append(word);
            else {
                result.append(word.charAt(word.length() - 1));
                result.append(word.substring(1, word.length() - 1));
                result.append(word.charAt(0));
                result.append(SPACE);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        System.out.println(mixSentence(sentence));
        System.out.println(mixSentenceV2(sentence));

        scan.close();
    }
}
