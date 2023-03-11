import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = input.nextLine().toLowerCase();

            int[] counts = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isLetter(ch)) {
                    counts[ch - 'a']++;
                } else {
                    System.out.println("Ignoring non-letter character: " + ch);
                }
            }

            System.out.println("Letter Frequencies:");
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0) {
                    System.out.println((char) (i + 'a') + ": " + counts[i]);
                }
            }
        }
    }
}
