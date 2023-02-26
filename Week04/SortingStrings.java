import java.util.Arrays;
import java.util.Scanner;

public class SortingStrings {
    public static String f(String a) {
        char[] c = a.toCharArray();
        Arrays.sort(c);
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<c.length;i++) {
            res.append(c[i]);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String a = con.next();
        System.out.println(f(a));
        con.close();
    }
}
