package Week02;
import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = sc.nextInt();

            int start = Math.min(num1, num2);
            int end = Math.max(num1, num2);
            int sum = 0;

            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }

            System.out.printf("The sum of odd numbers between %d and %d is %d.", start, end, sum);
        }
    }
}

