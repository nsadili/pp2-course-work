package pp2.week4;

public class Ex12 {
    public static int findSubstringIndex(String string, String sub) {
        int len1 = string.length();
        int len2 = sub.length();

        if (len2 > len1)
            return -1;

        for (int i = 0; i <= len1 - len2; i++) {
            if (string.charAt(i) == sub.charAt(0)) {
                int j = 1;
                while (j < len2 && string.charAt(i + j) == sub.charAt(j)) {
                    j++;
                }
                if (j == len2)
                    return i;

            }
        }
        return -1;
    }
}
