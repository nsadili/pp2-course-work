package Week04;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1=sc.nextLine();

        System.out.println("Enter second String: ");
        String s2=sc.nextLine();
        System.out.println(areAnagrams(s1, s2));

    }

    public static boolean areAnagrams(String str1, String str2) {
        
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
    
        
        char[] str1Chars = str1.toCharArray();
        Arrays.sort(str1Chars);
        String sortedStr1 = new String(str1Chars);
    
        char[] str2Chars = str2.toCharArray();
        Arrays.sort(str2Chars);
        String sortedStr2 = new String(str2Chars);
    
        return sortedStr1.equals(sortedStr2);
    }
   

}
