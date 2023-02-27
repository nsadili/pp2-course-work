package Week04;

import java.util.Scanner;

public class Slices {

    public static void slices(String input) {
        String[] split = input.split("");
        for (int i = 1; i < split.length; i++) {
            System.out.println(input.substring(0, i) + " " + input.substring(i, split.length));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String input = scanner.nextLine();
        slices(input);
        scanner.close();
    }
}