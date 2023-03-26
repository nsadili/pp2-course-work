import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String a1 = "race";
        String a2 = "care";
        boolean areAnagrams = checkAnagram(a1, a2);
        System.out.println(a1 + " and " + a2 + " are anagrams: " + areAnagrams);
    }

    public static boolean checkAnagram(String a1, String a2) {
        if (a1.length() != a2.length()) {
            return false;
        }

        char[] a1Chars = a1.toCharArray();
        char[] a2Chars = a2.toCharArray();

        Arrays.sort(a1Chars);
        Arrays.sort(a2Chars);

        return Arrays.equals(a1Chars, a2Chars);
    }
}