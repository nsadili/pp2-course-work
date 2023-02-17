package Week04;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first word: ");
        String first = sc.nextLine();
        System.out.println("Please input the second word: ");
        String second = sc.nextLine();
        anagrams(first, second);
    }

    public static void anagrams(String word1, String word2) {
        String[] firstWord = sort(word1.split(""));
        String[] secondWord = sort(word2.split(""));

        System.out.println(Arrays.toString(firstWord));
        System.out.println(Arrays.toString(secondWord));

        if (Arrays.equals(firstWord, secondWord)) System.out.println("They are anagrams");
        else System.out.println("They are not anagrams");
    }

    public static String[] sort(String[] ch) {
        for (int i = 0; i < ch.length; i++) {
            for (int a = i + 1; a < ch.length; a++) {
                if (ch[a].compareTo(ch[i]) < 0) {
                    swap(ch, i, a);
                }
            }
        }
        return ch;
    }

    public static void swap(String[] ch, int i, int a) {
        String temp = ch[j];
        ch[a] = ch[i];
        ch[i] = temp;
    }
}