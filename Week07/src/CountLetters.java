import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] cnt = new int[26];
        Scanner sc = new Scanner(System.in);

        try {
            String str = sc.nextLine();
            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    cnt[ch - 'a']++;
                }
            }

            for (int i = 0; i < cnt.length; i++) {
                if (cnt[i] != 0) {
                    System.out.println((char) ('a' + i) + ": " + cnt[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } 
    }
}

