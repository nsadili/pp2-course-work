import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class W7Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        Map<Character, Integer> letterCounts = new HashMap<>();

        
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (Character.isLetter(c)) {
                if (!letterCounts.containsKey(c)) {
                    letterCounts.put(c, 1);
                } else {
                    letterCounts.put(c, letterCounts.get(c) + 1);
                }
            }
        }
        
        for (char c = 'a'; c <= 'z'; c++) {
            int count = letterCounts.getOrDefault(c, 0);
            System.out.println(c + ": " + count);
        }
    }
}