package Week04.Strings.pw;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean f(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y) == true) {
            return true;
        }
        else {
            return false;
        }
  
    }
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String a = con.next();
        String b = con.next();
        System.out.println(f(a,b));
        con.close();
    }
}
