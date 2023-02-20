import java.util.Scanner;

public class SubstringOc {
    public static void main(String[] args) {

        String a ="abcdefg";
        String b ="abcxxfga";
        System.out.println("Common Substrings: " + cntCmnString(a, b));
    }

    private static int cntCmnString(String s1, String s2){ //some problem here
        int cnt = 0;
        int length = s1.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String s = s1.substring(i, j);
                if (s2.indexOf(s) == i) {
                    System.out.println(s);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
