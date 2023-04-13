import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            } else if (!Character.isWhitespace(c)) {
                System.out.println("Ignoring non-alphabetic character: " + c);
            }
        }

        System.out.println("Number of letters: " + count);
    }
}