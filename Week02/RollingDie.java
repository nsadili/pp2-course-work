import java.util.Scanner;

public class RollingDie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        int product = 1;
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            count++;
            num = num / 10;
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
        System.out.println("Average is: " + (double) sum / count);
    }
}

