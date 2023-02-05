import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        int sum = 0, prod = 1, cnt = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            prod *= digit;
            cnt++;
            num /= 10;
        }

        int avg = sum / cnt;
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + prod);
        System.out.println("Average of digits: " + avg);
    }
}
