import java.util.Scanner;

public class StringReversed {
    public static void main( String args[]) {
Scanner scan = new Scanner(System.in);

String input = scan.next(); 

System.out.println(reverse1(input));

    }
    static String reverse1(String str) {
        String result =" ";
    for ( int i = str.length() - 1; i>= 0; i--) {
result += str.charAt(i);
    }
    return result;

    }
}
