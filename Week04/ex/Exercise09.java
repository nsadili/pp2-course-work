package Week04.ex;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.length() == 0) {
            System.out.println("Please provide an input.");
            return;
        }
        System.out.println(sortString(input));
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char tmp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = tmp;
                }
            }
        }
        return (new String(chars)).trim();
    }
}
