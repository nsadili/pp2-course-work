package Week04.ex07;

import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        System.out.println(reverseV3(input));
    }
    static String reverseV3(String str){
        char[] chars = str.toCharArray(); 
        int len = chars.length;
        for (int i = 0 ; i < len / 2; i++) {
            char tmp = chars[i];
            chars [i] = chars[len - 1 - i];
            chars [len - 1 - i] = tmp;
        }
        return new String(chars);
    }
    static String reverseV4(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
