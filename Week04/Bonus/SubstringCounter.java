package Bonus;

public class SubstringCounter {
    public static int countSameSubstrings(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String substr1 = s1.substring(i, j);
                if (s2.contains(substr1) && substr1.length() > count) {
                    count = substr1.length();
                }
            }
        }
        return count;
    }
    
    public static void printSameSubstrings(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String substr1 = s1.substring(i, j);
                if (s2.contains(substr1)) {
                    System.out.println(substr1);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "abcxxfga";
        int count = countSameSubstrings(s1, s2);
        System.out.println("Number of same substrings: " + count);
        System.out.println("Same substrings: ");
        printSameSubstrings(s1, s2);
    }
}

