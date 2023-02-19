package Week04;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        StringBuilder res = new StringBuilder();
        char[] s = string.toCharArray();
        for (int i = s.length - 1; i >= 0; i--) {
            res.append(s[i]);
        }
       System.out.println(res);
    }
}
