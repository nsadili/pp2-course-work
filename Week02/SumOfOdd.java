import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter another number: ");
        int num2 = input.nextInt();
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of odd numbers between " + num1 + " and " + num2 + " is: " + sum);
    }
}

