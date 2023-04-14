import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" "); 
        String text = scanner.nextLine().toLowerCase();
        int[] count = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else {
                System.out.println("Invalid character: " + c);
            }
        }
        for (int i = 0; i < count.length; i++) {
            char c = (char) (i + 'a');
            System.out.println(c + ": " + count[i]);
        }
    }
}