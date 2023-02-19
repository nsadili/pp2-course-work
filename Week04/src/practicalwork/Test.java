package practicalwork;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        
        String str = scn.nextLine();
        
        String reversedStr = reverseString(str);
        
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseString(String str) {
    	
        StringBuilder sb = new StringBuilder(str);
        
        return sb.reverse().toString();
    }
}