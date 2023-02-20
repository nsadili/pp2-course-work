package Week04.pw;

import java.util.Scanner;

public class Substring{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = scn.nextLine(); 
        System.out.println("Please enter a substring to find:");
        String sub = scn.nextLine(); 
        int index = isSubstring(str, sub); 
        if (index == -1) { 
            System.out.println(sub + " is not a substring of " + str);
        } else {
            System.out.println(sub + " is a substring of " + str + " at index " + index);
        }
    }

    public static int isSubstring(String str, String sub) {
        for (int i = 0; i < str.length(); i++) {
            if (sub.length() > str.length() - i) return -1; 
            if (str.substring(i).startsWith(sub)) return i; 
        }
        return -1; 
    }
}
