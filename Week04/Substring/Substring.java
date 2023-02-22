package Substring;

import java.util.Scanner;


public class Substring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String sub = sc.nextLine();
            int index = s.indexOf(sub);
            System.out.println(index);
        }

    }
}
