public class SubstringOccurrences {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "abcxxfga";
        System.out.println("Substrings in common: " + countCommonSubstrings(str1, str2));
    }

    public static int countCommonSubstrings(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String substring = str1.substring(i, j);
                if (str2.contains(substring)) {
                    System.out.println(substring);
                    count++;
                }
            }
        }
        return count;
    }
}
