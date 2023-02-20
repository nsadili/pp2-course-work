import java.util.Scanner;
import java.util.Arrays;

public class areAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();
        
        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
        
        scanner.close();
    }
    
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // convert the strings to character arrays
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        
        // sort the character arrays
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        
        // compare the sorted character arrays
        for (int i = 0; i < s1Chars.length; i++) {
            if (s1Chars[i] != s2Chars[i]) {
                return false;
            }
        }
        
        return true;
    }
}
