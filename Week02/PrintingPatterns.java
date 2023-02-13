package Week02;

import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the size of the pattern");
        int a = sc.nextInt();
        for (int b = 0; b < a; b++) {
            for (int c = 0; c < a; c++) {
                if ((b + c) % 2 == 0) System.out.print("* ");
                else System.out.print("# ");
            }
            System.out.println("");
        }
    }
}