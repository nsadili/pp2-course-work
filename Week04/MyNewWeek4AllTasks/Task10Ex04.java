import java.util.Arrays;
import java.util.Scanner;
/*
Just like in P9, we will use char array versions of strings
and use another Arrays method called equals(a,b)

this method checks all elements one by one and gives response either if arrays are equal or not.
 */
public class Task10Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        System.out.println(f(a,b));
        scan.close();
    }

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
        // or you can just write
        // return Arrays.equals(x,y);
    }
}
