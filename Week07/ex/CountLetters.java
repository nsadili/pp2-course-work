import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] letterCounts = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                letterCounts[index]++;
            } else if (c != ' ') {
                System.out.println("Unexpected character: " + c);
            }
        }

        for (int i = 0; i < letterCounts.length; i++) {
            char c = (char) ('a' + i);
            System.out.println(c + ": " + letterCounts[i]);
        }
    }
}
