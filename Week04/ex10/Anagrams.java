package Week04.ex10;

import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        if (areAnagrams(input1, input2)) {
            System.out.println(input1 + " and " + input2 + " are anagrams!");
        } else {
            System.out.println(input1 + " and " + input2 + " are not anagrams!");
        }
        sc.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
    
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
    
        return Arrays.equals(chars1, chars2);
    }
    
}
