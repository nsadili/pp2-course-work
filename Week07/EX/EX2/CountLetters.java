package EX2;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        int[] letterCounts = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                letterCounts[index]++;
            } else {
                System.out.println("Unexpected word: " + input.substring(i));
                continue;
            }
        }

        for (int i = 0; i < letterCounts.length; i++) {
            char c = (char) ('a' + i);
            System.out.println(c + ": " + letterCounts[i]);
        }
    }
}
