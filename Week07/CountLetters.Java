import java.util.HashMap;
import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
            } else {
                System.out.printf("Ignoring non-alphabetic character: %c\n", c);
            }
        }

        System.out.println("Letter counts:");
        for (char c = 'a'; c <= 'z'; c++) {
            if (letterCounts.containsKey(c)) {
                System.out.printf("%c: %d\n", c, letterCounts.get(c));
            } else {
                System.out.printf("%c: 0\n", c);
            }
        }
    }
}