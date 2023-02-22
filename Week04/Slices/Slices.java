package Slices;

import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int x = s.length();
            for (int i = 0; i < x; i++) {
                System.out.println(s.substring(0, i) + " " + s.substring(i, x));
            }
        }
    }
}
