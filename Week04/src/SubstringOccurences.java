import java.util.*;

public class SubstringOccurences {

    public static int countAndPrintMatchingSubstrings(String str1, String str2) {
        int count = 0;
        int len1 = str1.length();
        int len2 = str2.length();
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                int k = i;
                int l = j;
                while (k < len1 && l < len2 && str1.charAt(k) == str2.charAt(l)) {
                    k++;
                    l++;
                    count++;
                    System.out.println(str1.substring(i, k));
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count = countAndPrintMatchingSubstrings(str1, str2);
        System.out.println("Number of matching substrings: " + count);
    }
}
