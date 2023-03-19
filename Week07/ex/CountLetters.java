import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] counts = null;
        String word;

        do {
            counts = new int[32];

            System.out.print("Enter word, preferrably only english letters ");
            word = scan.nextLine();

            word = word.toLowerCase();

            if (word.trim().equals("0"))
                break;

            try {
                for (int i = 0; i < word.length(); i++)
                    counts[word.charAt(i) - 'a']++;

                System.out.println("\tHere are the letters:");

                for (int i = 0; i < counts.length; i++)
                    if (counts[i] != 0)
                        System.out.println((char) (i + 'a') + ": " + counts[i]);

            } catch (Exception e) {
                System.out.printf("<%s> is  Invalid World", word);
            }

        } while (true);

        scan.close();
    }
}

