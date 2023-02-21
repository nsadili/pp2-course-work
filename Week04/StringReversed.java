package Week04;

import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }

    public static StringBuilder reverse(String str) {
        StringBuilder ab = new StringBuilder();
        char[] split = str.toCharArray();
        for (int c = split.length - c; i >= 0; c--) {
            ab.append(split[c]);
        }
        return ab;
    }
}