package practicalworks;

import java.util.Scanner;

public class LettersCount {
	
    public static void main(String[] args) {
    	
        Scanner scn = new Scanner(System.in);
        
        String str = scn.nextLine();
        
        System.out.println(countLetters(str));
    }
    public static int countLetters(String str) {
    	
        int count = 0;
        
        char[] array = str.toCharArray();
        for (char x: array) {
            if (Character.isAlphabetic(x)) count++;
        }
        
        return count;
    }
}