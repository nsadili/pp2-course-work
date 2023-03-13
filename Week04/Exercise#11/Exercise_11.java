import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String newSentence = Exercise_11(words);
        System.out.println("New sentence: " + newSentence);
    }

    public static String Exercise_11 (String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() <= 1) {
                sb.append(word);
            } else {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                sb.append(lastChar).append(word.substring(1, word.length() - 1)).append(firstChar);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

//empty commitment



