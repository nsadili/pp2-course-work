import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String result = swapFirstAndLastChars(sentence);
        System.out.println(result);
        scanner.close();
    }

    public static String swapFirstAndLastChars(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() == 1) {
                result.append(word).append(" ");
            } else {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                String newWord = lastChar + middle + firstChar;
                result.append(newWord).append(" ");
            }
        }
        return result.toString().trim();
    }
}
