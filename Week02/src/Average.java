package Week02.src;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int count = 0;
        int digit;
        while (n != 0) {
            digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            count++;
            n = n / 10;
            if (n == 0) {
                break;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + 1.0 * sum / count);
    }
}
