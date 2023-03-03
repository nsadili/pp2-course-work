package Week02.src;

import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num < 0) {
            System.out.println("negative");
        } else if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println(" (0)");
        }
    }
}
