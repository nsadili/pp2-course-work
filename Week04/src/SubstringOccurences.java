import java.util.*;

public class SubstringOccurences {

    public static int countCommonSubstrings(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String substr1 = s1.substring(i, j);
                if (s2.contains(substr1)) {
                    System.out.println(substr1);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = countCommonSubstrings(s1, s2);
        System.out.println( count);
    }
}    
