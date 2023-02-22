package Strings.pw;
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        String sub = scan.nextLine();

        substring(st, sub);
    }

    public static void substring(String a, String b) {
        StringBuilder stx = new StringBuilder();
        String sum = "";
        int n = a.length();
        int m = b.length();
        for (int j = n - m; j >= 0; j--) {
            stx.setLength(0); // reset the StringBuilder for each iteration
            for (int i = j; i < j + m; i++) {
                stx.append(a.charAt(i));
            }
            String substring = stx.toString();
            if (b.equals(substring)) {
                System.out.print(substring.length()-1);
                return;
            }
        }
        System.out.print("-1");
    }
}
