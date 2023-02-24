package EX;

import java.util.Scanner;

public class SortingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String sortedStr = sortString(str);

        System.out.println(str);
        System.out.println(sortedStr);
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        return new String(chars);
    }
}
