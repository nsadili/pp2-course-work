package Week04.ex13;

import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Plese enter the word you want to slice: ");
        String word = sc.nextLine();

        System.out.println("The sliced version of the given word " + word + " is: ");
        printSlices(word);
        sc.close();
    }

    public static void printSlices(String word) {
        for (int i = 1; i < word.length(); i++) {
            String slice = word.substring(0, i) + " " + word.substring(i);
            System.out.println(slice);
        }
        System.out.println(word);
    }
}
