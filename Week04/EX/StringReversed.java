import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(reverseV1(input));
        System.out.println(reverseV2(input));
        String res1= new StringBuilder(input).reverse().toString();
        System.out.println(res1);

    }
    static String reverseV1(String str){
        String res = "";
        for(int i=str.length()-1;i>=0;i--){
            res+= str.charAt(i);
        }
        return res;

    }
    static String reverseV2(String str) {
        char[] chars =str.toCharArray();
        int len =chars.length;
        for(int i =0; i<len/2; i++) {
            char temp= chars[i];
            chars[i]=chars[len-1-i];
            chars[len-1-i]=temp;
        }
        return new String(chars);
    }
}
