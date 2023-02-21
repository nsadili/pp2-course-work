import java.util.Scanner;

public class StringReversed {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(reverseV1(input));
    }

    static String reverseV1(String string) {
        String res = "";
        for (int j = string.length() - 1; j >= 0; j--) {

            res += string.charAt(j);
        }
        return res;
    }

    static String reverseV2(String string) {

        char[] chars = string.toCharArray();

        int len = chars.length;
        for (int j = 0; j < chars.length / 2; j++) {

            char tmp = chars[j];
            chars[j] = chars[len - 1 - j];
            chars[len - 1 - j] = tmp;

        }
        return new String(chars);

    }

    static String reverseV3(String string) {

        StringBuilder strb = new StringBuilder();
        for (int j = string.length() - 1; j >= 0; j--) {
            strb.append(string.charAt(j));
        }
      
        return new StringBuilder(string).reverse().toString();
    }
}
