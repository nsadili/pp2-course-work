package practicalwork;

import java.util.Scanner;

public class TheSlicer {
    public static void main(String[] args) {
    	
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        
        String word = scn.nextLine();

        for (int i = 1; i < word.length(); i++) {
        	
            String slice1 = word.substring(0, i);
            
            String slice2 = word.substring(i);
            
            System.out.println(slice1 + " " + slice2);
        }
        
        System.out.println(word);
    }
}