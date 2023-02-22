package Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean findAnagram(String s1, String s2) {
        char c1 [] = s1.toCharArray();
        char c2 [] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        s1 = c1.toString();
        s2 = c2.toString();
        if(Arrays.equals(c1, c2)) return true;
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(findAnagram(s1, s2));
        }
        
    }
}
