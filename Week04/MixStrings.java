import java.util.Scanner;

public class MixStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("The new sentence is: " + swapFirstLast(sentence));
    }

    public static String swapFirstLast(String sentence) {
        String[] words = sentence.split(" ");
        String newSentence = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 1) {
                word = word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);
            }
            newSentence += word + " ";
        }
        return newSentence;
    }
}