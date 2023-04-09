public class Anagram {
    public static boolean isAnagram(String str1, String str2) {

        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] letters = new int[256];
        for (int i = 0; i < 256; i++) {
            letters[i] = 0;
        }

        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            letters[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ref", "fere"));
    }
}