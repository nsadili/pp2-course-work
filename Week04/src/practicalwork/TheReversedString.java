package practicalwork;

import java.util.Scanner;

public class TheReversedString {
    public static void main(String[] args) {
    	
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        
        String str = scn.nextLine();
        
        String reversedString = reverseString(str);
        
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String str) {
    	
        StringBuilder sb = new StringBuilder(str);
        
        return sb.reverse().toString();
    }
}