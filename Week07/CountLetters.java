package Week07;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts = null;
        String word;

        do {
            counts = new int[26];
            System.out.print("Enter a word, preferably only english letters (0 to exit): ");
            word = scan.nextLine();

            word = word.toLowerCase();

            if (word.trim().equals("0"))
                break;

            for (int i = 0; i < word.length(); i++)
                counts[word.charAt(i) - 'a']++;

            System.out.println("\tHere are the letters:");

            for (int i = 0; i < counts.length; i++)
                if (counts[i] != 0)
                    System.out.println((char) (i + 'a') + ": " + counts[i]);

        } while (true);

        scan.close();
    }
}