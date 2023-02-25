import java.util.Arrays;
import java.util.Scanner;
/*
1. Characters are actually integers, check this out:

System.out.println((char)(65));

it will print 'A', because 'A' is 65th character in ASCII table.

2. We will convert String into char array and sort it.
char[] m = a.toCharArray();
Arrays.sort(m);
 */
public class Task9Ex04 {
    public static String f(String a) {
        char[] m = a.toCharArray();
        Arrays.sort(m);
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<m.length;i++) {
            res.append(m[i]);
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
