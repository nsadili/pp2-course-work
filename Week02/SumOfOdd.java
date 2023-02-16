import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();

        sc.close();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int sum = 0;
        for (int i = a + 1; i < b; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println("The sum of the odd numbers between " + a + " and " + b + " is " + sum);
    }
}
