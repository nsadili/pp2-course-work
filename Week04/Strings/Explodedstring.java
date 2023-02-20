package Week04.Strings;

import java.util.Scanner;

public class Explodedstring {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(exploded(str));
    }

    private static String exploded(String str) {
        String reversedString = "";
        for (int i = 0; i < str.length(); i++) {
            reversedString += str.substring(0, i + 1);
        }
        return reversedString;
    }

}


