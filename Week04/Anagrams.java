package pp2.week04;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "team";
        String str2 = "meat";
        System.out.println(areAnagrams(str1, str2));
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (char c : chars1) {
            boolean foundMatch = false;
            for (int j = 0; j < chars2.length; j++) {
                if (c == chars2[j]) {
                    foundMatch = true;
                    chars2[j] = '\0'; // mark the character as visited
                    break;
                }
            }
            if (!foundMatch) {
                return false;
            }
        }
        return true;
    }

}
