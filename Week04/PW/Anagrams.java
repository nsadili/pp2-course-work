import java.util.Arrays;

public class Anagrams {

    public static boolean areAnagrams(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1_Chars = str1.toCharArray();
        char[] str2_Chars = str2.toCharArray();
        Arrays.sort(str1_Chars);
        Arrays.sort(str2_Chars);

        return Arrays.equals(str1_Chars, str2_Chars);
    }

}