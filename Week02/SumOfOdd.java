import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = input.nextInt();

        System.out.print("Enter your first number : ");
        var b = input.nextInt();
        
        for (int i = a + 1; i < b; i++) {
            if (i % 2 != 0) {
                sum = i + sum;
            }

        }

        System.out.print("Sum of odd numbers between " + a + " and " + b + " is " + sum);
    }
}