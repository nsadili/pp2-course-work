package Week04.pw;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to explode.");
        System.out.println(explodeString(sc.nextLine()));
    }

    public static String explodeString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) sb.append(str.substring(0, i));
        return sb.toString();
    }
}
