import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts = null;
        String word;

        do {
            counts = new int[26];
            System.out.print("Enter a word, preferrably only english letters (0 to exit): ");
            word = scan.nextLine();

            word = word.toLowerCase();

            if (word.trim().equals("0"))
                break;

            try{
                for (int i = 0; i < word.length(); i++)
                    counts[word.charAt(i) - 'a']++;

                String s = null;
                s.toLowerCase();

                System.out.println("\tHere are the letters:");
                for (int i = 0; i < counts.length; i++)
                    if (counts[i] != 0)
                        System.out.println((char) (i + 'a') + ": " + counts[i]);
            } catch (ArrayIndexOutOfBoundsException ex1){
                System.out.printf("<%s> is an invalid word!\n", word);
            } catch (NullPointerException ex2){
                
            }

        } while (true);

        scan.close();
    }
}