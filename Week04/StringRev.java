import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            System.out.println(reverse2(input));
        }

    }

    static String reverse1(String str) {

        String res = " ";
        for( int i = str.length()-1; i >= 0; i--) 
            res += str.charAt(i);

        return res;
    }

    static String reverse2(String str) {

        char[] chars = str.toCharArray();

        int l = chars.length;
        for(int i=0; i < l / 2 ;i++) {
            char tmp = chars[i];
            chars[i] = chars[l-1-i];
            chars[l-1-1]=tmp;
        }
        return new String(chars);
    }
}