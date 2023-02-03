package Week02;

import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the size of the pattern");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) System.out.print("* ");
                else System.out.print("# ");
            }
            System.out.println("");
        }
    }
}
