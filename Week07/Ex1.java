package Week07;

import java.util.Scanner;

public class Ex1 {
   
class CountLetters {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String text = input.nextLine().toLowerCase();
            int[] counts = new int[26];

            for (int i = 0; i < text.length(); i++) {
                try {
                    char ch = text.charAt(i);
                    if (Character.isLetter(ch)) {
                        counts[ch - 'a']++;
                    }
                } catch (IndexOutOfBoundsException e) {
                    
                }
            }

            for (int i = 0; i < counts.length; i++) {
                System.out.println((char) (i + 'a') + ": " + counts[i]);
            }
        }
    }
}

}
