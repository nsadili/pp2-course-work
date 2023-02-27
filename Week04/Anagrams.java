package Week04;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void anagrams(String word1, String word2) {
        char[] wordone = sort(word1.toCharArray());
        char[] wordtwo = sort(word2.toCharArray());

        System.out.println(Arrays.toString(wordone));
        System.out.println(Arrays.toString(wordtwo));

        if (Arrays.equals(wordone, wordtwo)) System.out.println("Anagrams");
        else System.out.println("Not anagrams");
    }

    public static char[] sort(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] < ch[i]) {
                    swap(ch, i, j);
                }
            }
        }
        return ch;
    }

    public static void swap(char[] ch, int i, int j) {
        char temp = ch[j];
        ch[j] = ch[i];
        ch[i] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String first = scanner.nextLine();
        System.out.println("Enter the second word: ");
        String second = scanner.nextLine();
        anagrams(first, second);
        scanner.close();
    }
    
}