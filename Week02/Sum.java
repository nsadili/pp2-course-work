package taghi_mammadov.week_02;

import java.util.Scanner;

public class Sum {
    public static void main(String[] aStrings){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input the first integer: ");
            int a = sc.nextInt();

            System.out.println("Input the second integer: ");
            int b = sc.nextInt();

            System.out.println(a + " + " + b + " = " + (a+b));
        }



    }
}
