import java.util.Scanner;

public class StringsMixed {

    static final String SPACE = " ";

    static String mixSentence(String sentence) {

        // String[] parts = sentence.split(" "); // splits the string by space
        String[] parts = sentence.split("\\s+"); // splits the sentence by any # empty characters

        // parts now stores the words of the sentence

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

        // String[] parts = sentence.split(" "); // splits the string by space
        String[] parts = sentence.split("\\s+"); // splits the sentence by any empty character

        // parts now stores the words of the sentence

        // since strings are immutable data types everytime you try a += "123"
        // in memory you have the former value of a as well as the new value of a.
        // so if you call it, say 10 times, you have 1+10 copies of strings in the
        // memory out of which you only need the last one.

        // StringBuilder or StringBuffer can be used to avoid this
        // READ MORE about StringBuilder
        // You may read about StringBuffer after we discuss multithreading and you will
        // understand the difference
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
