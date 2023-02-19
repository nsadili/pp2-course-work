package Week04.pw;

import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an input: ");
        String word = input.nextLine();
        slices(word);
    }

    public static void slices(String word) {
        String[] split = word.split("");
        for (int i = 1; i < split.length; i++) {
            System.out.println(word.substring(0, i) + " " + word.substring(i, split.length));
        }
    }
}