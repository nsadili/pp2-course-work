package week04;

import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        printSlices(word);
    }
    
    public static void printSlices(String word) {
        int n = word.length();
        
        for (int i = 1; i < n; i++) {
            String slice1 = word.substring(0, i);
            String slice2 = word.substring(i);
            System.out.println(slice1 + " " + slice2);
        }
    }
}
