import java.util.Scanner;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int[] charCounts = new int[26]; //only lowercase letters

        for (int i = 0; i < str1.length(); i++) {
            charCounts[str1.charAt(i) - 'a']++;
            charCounts[str2.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        sc.close();

        boolean areAnagrams = areAnagrams(str1, str2);
        System.out.println(areAnagrams);
    }
}
