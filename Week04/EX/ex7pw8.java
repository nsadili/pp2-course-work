package EX;
import java.util.Scanner;

public class ex7pw8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println(explodedString(input));
        scan.close();
    }

    static String reverseV1(String str){
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--){
            res += str.charAt(i);
        }
        return res;
}

    static String reverseV2(String str){
        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++){
            char tmp = chars[i];
            chars [i] = chars[len - 1 - i];
            chars [len - 1 - i] = tmp;
        }
        return new String(chars);
    }

    static String reverseV3(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    static String reverseV4(String str){
        return new StringBuilder(str).reverse().toString();
    }

    private static String explodedString(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                sb.append(str.charAt(j));
            }
        }
        return sb.toString();
    }
}

