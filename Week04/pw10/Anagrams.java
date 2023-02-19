package Week04.pw10;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean compare(String str1, String str2){
        //Make strings standart
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str1.length()) {
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();
        scan.close();
        String notString = compare(str1, str2)? "" : "NOT ";
        System.out.printf("Strings are %sanagrams\n", notString);
    }
}
