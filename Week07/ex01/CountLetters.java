package Week07.ex01;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        input.close();
        int[] counts = new int[26];
        for (int i = 0; i < text.length(); i++) {
            try {
                char ch = Character.toUpperCase(text.charAt(i));
                if (ch >= 'A' && ch <= 'Z')
                    counts[ch - 'A']++;
            } catch (Exception e) {
                // Ignore non-alphabetic characters
            }
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0)
                System.out.printf("%c occurs %d time(s)\n", (char) (i + 'A'), counts[i]);
        }
    }
}

