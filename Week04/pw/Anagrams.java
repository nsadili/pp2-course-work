import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "eat";
        String s2 = "ate";
        boolean areAnagrams = checkAnagram(s1, s2);
        System.out.println(s1 + " and " + s2 + " are anagrams: " + areAnagrams);
    }

    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();

        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);

        return Arrays.equals(s1Chars, s2Chars);
    }
}
