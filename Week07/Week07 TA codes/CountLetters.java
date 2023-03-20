import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts = {};
        String word, line;

        do {
            scan = new Scanner(System.in);

            counts = new int[26];
            System.out.print("Enter a word, preferrably only english letters (0 to exit): ");
            line = scan.nextLine();

            if(line.trim().equals("0")) {
                System.out.println("bye!");
                break;
            }

            scan = new Scanner(line);

            while(scan.hasNext()) {
                word = scan.next();

                word = word.toLowerCase();

                for (int i = 0; i < word.length(); i++) {
                    try {
                        counts[word.charAt(i) - 'a']++;
                    } catch (Exception e) {
                        // that means there is a digit / whitespace found.
                    }
                }

                System.out.println("\tHere are the letters:");

                for (int i = 0; i < counts.length; i++)
                    if (counts[i] != 0)
                        System.out.println((char) (i + 'a') + ": " + counts[i]);
            }

        } while (true);

        scan.close();
    }
}