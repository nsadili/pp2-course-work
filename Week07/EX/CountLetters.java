import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        int[] count = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            try {
                if (Character.isLetter(ch)) {
                    count[ch - 'a']++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // ignore unexpected characters
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + count[i]);
            }
        }
    }
}
