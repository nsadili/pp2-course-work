package Week04.pw08;

import java.util.Scanner;

public class ExplodedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        System.out.println(explodedString(input));
    }

    private static String explodedString(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                sb.append((str.charAt(j)));
            }
        }
        return sb.toString();
    }

}
