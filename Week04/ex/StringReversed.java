import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s =sc.nextLine();

    System.out.println(reverse(s));
    }


    private static String reverse (String str) {

        String res="";

        for(int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }

        return res;
    }
}