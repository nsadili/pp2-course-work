package practicalworks;

import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

