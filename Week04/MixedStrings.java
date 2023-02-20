import java.util.Scanner;

public class MixedStrings {
    public static String swapFirstAndLast(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 1) {
                result.append(word).append(" ");
                continue;
            }
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            String middle = word.substring(1, word.length() - 1);
            result.append(last).append(middle).append(first).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();

        String swappedSentence = swapFirstAndLast(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Swapped sentence: " + swappedSentence);
    }
}
