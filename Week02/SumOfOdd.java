package Week02;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNum = scanner.nextInt();

        // Swap the values if the first number is greater than the second number
        if (firstNum > secondNum) {
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
        }

        int sum = 0;
        for (int i = firstNum + 1; i < secondNum; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("The sum of the odd numbers between " + firstNum + " and " + secondNum + " is " + sum);
    }
}

