import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = Math.abs(scan.nextInt());
        int count = 0;
        int sum = 0;
        int product = 1;
        int copy = n;
        
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            count++;
            n /= 10;
        }

        System.out.println("Sum of the digits of " + copy + ": " + sum);
        System.out.println("Product of the digits of " + copy + ": " + product);
        System.out.println("Average of the digits of " + copy + ": " + (float) sum / count);
        //System.out.println("Average of the digits of " + copy + ": " + sum * 1.0 / count);

    }
}
