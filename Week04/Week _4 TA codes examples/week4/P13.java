package week04;

import java.util.Scanner;

// Simple substring problem. Just divide string into two parts: 0 ... i-1 and i ... end
public class P13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        for(int i=1;i<a.length();i++) {
            System.out.println(a.substring(0, i) + " " + a.substring(i));
        }
        scan.close();
    }
}