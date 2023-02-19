import java.util.Scanner;

public class Explodestr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] s = str.toCharArray();
        StringBuilder sa = new StringBuilder();
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            sa.append(s[i]);
            x.append(sa);
        }
        System.out.println(x);
    }
}
