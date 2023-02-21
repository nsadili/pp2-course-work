package Week04.ex07;

import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverse1(s));
        System.out.println(reverse2(s));
        System.out.println(reverse3(s));
        sc.close();
    }

    private static String reverse1 (String s) {
        String temp = "";

       for (int i = s.length() - 1; i >= 0; i-- ) {
            temp += s.charAt(i);
       } 
       return temp;
    }

    private static String reverse2 (String s) { // memory efficient
        char[] chars = s.toCharArray();

        int l = chars.length;

        for (int i = 0; i < l / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[l - 1 - i];
            chars[l - 1 - i] = temp;
        }

        return new String (chars);
    }

    private static String reverse3 (String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i-- ) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
