package Week04;

import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input: ");
        String word = sc.nextLine();
        slices(word);
    }

    public static void slices(String word) {
        String[] split = word.split("");
        for (int a = 1; a < split.length; a++) {
            System.out.println(word.substring(0, a) + " " + word.substring(a, split.length));
        }
    }
}