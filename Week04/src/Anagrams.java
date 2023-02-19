import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        if (isAnagram(word1, word2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();
        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);
        return Arrays.equals(word1Chars, word2Chars);
    }
}