package Week07;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] counts = null;
        String word;

        do {
            counts = new int[26];
            System.out.print("Enter a term using only English letters (0 to exit):");
            word = input.nextLine();

            word = word.toLowerCase();

            if (word.trim().equals("0"))
                break;

            try{
            for (int i = 0; i < word.length(); i++)
                counts[word.charAt(i) - 'a']++;
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.printf("|%s| is an null word\n", word);
                continue;
            }

            System.out.println("\tLetters are:");

            for (int i = 0; i < counts.length; i++)
                if (counts[i] != 0)
                    System.out.println((char) (i + 'a') + ": " + counts[i]);

        } while (true);

        input.close();
    }
}