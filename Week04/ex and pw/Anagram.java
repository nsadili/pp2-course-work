import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        anagram(str1, str2);

    }

    static void anagram(String word1, String word2) {
        String[] firstword = sort(word1.split(""));
        String[] secondword = sort(word2.split(""));
        System.out.println((Arrays.equals(firstword, secondword)));
        System.out.println(Arrays.toString(secondword));

        if (Arrays.equals(firstword, secondword))
            System.out.println("They are anagrams");
        else
            System.out.println("They are not anagrams");

    }

    static String[] sort(String[] ch) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j].compareTo(ch[i]) < 0)
                    swap(ch, i, j);
            }

        }
        return ch;

    }

    static void swap(String[] ch, int i, int j) {
        String temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

    }

}
