package Week04.EX;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(reverse2(s));
        
    }

    static String reverse(String str){
        String temp = "" ;
        for (int i = str.length() - 1; i >= 0 ; i--){
            temp += str.charAt(i);
        }
        return temp;
    }

    static String reverse2(String str){
        char[] chars = str.toCharArray();
        int len = chars.length;
        for(int i = 0; i<len/2 ; i++){
            char tmp = chars[i];
            chars[i] = chars[len - i - 1];
            chars[len - i - 1] = tmp;
        }
        return new String(chars);
    }

    private static String reverse3(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    
    private static String reverse4(String str){
        return new StringBuilder(str).reverse().toString();
    }

}