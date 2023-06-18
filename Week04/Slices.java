package Week04;

import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word = "SITE";
        printSlices(word);

    }

    public static void printSlices(String word) {
        
        for (int i = 0; i < word.length(); i++) {
            
            String slice = word.substring(0, i) + " " + word.substring(i);
            System.out.println(slice);
        }
       
        System.out.println(word);
    }
    
}
