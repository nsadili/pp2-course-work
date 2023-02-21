public class SubstringOccurences {
    public static void main(String[] args) {
        System.out.println(countSameSubstrings("aatxxww", "aarxxw"));
        // System.out.println(countSameSubstrings("abcdefg", "abcxxfga"));

    }

    static int countSameSubstrings(String s1, String s2) {
        int count = 0;

        boolean isSubstring = false;

        int leftLen = s1.length(), rightLen = s2.length();
        int idx;

        for (idx = 0; idx < leftLen && idx < rightLen; idx++) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                System.out.print(s1.charAt(idx));
                isSubstring = true;
                continue;
            }
            if (isSubstring) {
                count++;
                isSubstring = false;
                System.out.println();
            }
        }

        if (isSubstring) {
            count++;
            System.out.println();
        }

        return count;
    }
}