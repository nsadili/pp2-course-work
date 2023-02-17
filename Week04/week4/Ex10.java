package pp2.week4;

public class Ex10 {
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length())
            return false;

        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            count[c]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            count[c]--;
            if (count[c] < 0) {
                return false;
            }
        }
        return true;
    }
}