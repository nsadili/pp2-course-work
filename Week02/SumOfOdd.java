package Week02;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int start, end;
        
        if (num1 <= num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        int sum = 0;
        for (int i = start + 1; i < end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers between " + start + " and " + end + ": " + sum);

        scanner.close();
    }
}
