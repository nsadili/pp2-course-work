package Week07;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countLetters(str));
    }

    public static int countLetters(String str) {
        int count = 0;
        char[] array = str.toCharArray();
        for (char x: array) {
            if (Character.isAlphabetic(x)) count++;
        }
        return count;
    }
}
