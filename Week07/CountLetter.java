import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String input = scanner.nextLine().toLowerCase();
        int[] counts = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                counts[index]++;
            } else {
                System.out.println("Ignoring unexpected word: " + ch);
            }
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                char ch = (char) ('a' + i);
                System.out.println(ch + " occurs " + counts[i] + " time(s)");
            }
        }
    }
}