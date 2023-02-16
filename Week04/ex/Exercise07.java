package Week04.ex;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.length() == 0) {
            System.out.println("Please provide an input.");
            return;
        }
        System.out.println(reverse(input));
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) sb.append(str.charAt(i));
        return sb.toString();
    }
}
