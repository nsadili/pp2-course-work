public class SubstringOccurrences {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "abcxxfga";

        int count = countSubstringOccurrences(str1, str2);
        System.out.println("Number of matching substrings: " + count);
    }

    public static int countSubstringOccurrences(String str1, String str2) {
        int count = 0;
        int length = Math.min(str1.length(), str2.length());

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring1 = str1.substring(i, j);
                String substring2 = str2.substring(i, j);

                if (substring1.equals(substring2)) {
                    count++;
                    System.out.println(substring1);
                }
            }
        }

        return count;
    }
}
