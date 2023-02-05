import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a, b, sum = 0;
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();

        scanner.close();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) sum += i;
        }

        System.out.println("Sum of the odd numbers in between those numbers: " + sum);
    }
}
