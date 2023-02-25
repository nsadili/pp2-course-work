package Week04.Strings.pw;
import java.util.Scanner;
public class Slices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        for(int i=1;i<a.length();i++) {
            System.out.println(a.substring(0, i) + " " + a.substring(i));
        }
        scan.close();
    }
}
