package Week02.src;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int p = 1;
        int count = 0;
        int digit;
        if (n == 0) {
            s = 0;
            p = 0;
            count = 1;
        }
        if (n < 0) {
            n = -n;
        }
        while (n > 0) {
            digit = n % 10;
            s = s + digit;
            p = p * digit;
            count++;
            n = n / 10;
        }
        System.out.println("Sum: " + s);
        System.out.println("Product: " + p);
        System.out.println("Average: " + 1.0 * s / count);
    }
}
