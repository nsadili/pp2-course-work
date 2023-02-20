package Week04.Strings;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First String :");
        String first = sc.nextLine();
        System.out.println("Second String :");
        String second = sc.nextLine();
        anagrams(first, second);
    }
    private static void anagrams(String word1, String word2) {
        char[] firstString = sort(word1.toCharArray());
        char[] secondString = sort(word2.toCharArray());

        System.out.println(Arrays.toString(firstString));
        System.out.println(Arrays.toString(secondString));

        if (Arrays.equals(firstString, secondString)) System.out.println("Strings are anagrams");
        else System.out.println("Strings are not anagrams");
    }

    private static char[] sort(char[] ch) {
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
}
