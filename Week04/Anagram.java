package week04;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean func(String x, String y) {
        char[] a = x.toCharArray();
        char[] b = y.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b) == true) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(func(a,b));
        sc.close();
    }
}
