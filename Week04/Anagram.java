import java.util.Scanner;

public class Anagram {
    public static boolean anagrams(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        int[] cnt = new int[26];
        int len = string1.length();

        for (int i = 0; i <= len - 1; i++) {
            cnt[string1.charAt(i) - 'a']++;
            cnt[string2.charAt(i) - 'a']--;
        }

        for (int count : cnt) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Please, enter the second string: ");
        String string2 = scanner.nextLine();
        boolean anagrams = anagrams(string1, string2);
        System.out.println(anagrams);
    }
}