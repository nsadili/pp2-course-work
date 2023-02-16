package Week04.pw;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Please enter the second string:");
        String str2 = sc.nextLine();
        System.out.println(areAnagrams(str1, str2));
    }

    public static boolean areAnagrams(String str1, String str2) {
        return sortString(str1).trim().equalsIgnoreCase(sortString(str2).trim());
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
