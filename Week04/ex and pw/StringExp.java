import java.util.Arrays;
import java.util.Scanner;

public class StringExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // String a = "Baku";
        String[] c = a.split("");
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]);
            res.append(sb);
        }
        System.out.println(res);
    }
}
