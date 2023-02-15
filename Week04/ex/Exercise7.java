import java.util.Scanner;

//package Week04.ex;

public class Exercise7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        System.out.println(reverseString(string));

    }

    static String reverseString(String string) {
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }
        return result;
    }

    static String reverseStringByArray(String string) {
        char[] chars = string.toCharArray();
        var length = chars.length;
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
        return new String(chars);
    }

    static String reverseStringBySB(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    static String reverseStringBySB2(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
