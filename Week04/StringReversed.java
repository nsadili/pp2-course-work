package Week04;

import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the string to reverse: ");
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }

    public static StringBuilder reverse(String str) {
        StringBuilder sb = new StringBuilder();
        String[] split = str.split("");
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]);
        }
        return sb;
    }
}
